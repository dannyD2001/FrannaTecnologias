package controlador;

import conexion.conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
}
