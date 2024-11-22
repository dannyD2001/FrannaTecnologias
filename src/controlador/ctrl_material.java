package controlador;
import conexion.conexion;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import modelo.Categoria;
import modelo.Material;
public class ctrl_material {
    Connection con = null;
    PreparedStatement ps;
    ResultSet rs; 
    Statement  st;
    public boolean RegistrarMateria(Material mate){
        String sql="INSERT INTO MATERIAL (nombre_material, cantidad_kg, precio_compra, precio_venta, id_categoria, precio_compra2, precio_compra3, precio_venta2, precio_venta3) VALUES(?,?,?,?,?,?,?,?,?)" ;
        try {
           con = conexion.conectar();
            ps = con.prepareStatement(sql);
            ps.setString(1, mate.getNombre_material());
            ps.setInt(2, mate.getCantidad_kg());
            ps.setDouble(3, mate.getPrecio_compra());
            ps.setDouble(4, mate.getPrecio_venta());
            ps.setInt(5, mate.getId_categoria());
            ps.setDouble(6, mate.getPrecio_compra2());
            ps.setDouble(7, mate.getPrecio_compra3());
            ps.setDouble(8, mate.getPrecio_venta2());
            ps.setDouble(9, mate.getPrecio_venta3());
            ps.execute();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Eror al registrar material");
            return false;
        }    
    }

