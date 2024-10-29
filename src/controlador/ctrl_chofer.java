package controlador;

import conexion.conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import modelo.Chofer;
import modelo.Vehiculo;

public class ctrl_chofer {
    //para consultar
    public void ConsultarVehiculo(JComboBox placaComboBox) {
    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    String sql = "SELECT placa FROM VEHICULO";

    try {
        // Establecer la conexión
        con = conexion.conectar();
        ps = con.prepareStatement(sql);
        rs = ps.executeQuery();

        // Iterar sobre los resultados
        while (rs.next()) {
            String placa = rs.getString("placa");
            Vehiculo coche = new Vehiculo(placa);
            placaComboBox.addItem(coche); // Añadir chofer al comboBox
        }

    } catch (SQLException e) {
        // Manejo de errores en caso de excepción SQL
        JOptionPane.showMessageDialog(null, e.toString());

    } finally {
        // Cerrar los recursos en el bloque finally
        try {
            if (rs != null) rs.close();   // Cerrar ResultSet
            if (ps != null) ps.close();   // Cerrar PreparedStatement
            if (con != null) con.close(); // Cerrar conexión
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al cerrar la conexión: " + e.toString());
        }
    }
    }
    
    public boolean existeTelefono(String telefono){
        boolean respuesta = false;
        String sql = "SELECT telefono FROM chofer WHERE telefono = ?";
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = null;
        try {
            con = conexion.conectar();
            ps = con.prepareStatement(sql);
            ps.setString(1, telefono);  // Asignar el valor de nombre al marcador de parámetro "?"
            rs = ps.executeQuery();
            if (rs.next()) {
            respuesta = true;  // Si hay un resultado, significa que existe el material
        }
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al consultar en Chofer")
                    ;
        }finally {  
            try {
                if (rs != null) rs.close();
                if (ps != null) ps.close();
                if (con != null) con.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error al cerrar recursos");
            }
        }
        return respuesta;   
    }
    
    public boolean RegistrarChofer(Chofer chofer){
        Connection con = null;
        //consultas-actualizacion,eliminacion,modificacion
        PreparedStatement ps = null;
        String slq = "INSERT INTO chofer(telefono, nombre, apellido_p, tipo_chofer, placa) VALUES(?,?,?,?,?)";
        try {
            con = conexion.conectar();
            ps = con.prepareStatement(slq);
            ps.setString(1, chofer.getTelefono());
            ps.setString(2, chofer.getNombre());
            ps.setString(3, chofer.getApellido_p());
            ps.setString(4, chofer.getTipo_chofer());
            ps.setString(5, chofer.getPlaca());     
            int result = ps.executeUpdate();
            // Verificar si la inserción fue exitosa
            if (result > 0) {
                JOptionPane.showMessageDialog(null, "Chofer Registrado con éxito");
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Error al Registrar el Chofer");
                return false;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al registar el chofer en la BD");
            return false;
        }finally{
            try {
                if(ps != null) ps.close();
            } catch (SQLException e) {
            }
            try {
                if(con != null)con.close();
            } catch (SQLException e) {
            }
        }        
    }
    
    //para buscar el chofer en venta
    public void bucarChofer(JComboBox chofer){
        Connection con = null;
        ResultSet rs = null;
        PreparedStatement ps = null;
        String sql ="SELECT * FROM chofer";
        try {
            chofer.removeAllItems(); // Limpiar el JComboBox*/
            chofer.addItem("--Seleccionar--"); // Agregar opción "vacía" o inicial*/
            con = conexion.conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                String telefono = rs.getString("telefono");
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido_p");
                String tipo = rs.getString("tipo_chofer");
                String placa = rs.getString("placa");
                Chofer choofer = new Chofer(telefono, nombre, apellido, tipo, placa);
                chofer.addItem(choofer);                            
            }
            
        } catch (SQLException e) {
        }finally {
            // Close resources in reverse order of their opening
            try {
                if (rs != null) {
                    rs.close();
                }
                if (ps != null) {
                    ps.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException ex) {
                // Log any exception while closing resources
                System.err.println("Error closing resources: " + ex.getMessage());
            }
        }
    }
}
