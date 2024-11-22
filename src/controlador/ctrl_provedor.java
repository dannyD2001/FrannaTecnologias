package controlador;

import conexion.conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import modelo.Provedor;

/**
 *
 * @author Danny Dominguez
 */
public class ctrl_provedor {
    Connection con = null;
    PreparedStatement ps;
    ResultSet rs;
    
    public boolean RegistarProvedor(Provedor prov){
        String sql = "INSERT INTO PROVEDOR(nombre, telefono, ciudad, referencia) VALUES(?, ?, ?, ?)";
        try {
            con = conexion.conectar();
            ps = con.prepareStatement(sql);
            
            ps.setString(1, prov.getNombre());
            ps.setString(2, prov.getTelefono());
            ps.setString(3, prov.getCiudad());
            ps.setString(4, prov.getReferencia());
            ps.execute();
            return true;
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e+"Error al registar Provedor");
            return false;
        }
    }
    //Para la buscar Provedor
    public void bucarProvedor(JComboBox provedorComboBox){
         String sql ="SELECT id_provedor, nombre FROM PROVEDOR";
        try {
             // Verificar si el JComboBox no es nulo y vaciarlo
            provedorComboBox.removeAllItems(); // Limpiar el JComboBox*/
            provedorComboBox.addItem("--Seleccionar--"); // Agregar opción "vacía" o inicial*/
            con = conexion.conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                int idProvedor = rs.getInt("id_provedor");
                String nombreP = rs.getString("nombre");
                Provedor provedor = new Provedor(idProvedor, nombreP);
                provedorComboBox.addItem(provedor);                            
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }
     public int obtenerIdProveedorPorNombre(String nombreProveedor) {
        int idProveedor = -1; // Inicializamos el id del proveedor        
        try {
            con = conexion.conectar(); // Conexión a la base de datos
            // Consulta SQL para obtener el ID del proveedor
            ps = con.prepareStatement("SELECT id_provedor FROM PROVEDOR WHERE nombre = ?");
            ps.setString(1, nombreProveedor);
            rs = ps.executeQuery();
            if (rs.next()) {
                idProveedor = rs.getInt("id_provedor"); // Obtenemos el ID
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        } finally {
            try {
                if (rs != null) rs.close();
                if (ps != null) ps.close();
                if (con != null) con.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.toString());
            }
        }
        return idProveedor; // Retornar el ID del proveedor o -1 si no lo encontró
    }
     // sirve para la de los provedores activos
    // Clase para contener tanto los datos como el mes actual
    public class DatosGrafico {
    private List<Object[]> datos;
    private String mesActual;

    public DatosGrafico(List<Object[]> datos, String mesActual) {
        this.datos = datos;
        this.mesActual = mesActual;
    }

    public List<Object[]> getDatos() {
        return datos;
    }

    public String getMesActual() {
        return mesActual;
    }
    }  
    public DatosGrafico obtenerDatosGrafico_c() {
    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    String mesActual = "";  // Variable para almacenar el mes actual
    List<Object[]> datos = new ArrayList<>();
    try {      
         // Obtener la conexión a la base de datos
        con = conexion.conectar();
        // Ejecutar el comando para establecer el idioma en español
        String setLanguageSql = "SET lc_time_names = 'es_ES';";
        ps = con.prepareStatement(setLanguageSql);
        ps.execute(); // Ejecutar el comando SET
        ps.close(); // Cerramos el PreparedStatement después de ejecutarlo

        // Consulta SQL para obtener los datos
        String selectSql = "SELECT p.nombre AS nombre_proveedor, " +
                           "COUNT(c.folio_compra) AS numero_compras, " +
                           "MONTHNAME(CURDATE()) AS mes_actual " +
                           "FROM provedor p " +
                           "LEFT JOIN compra c ON p.id_provedor = c.id_provedor " +
                           "AND MONTH(c.fecha_compra) = MONTH(CURDATE()) " +
                           "AND YEAR(c.fecha_compra) = YEAR(CURDATE()) " +
                           "GROUP BY p.nombre " +
                           "ORDER BY numero_compras DESC;";

        ps = con.prepareStatement(selectSql);
        rs = ps.executeQuery(); // Ejecutar la consulta SELECT

        while (rs.next()) {
            String nombre_provedor = rs.getString("nombre_proveedor");
            int numero_compras = rs.getInt("numero_compras");
            mesActual = rs.getString("mes_actual"); // Obtener el mes actual
            datos.add(new Object[]{nombre_provedor, numero_compras});
        }
    } catch (SQLException e) {
        e.printStackTrace();
    } finally {
        try {
            if (rs != null) rs.close();
            if (ps != null) ps.close();
            if (con != null) con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    // Retorna tanto los datos como el mes actual
    return new DatosGrafico(datos, mesActual);
    }
    //consulta para obtener infromacion del prove para principal
    public List Consultaprovedor(){
        List <Provedor> listaprove = new ArrayList();
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "SELECT id_provedor, nombre, telefono, ciudad from provedor";
        try {
            con = conexion.conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                Provedor prove = new Provedor();
                prove.setId_provedor(rs.getInt("id_provedor"));
                prove.setNombre(rs.getString("nombre"));
                prove.setTelefono(rs.getString("telefono"));
                prove.setCiudad(rs.getString("ciudad"));
                listaprove.add(prove);
            }
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"error al conslutar Provedor");
        }finally{
            try {
                if(rs != null) rs.close();
                if(ps != null) ps.close();
                if(con != null) con.close();
            } catch (SQLException e) {
            }
        }
        return listaprove;
    }
}

