package conexion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author Danny Dominguez
 */
public class conexion {
    // Constantes para los detalles de conexión //desactive el SLL porque ahora estoy en codificacion
    private static final String URL = "jdbc:mysql://localhost:3306/franna_tecnologias?serverTimezone=UTC&useSSL=false";
    private static final String USER = "root";
    private static final String PASSWORD = "";
    
    // Variable de conexión
    private static Connection enlazar = null;

    // Método para conectar a la base de datos
    public static Connection conectar() {
        try {
            // Establecer la conexión
            enlazar = DriverManager.getConnection(URL, USER, PASSWORD);
             //JOptionPane.showMessageDialog(null, "Conexion Exitosa");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e+/*e.getMessage() +*/" No fue prosible la Conexion");
        }
        return enlazar;
    }       

    public static class Conexion {

        public Conexion() {
        }
    }
}
