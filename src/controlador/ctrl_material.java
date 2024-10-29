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
         String sql ="SELECT id_material, nombre_material, cantidad_kg, precio_compra, precio_venta, precio_compra2, precio_compra3, precio_venta2, precio_venta3 FROM MATERIAL";
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
                Material material = new Material(idMaterial, nombreMaterial,cantidad, precio,precio_venta,precio2,precio3,precio_venta2,precio_venta3);
                materialComboBox.addItem(material);                            
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }
}
