package controlador;
import conexion.conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelo.usuario;

/**
 *
 * @author Danny Dominguez
 */
public class ctrl_agregar_usuario {
    public boolean agregarUsuarios(usuario objecto) {
    boolean respuesta = false;
    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    try {
        con = conexion.conectar();
        
        // Verificar si el usuario ya existe
        ps = con.prepareStatement("SELECT COUNT(*) FROM USUARIO WHERE telefono = ?");
        ps.setString(1, objecto.getTelefono());
        rs = ps.executeQuery();
        rs.next();
        if (rs.getInt(1) > 0) {
            JOptionPane.showMessageDialog(null, "El telefono ya esta registrado");
            return false;
        }
        
        // Insertar nuevo usuario
        ps = con.prepareStatement("INSERT INTO USUARIO(telefono, nombre, apellido_p, apellido_m, contraseña, tipo_usuario) VALUES (?, ?, ?, ?, ?, ?)");
        ps.setString(1, objecto.getTelefono());  // Insertar teléfono como clave primaria
        ps.setString(2, objecto.getNombre());    // Insertar nombre
        ps.setString(3, objecto.getApellidoP()); // Insertar apellido paterno
        ps.setString(4, objecto.getApellidoM()); // Insertar apellido materno
        ps.setString(5, objecto.getContraseña()); // Insertar contraseña
        ps.setString(6, objecto.getTipo_usuario()); // Insertar tipo de usuario (empleado/administrador)
        int filasAfectadas = ps.executeUpdate();
        respuesta = filasAfectadas > 0;
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al agregar " + e.getMessage());
    } finally {
        try {
            if (rs != null) rs.close();
            if (ps != null) ps.close();
            if (con != null) con.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al cerrar recursos: " + e.getMessage());
        }
    }
    return respuesta;
    }      
}
       
