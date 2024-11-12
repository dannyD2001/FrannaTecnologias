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
    //CONSULTA DEL PENDIENTE
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
    //PARA VERIFICAR SI EXISTE EL CHOFER
    //FUE UTILIZADO EN ADMINISTRAR_CHOFER
    public boolean existeTelefono(String telefono){
        boolean respuesta = false;
        String sql = "SELECT telefono_chofer FROM chofer WHERE telefono_chofer = ?";
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = null;
        try {
            con = conexion.conectar();
            ps = con.prepareStatement(sql);
            ps.setString(1, telefono);  
            rs = ps.executeQuery();
            if (rs.next()) {
            respuesta = true; 
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
    //PARA REGISTAR EL CHOFER UTILIZADO EN ADMINISTAR CHOFER Y EN VENTA
    public boolean RegistrarChofer(Chofer chofer){
        Connection con = null;
        PreparedStatement ps = null;
        String sql = "INSERT INTO chofer(telefono_chofer, nombre, apellido_p, tipo_chofer, placa) VALUES(?,?,?,?,?)";
        try {
            con = conexion.conectar();
            ps = con.prepareStatement(sql);
            ps.setString(1, chofer.getTelefono_chofer());
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
                 JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }        
    }
    
    //PARA LA BUSQUEDA DEL CHOFER EN VENTA-INTERNO, EN EL PANEL VISTA
    public void bucarChofer(JComboBox chofer){
        Connection con = null;
        ResultSet rs = null;
        PreparedStatement ps = null;
        String sql ="SELECT * FROM chofer where tipo_chofer = 'Interno'";
        try {
            chofer.removeAllItems(); // Limpiar el JComboBox*/
            chofer.addItem("--Seleccionar--"); // Agregar opción "vacía" o inicial*/
            con = conexion.conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                String telefono = rs.getString("telefono_chofer");
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
    // Verificar si el chofer externo ya está registrado en la base de datos
public Chofer buscarChoferExternoPorTelefono(String telefono) {
    Chofer chofer = null;
    if (telefono == null || telefono.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Error: El número de teléfono no puede ser nulo o vacío.");
        return null; // Retornar null si el teléfono es inválido
    }

    Connection con = null; // Declarar la conexión aquí
    PreparedStatement ps = null; // Declarar el PreparedStatement aquí
    ResultSet rs = null; // Declarar el ResultSet aquí
    String sql = "SELECT * FROM CHOFER WHERE telefono_chofer = ? AND tipo_chofer = 'Externo'";

    try {
        con = conexion.conectar(); // Obtener la conexión a la base de datos
        ps = con.prepareStatement(sql); // Inicializar el PreparedStatement
        ps.setString(1, telefono);
        
        rs = ps.executeQuery(); // Ejecutar la consulta
        
        if (rs.next()) {
            chofer = new Chofer(
                rs.getString("telefono_chofer"), 
                rs.getString("nombre"), 
                rs.getString("apellido_p"), 
                "Externo", 
                rs.getString("placa")
            );
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al buscar chofer: " + e.getMessage());
    } finally {
        // Asegurarse de cerrar los recursos
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
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al cerrar los recursos: " + e.getMessage());
        }
    }

    return chofer; // Retornar el chofer encontrado o null si no existe
    }
    //otracosnuslta 
    // Obtener teléfono del chofer interno
    public String obtenerTelefonoChoferInternoPorNombre(String nombre) {
        String telefono = null;
        Connection con = conexion.conectar();
        try {
            String sql = "SELECT telefono_chofer FROM CHOFER WHERE nombre = ? AND tipo_chofer = 'Interno'";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, nombre);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                telefono = rs.getString("telefono_chofer");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        } finally {
            try { con.close(); } catch (SQLException e) { e.printStackTrace(); }
        }
        return telefono;
    }
    //nos sirrve para actualizar   
    public boolean actualizarChofer(Chofer choferExistente) {
    Connection con = null;
    PreparedStatement ps = null;
    try {
        // Obtener conexión a la base de datos
        con = conexion.conectar(); // Método para obtener la conexión
        
        // Crear la consulta SQL para actualizar el chofer
        String sql = "UPDATE chofer SET nombre = ?, apellido_p = ?, tipo_chofer = ?, placa = ? WHERE telefono_chofer = ?";
        ps = con.prepareStatement(sql); // Cambiado a 'con'

        // Establecer los parámetros de la consulta
        ps.setString(1, choferExistente.getNombre());
        ps.setString(2, choferExistente.getApellido_p());
        ps.setString(3, choferExistente.getTipo_chofer()); // "Interno" o "Externo"
        ps.setString(4, choferExistente.getPlaca());
        ps.setString(5, choferExistente.getTelefono_chofer()); // Usar teléfono como identificador

        // Ejecutar la actualización
        int filasAfectadas = ps.executeUpdate(); // Cambiado a 'ps'

        // Retornar true si se actualizó al menos una fila
        return filasAfectadas > 0;

    } catch (SQLException e) { // Manejo de excepciones
        // Manejo de excepciones
        return false;
    } finally {
        // Cerrar recursos
        try {
            if (ps != null) ps.close(); // Cambiado a 'ps'
            if (con != null) con.close(); // Cambiado a 'con'
        } catch (SQLException e) {
        }
    }
    }
}
