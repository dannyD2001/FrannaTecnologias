package controlador;
import Util.AppContext;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import conexion.conexion;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import modelo.usuario;

public class ctrl_usuario {
    //para todos 
    Connection con = null;
    PreparedStatement ps;
    ResultSet rs; 
    Statement  st; 
    // Método para iniciar sesión
    public boolean loginUsuario(usuario objecto) {
        boolean respuesta = false;
        Connection con = conexion.conectar();
        
        // Usar PreparedStatement para evitar inyecciones SQL
        String sql = "SELECT telefono, nombre, contraseña, tipo_usuario, apellido_p, apellido_m  FROM usuario WHERE telefono = ? AND contraseña = ?";
        
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            // Establecer los parámetros del PreparedStatement
            ps.setString(1, objecto.getTelefono());
            ps.setString(2, objecto.getContraseña());
            
            // Ejecutar la consulta
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                objecto.setTelefono(rs.getString("telefono"));        //aca      // Asignar el ID
                objecto.setNombre(rs.getString("nombre"));      // Asignar el nombre
                // Si hay un resultado, actualizar el objeto usuario con el tipo de usuario
                objecto.setTipo_usuario(rs.getString("tipo_usuario"));
                objecto.setApellidoP(rs.getString("apellido_p"));
                objecto.setApellidoM(rs.getString("apellido_m"));
                respuesta = true;
                // Guardar el usuario actual en el contexto
                AppContext.setUsuarioActual(objecto);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al iniciar sesión: " + e.getMessage());
        }/**/finally {
            try {
                if (rs != null) rs.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error al cerrar ResultSet: " + e.getMessage());
            }

            try {
                if (ps != null) ps.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error al cerrar PreparedStatement: " + e.getMessage());
            }

            try {
                if (con != null) con.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error al cerrar la conexión: " + e.getMessage());
            }
        }
        return respuesta;
    }
    
    //obtenertelefono por nombre
    public String obtenerusuarioPorNombre(String telefonoo) {
    String telefono = null; // Inicializamos el id del proveedor

    try {
        con = conexion.conectar(); // Conexión a la base de datos

        // Consulta SQL para obtener el ID del usuario
        ps = con.prepareStatement("SELECT telefono FROM USUARIO WHERE nombre = ?");
        ps.setString(1, telefonoo);

        rs = ps.executeQuery();

        if (rs.next()) {
            telefono = rs.getString("telefono"); // Obtenemos el ID
            //telefono = rs.getInt("telefono"); // Obtenemos el ID
        if (rs.next()) { // Si hay otro resultado, significa que hay duplicados
                throw new SQLException("Se encontraron múltiples usuarios con el mismo nombre.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Usuario no encontrado.");
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
    return telefono; 
    }
    //para actualizar el ultimo acceso de cada usuario
    public boolean registrarUltimoAcceso(String telefono) {
        String sql = "UPDATE usuario SET ultimo_acceso = CURRENT_TIMESTAMP WHERE telefono = ?";
        try (Connection con = conexion.conectar();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, telefono); // Pasar el teléfono del usuario como parámetro
            int rows = ps.executeUpdate(); // Ejecutar la actualización

            return rows > 0; // Si se actualizó al menos una fila, retornar true

        } catch (SQLException e) {
            return false; // Retornar false si hubo algún error
        }
    } 
    //para el registro del acceso
    public boolean registrarInicioSesion(String telefono) {
    String sql = "UPDATE usuario SET inicio_sesion = CURRENT_TIMESTAMP WHERE telefono = ?";
    try (Connection con = conexion.conectar();
         PreparedStatement ps = con.prepareStatement(sql)) {

        ps.setString(1, telefono); // Pasar el teléfono del usuario
        int rows = ps.executeUpdate(); // Ejecutar la actualización
        return rows > 0; // Retornar true si se actualizó al menos una fila

    } catch (SQLException e) {
        e.printStackTrace();
        return false; // Retornar false si hubo un error
    }
    }
    //conuslta para la tabla acceso
    public List<usuario> ConsultaAcceso() {
    String sql = "SELECT nombre, apellido_p, apellido_m, inicio_sesion, ultimo_acceso FROM usuario";
    List<usuario> listaUsuarios = new ArrayList<>();
    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    try {
        con = conexion.conectar(); // Conectar a la base de datos
        ps = con.prepareStatement(sql); // Preparar la consulta
        rs = ps.executeQuery(); // Ejecutar la consulta

        // Recorrer el resultado de la consulta
        while (rs.next()) {
            usuario usuario = new usuario(); // Instancia de Usuario
            usuario.setNombre(rs.getString("nombre"));
            usuario.setApellidoP(rs.getString("apellido_p"));
            usuario.setApellidoM(rs.getString("apellido_m"));
            usuario.setInicio_sesion(rs.getString("inicio_sesion")); // Obtener la marca de tiempo
            usuario.setUltimo_acceso(rs.getString("ultimo_acceso")); // Obtener la marca de tiempo
            
            listaUsuarios.add(usuario); // Agregar usuario a la lista
        }
    } catch (SQLException e) {
        e.printStackTrace(); // Manejar errores
    } finally {
        // Cerrar los recursos
        try {
            if (rs != null) rs.close();
            if (ps != null) ps.close();
            if (con != null) con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    return listaUsuarios; // Retornar la lista de usuarios
    }


}
