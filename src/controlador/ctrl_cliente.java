package controlador;
import conexion.conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JComboBox;

import javax.swing.JOptionPane;
import modelo.Cliente;

public class ctrl_cliente {
    
    public boolean registrarCliente(Cliente object){
        Connection con = null;
        //consultas-actualizacion,eliminacion,modificacion
        PreparedStatement ps = null;
        String sql="INSERT INTO CLIENTE (nombre_cliente, apellido_p, telefono, ciudad) VALUES(?,?,?,?)" ;        
        try {
            con = conexion.conectar();
            ps = con.prepareStatement(sql);
            ps.setString(1, object.getNombre_cliente());
            ps.setString(2, object.getApellido_p());
            ps.setString(3, object.getTelefono());
            ps.setString(4, object.getCiudad());
            int result = ps.executeUpdate();
            // Verificar si la inserción fue exitosa
            if (result > 0) {
                JOptionPane.showMessageDialog(null, "Cliente registrado con éxito");
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Error al registrar el cliente");
                return false;
            }                    
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al registar al cliente a la BD");
            return false;
        }finally{
            try {
                if(ps != null) ps.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "erro al cerrar el PreparedStement");
            }
            try {
                if(con != null) con.close();
                //JOptionPane.showMessageDialog(null, "Conexion cerrada");//borrar prueba
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error al cerrar la conexion");
            }
        }
    }
    //compra diferenci entre materia y este 
    //para consulta del cliente existente
    public boolean existeCliente(String telefono){
        Connection con = null;
        ResultSet rs = null;
        PreparedStatement ps = null;
        boolean respuesta = false;
        // Consulta SQL correcta
        String sql = "SELECT telefono FROM cliente WHERE telefono = ?";
        //Statement st = null ;
        
        try {
            con = conexion.conectar();
            ps = con.prepareStatement(sql);
            ps.setString(1, telefono);
            rs = ps.executeQuery();
            if (rs.next()) {
                respuesta = true; // Cambia a true si el cliente existe
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en realiza la consulta");
        }finally{
            try {
                if(rs != null)rs.close();                
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Erro al cerrar el ResultSet");
            }
            try {
                if(ps != null) ps.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error al cerrar al PreparedStatement");
            }
            try {
                if(con != null) con.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error al cerrar la Conexion");
            }                  
        }
         return respuesta;
    }
    //para buscar cliente
    public void bucarCliente(JComboBox provedorComboBox){
        Connection con = null;
        ResultSet rs = null;
        PreparedStatement ps = null;
        String sql ="SELECT id_cliente, nombre_cliente FROM CLIENTE";         
        try {
             // Verificar si el JComboBox no es nulo y vaciarlo
            provedorComboBox.removeAllItems(); // Limpiar el JComboBox*/
            provedorComboBox.addItem("--Seleccionar--"); // Agregar opción "vacía" o inicial*/
            con = conexion.conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                int idCliente = rs.getInt("id_cliente");
                String nombreC = rs.getString("nombre_cliente");
                Cliente provedor = new Cliente(idCliente, nombreC );
                provedorComboBox.addItem(provedor);                            
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }
    //para buscar
    public int obtenerIdClientePorNombre(String nombreCliente) {
        Connection con = null;
        ResultSet rs = null;
        PreparedStatement ps = null;
        int idCliente = -1; // Inicializamos el id del proveedor        
        try {
            con = conexion.conectar(); // Conexión a la base de datos
            // Consulta SQL para obtener el ID del proveedor
            ps = con.prepareStatement("SELECT id_cliente FROM CLIENTE WHERE nombre_cliente = ?");
            ps.setString(1, nombreCliente);
            rs = ps.executeQuery();
            if (rs.next()) {
                idCliente = rs.getInt("id_cliente"); // Obtenemos el ID
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
        return idCliente; // Retornar el ID del proveedor o -1 si no lo encontró
    }
    
}
