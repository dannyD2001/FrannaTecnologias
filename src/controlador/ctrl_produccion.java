package controlador;

import conexion.conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.Material;
import modelo.Produccion;

public class ctrl_produccion {
    
    public static int registrarProduccion(Produccion produccion) throws SQLException {
    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    String sql = "INSERT INTO produccion (id_material, kg_utilizados) VALUES (?, ?)";
    try {
        // Conexión a la base de datos
        con = conexion.conectar();
        // Preparar la declaración
        ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        ps.setInt(1, produccion.getId_material());
        ps.setDouble(2, produccion.getKg_utilizados());  // Asegúrate de usar el tipo de datos adecuado para kg_utilizados
        // Ejecutar la consulta
        ps.executeUpdate();

        // Obtener las claves generadas
        rs = ps.getGeneratedKeys();
        if (rs.next()) {
            return rs.getInt(1); // Retorna el ID generado (id_produccion)
        } else {
            throw new SQLException("No se pudo obtener el ID generado.");
        }
    } finally {
        // Cerrar los recursos
        if (rs != null) try { rs.close(); } catch (SQLException e) { e.printStackTrace(); }
        if (ps != null) try { ps.close(); } catch (SQLException e) { e.printStackTrace(); }
        if (con != null) try { con.close(); } catch (SQLException e) { e.printStackTrace(); }
    }
    }
    
    public static void registrarPacas(int idProduccion, List<Integer> pesosPacas) throws SQLException {
    Connection con = null;
    PreparedStatement ps = null;
    String sql = "INSERT INTO paca (id_produccion, peso_kg, estado) VALUES (?, ?, ?)";

    try {
        // Conexión a la base de datos
        con = conexion.conectar();

        // Preparar la declaración
        ps = con.prepareStatement(sql);

        // Iterar sobre cada peso de paca
        for (int peso : pesosPacas) {
            ps.setInt(1, idProduccion);  // Asociamos la paca con la producción
            ps.setInt(2, peso);          // Peso de la paca
            ps.setString(3, "Disponible");  // Estado por defecto: "Disponible"

            // Ejecutar la consulta para insertar la paca
            ps.executeUpdate();
        }
    } finally {
        // Cerrar los recursos
        if (ps != null) try { ps.close(); } catch (SQLException e) { e.printStackTrace(); }
        if (con != null) try { con.close(); } catch (SQLException e) { e.printStackTrace(); }
    }
    }
   
    public static int obtenerIdMaterialPorNombre(Material material) throws SQLException {
    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    String sql = "SELECT id_material FROM material WHERE nombre_material = ?";
    
    try {
        // Obtener conexión
        con = conexion.conectar(); // Asegúrate de tener el objeto 'conexion' correctamente configurado

        // Preparar la consulta
        ps = con.prepareStatement(sql);
        ps.setString(1, material.getNombre_material()); // Establecer el nombre del material

        // Ejecutar la consulta
        rs = ps.executeQuery();

        // Verificar si se encontró el material
        if (rs.next()) {
            return rs.getInt("id_material"); // Retorna el id_material
        } else {
            throw new SQLException("No se encontró el material con el nombre: " + material.getNombre_material());
        }
    } finally {
        // Cerrar los recursos en orden inverso
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (ps != null) {
            try {
                ps.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (con != null) {
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    }

    //
    public static void actualizarMaterial(int idMaterial, int kilosUtilizados) {
    Connection con = null;
    PreparedStatement stmt = null;

    try {
        // Establecer conexión a la base de datos
        con = conexion.conectar();

        // Consultar la cantidad actual del material
        String query = "SELECT cantidad_kg FROM material WHERE id_material = ?";
        stmt = con.prepareStatement(query);
        stmt.setInt(1, idMaterial);
        ResultSet rs = stmt.executeQuery();

        if (rs.next()) {
            int cantidadActual = rs.getInt("cantidad_kg");

            // Verificar si hay suficiente material disponible
            if (cantidadActual >= kilosUtilizados) {
                // Descontar la cantidad utilizada del material
                String updateQuery = "UPDATE material SET cantidad_kg = cantidad_kg - ? WHERE id_material = ?";
                stmt = con.prepareStatement(updateQuery);
                stmt.setInt(1, kilosUtilizados);
                stmt.setInt(2, idMaterial);
                int rowsAffected = stmt.executeUpdate();

                if (rowsAffected > 0) {
                    JOptionPane.showMessageDialog(null, "Material actualizado correctamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Error al actualizar el material.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "No hay suficiente material disponible.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Material no encontrado.", "Error", JOptionPane.ERROR_MESSAGE);
        }

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al conectar a la base de datos: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        e.printStackTrace();
    } finally {
        // Cerrar la conexión y los recursos
        try {
            if (stmt != null) stmt.close();
            if (con != null) con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}


}
