package controlador;

import conexion.conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelo.Vehiculo;

public class ctrl_vehiculo {
    public boolean registrarVehiculo(Vehiculo auto){
        Connection con = null;
        //consultas-actualizacion,eliminacion,modificacion
        PreparedStatement ps = null;
        String slq = "INSERT INTO VEHICULO(placa, marca) VALUES(?,?)";
        try {
            con = conexion.conectar();
            ps = con.prepareStatement(slq);
            ps.setString(1, auto.getPlaca());
            ps.setString(2, auto.getMarca());
            int result = ps.executeUpdate();
            // Verificar si la inserción fue exitosa
            if (result > 0) {
                JOptionPane.showMessageDialog(null, "Vehiculo Registrado con éxito");
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Error al Registrar el Vehiculo");
                return false;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al registar el vehiculo en la BD");
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
    public boolean existePlaca(String placa) {
    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    boolean respuesta = false;  // Variable que indicará si la placa existe o no
    String sql = "SELECT placa FROM vehiculo WHERE placa = ?";  // Sin comillas alrededor de '?'
        try {
            con = conexion.conectar();
            // Preparar la consulta
            ps = con.prepareStatement(sql);
            // Asignar el valor del parámetro placa
            ps.setString(1, placa);
            // Ejecutar la consulta
            rs = ps.executeQuery();
            // Si existe algún resultado, significa que la placa ya está registrada
            if (rs.next()) {
                respuesta = true;               
            }
        } catch (SQLException e) {
        }finally {
        try {
            // Cerrar los recursos
            if (rs != null) rs.close();
            if (ps != null) ps.close();
            if (con != null) con.close();
        } catch (SQLException e) {
        }
    }
    // Retornar si la placa existe o no
    return respuesta;
    }  
}
