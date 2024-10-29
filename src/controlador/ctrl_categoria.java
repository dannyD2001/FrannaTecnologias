package controlador;
import conexion.conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import modelo.Categoria;

public class ctrl_categoria {
    
           //metodo para registarcategoria
    public boolean guardar(Categoria objecto){
        
 
        boolean respuesta = false;
        Connection enlazar = conexion.conectar();
        try {
            PreparedStatement consulta = enlazar.prepareStatement("INSERT INTO categoria(nombre_categoria) VALUES(?)");
            consulta.setString(1, objecto.getNombre_categoria());
            
            if(consulta.executeUpdate() > 0){
                respuesta = true;
            }
            enlazar.close();
            
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error al guardar la categoria");
        }
        return respuesta;
    }
    
    //metodo para ver si ya existe la categoria
    public boolean existeCategoria(String categoria){
    boolean respuesta = false;
    String sql  ="select nombre_categoria from categoria where nombre_categoria = '" +categoria + "';";
    Statement st;
    try {
      Connection con = conexion.conectar();
      st = con.createStatement();
      ResultSet rs = st.executeQuery(sql);
      while(rs.next()){ 
          respuesta = true;


      }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null,"Error al consultar en categoria");
    }
    return respuesta;
    }
    
}
