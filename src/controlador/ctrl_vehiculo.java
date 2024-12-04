package controlador;
import conexion.conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelo.Vehiculo;
public class ctrl_vehiculo {
    //Registro del vehiculo
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
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al registar el vehiculo en la BD");
            return false;
        }finally{
            try {
                if(ps != null) ps.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null,e.toString());
            }
            try {
                if(con != null)con.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null,e.toString());
            }
        }    
    }
    //CONSULTA DE SABER SI LA PLACA EXISTE DEL VEHICULO
    //EXCENCIAL PARA PODER COMPROBOR SI EXISTE Y DESPUES COMPROBAR EL CHOFER 
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
            JOptionPane.showMessageDialog(null,e.toString());
        }finally {
        try {
            // Cerrar los recursos
            if (rs != null) rs.close();
            if (ps != null) ps.close();
            if (con != null) con.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,e.toString());
        }
    }
    // Retornar si la placa existe o no
    return respuesta;
    }
    
    //ESTO ES DE CHOFER PERO LO ASIGNE ACA, PERO SIRVE PARA OBTNER LA 
    //LLAVE PRIMARRIA DE CHOFER Y CONSULTAR  SU PLACA
    public Long obtenerIdPorPlaca(String placa) {
    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    Long idChofer = null; // Valor predeterminado si no se encuentra el chofer

    try {
        // Obtener conexión a la base de datos
        con = conexion.conectar(); // Método para obtener la conexión
        
        // Crear la consulta SQL para buscar el chofer por placa
        String sql = "SELECT telefono_chofer FROM chofer WHERE placa = ?";
        ps = con.prepareStatement(sql);

        // Establecer el parámetro de la consulta
        ps.setString(1, placa);

        // Ejecutar la consulta y obtener el resultado
        rs = ps.executeQuery();

        // Si hay un resultado, obtener el ID del chofer
        if (rs.next()) {
            idChofer = rs.getLong("telefono_chofer"); // Asumiendo que quieres obtener el telefono_chofer, o puedes cambiar a otro campo
        }

    } catch (SQLException e) {
         JOptionPane.showMessageDialog(null,e.getMessage());
        
    } finally {
        // Cerrar recursos
        try {
            if (rs != null) rs.close();
            if (ps != null) ps.close();
            if (con != null) con.close();
        } catch (SQLException e) {
             JOptionPane.showMessageDialog(null,e.getMessage());
            
        }
    }    
    return idChofer; // Retornar el ID encontrado o -1 si no se encontró
    }
}