    //para la categoria
    public void ConsultarCategoria(JComboBox  categoriaComboBox){
        String sql ="SELECT id_categoria,nombre_categoria FROM CATEGORIA";
        try {
            con = conexion.conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                int idCategoria = rs.getInt("id_categoria");
                String nombreCategoria = rs.getString("nombre_categoria");
                Categoria categoria = new Categoria(idCategoria, nombreCategoria);
                categoriaComboBox.addItem(categoria);                            
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }
      
    //metodo para ver si existe el material aka
    public boolean existeMaterial(String nombre) {
    boolean respuesta = false;
    String sql = "SELECT nombre_material FROM material WHERE nombre_material = ?";
    PreparedStatement ps = null;
    ResultSet rs = null;
    Connection con = null;
    try {
        con = conexion.conectar();
        ps = con.prepareStatement(sql);
        ps.setString(1, nombre);  // Asignar el valor de nombre al marcador de parámetro "?"
        rs = ps.executeQuery();
        if (rs.next()) {
            respuesta = true;  // Si hay un resultado, significa que existe el material
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al consultar en material");
    } finally {
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

     //para la consulta de inventario
      public List ConsultaMaterial(){
        List <Material> listamate = new ArrayList();
        String sql = "SELECT id_material, nombre_material, cantidad_kg, unidad_de_medida FROM MATERIAL";
          try {
              Connection con = conexion.conectar();
              ps = con.prepareStatement(sql);
              rs = ps.executeQuery();
              while(rs.next()){
                  Material materia = new Material();
                  materia.setId_material(rs.getInt("id_material"));
                  materia.setNombre_material(rs.getString("nombre_material"));
                  materia.setCantidad_kg(rs.getInt("cantidad_kg"));
                  materia.setUnidad_de_medida(rs.getString("unidad_de_medida"));
                  listamate.add(materia);
              }
          } catch (SQLException e) {
              JOptionPane.showMessageDialog(null,"error al inventario material");
              
          }
          return listamate;        
    }
      //para la buscar material compra
    public void bucarMaterial(JComboBox materialComboBox){
         String sql ="SELECT id_material, nombre_material, cantidad_kg, precio_compra, precio_venta, precio_compra2, precio_compra3, precio_venta2, precio_venta3, precio_compra4, precio_compra5 FROM MATERIAL";
        try {
             // Verificar si el JComboBox no es nulo y vaciarlo
            materialComboBox.removeAllItems(); // Limpiar el JComboBox*/
            materialComboBox.addItem("--Seleccionar--"); // Agregar opción "vacía" o inicial*/
            con = conexion.conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                int idMaterial = rs.getInt("id_material");
                String nombreMaterial = rs.getString("nombre_material");
                int cantidad = rs.getInt("cantidad_kg");
                double precio = rs.getDouble("precio_compra");
                double precio_venta = rs.getDouble("precio_venta");
                double precio2 = rs.getDouble("precio_compra2");
                double precio3 = rs.getDouble("precio_compra3");
                double precio_venta2 = rs.getDouble("precio_venta2");
                double precio_venta3 = rs.getDouble("precio_venta3");
                double precio_compra4 = rs.getDouble("precio_compra4");
                double precio_compra5 = rs.getDouble("precio_compra5");
                Material material = new Material(idMaterial, nombreMaterial,cantidad, precio,precio_venta,precio2,precio3,precio_venta2,precio_venta3,precio_compra4,precio_compra5);
                materialComboBox.addItem(material);                            
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }
    //Para Actualizar Precio para Compra  
    public List<Material> consultarMateriales() {
    List<Material> listaMateriales = new ArrayList<>();
    String sql = "SELECT id_material, nombre_material, precio_compra, precio_compra2, precio_compra3, precio_compra4, precio_compra5 FROM material";
    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    try{
        con = conexion.conectar();
        ps = con.prepareStatement(sql);
        rs = ps.executeQuery();
        while (rs.next()) {
            Material material = new Material();
            material.setId_material(rs.getInt("id_material"));
            material.setNombre_material(rs.getString("nombre_material"));
            material.setPrecio_compra(rs.getDouble("precio_compra"));
            material.setPrecio_compra2(rs.getDouble("precio_compra2"));
            material.setPrecio_compra3(rs.getDouble("precio_compra3"));
            material.setPrecio_compra4(rs.getDouble("precio_compra4"));
            material.setPrecio_compra5(rs.getDouble("precio_compra5"));
            listaMateriales.add(material);
        }
    } catch (SQLException e) {
     
    }finally{
        try {
            if(ps != null) ps.close();
            if(rs != null) rs.close();
            if(con != null) con.close();
        } catch (SQLException e) {
        }
    }
    return listaMateriales;
    }
    //para actualizar precios
    // Para actualizar precios
    public boolean actualizarPrecio(Material material) {
    String sql = "UPDATE material SET nombre_material = ?, precio_compra = ?, precio_compra2 = ?, precio_compra3 = ?, precio_compra4 = ?, precio_compra5 = ? WHERE id_material = ?";
    Connection con = null;
    PreparedStatement ps = null;

    try {
        con = conexion.conectar(); // Obtener conexión
        ps = con.prepareStatement(sql);

        // Configurar los parámetros de la consulta
        ps.setString(1, material.getNombre_material());
        ps.setDouble(2, material.getPrecio_compra());
        ps.setDouble(3, material.getPrecio_compra2());
        ps.setDouble(4, material.getPrecio_compra3());
        ps.setDouble(5, material.getPrecio_compra4());
        ps.setDouble(6, material.getPrecio_compra5());
        ps.setInt(7, material.getId_material());

        // Ejecutar la actualización
        return ps.executeUpdate() > 0;

    } catch (SQLException e) {
        return false;
    } finally {
        // Asegurar que los recursos se cierren
        try {
            if (ps != null) ps.close();
            if (con != null) con.close();
        } catch (SQLException ex) {
        }
    }
    }
    //Para actualizar precio venta
    public List<Material> consultarMateriales2() {
    List<Material> listaMateriales = new ArrayList<>();
    String sql = "SELECT id_material, nombre_material, precio_venta, precio_venta2, precio_venta3 FROM material";
    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    try{
        con = conexion.conectar();
        ps = con.prepareStatement(sql);
        rs = ps.executeQuery();
        while (rs.next()) {
            Material material = new Material();
            material.setId_material(rs.getInt("id_material"));
            material.setNombre_material(rs.getString("nombre_material"));
            material.setPrecio_venta(rs.getDouble("precio_venta"));
            material.setPrecio_venta2(rs.getDouble("precio_venta2"));
            material.setPrecio_venta3(rs.getDouble("precio_venta3"));
            listaMateriales.add(material);
        }
    } catch (SQLException e) {
     
    }finally{
        try {
            if(ps != null) ps.close();
            if(rs != null) rs.close();
            if(con != null) con.close();
        } catch (SQLException e) {
        }
    }
    return listaMateriales;
    }
    //venta Para actualizar precios Venta
    public boolean actualizarPrecioVenta(Material material) {
    String sql = "UPDATE material SET nombre_material = ?, precio_venta = ?, precio_venta2 = ?, precio_venta3 = ? WHERE id_material = ?";
    Connection con = null;
    PreparedStatement ps = null;

    try {
        con = conexion.conectar(); // Obtener conexión
        ps = con.prepareStatement(sql);

        // Configurar los parámetros de la consulta
        ps.setString(1, material.getNombre_material());
        ps.setDouble(2, material.getPrecio_venta());
        ps.setDouble(3, material.getPrecio_venta2());
        ps.setDouble(4, material.getPrecio_venta3());
        ps.setInt(5, material.getId_material());

        // Ejecutar la actualización
        return ps.executeUpdate() > 0;

    } catch (SQLException e) {
        return false;
    } finally {
        // Asegurar que los recursos se cierren
        try {
            if (ps != null) ps.close();
            if (con != null) con.close();
        } catch (SQLException ex) {
        }
    }
    }
}
