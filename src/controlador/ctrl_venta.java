package controlador;
import conexion.conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.DetalleVenta;
import modelo.Venta;
public class ctrl_venta {
    //Para la venta
    public int registrarVenta(Venta venta) {
    int folio_venta = -1;
    Connection con = null;
    String sql = "INSERT INTO venta (total_venta, id_cliente, telefono, metodo_pago, status, flete, costo_flete, telefono_chofer) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
    try {
        con = conexion.conectar(); // Obtener la conexión a la base de datos
        try (PreparedStatement ps = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS)) {
            ps.setDouble(1, venta.getTotal_venta());
            ps.setInt(2, venta.getId_cliente());
            ps.setString(3, venta.getTelefono());
            ps.setString(4, venta.getMetodo_pago());
            ps.setString(5, venta.getStatus());
            ps.setString(6, venta.getFlete());
            ps.setDouble(7, venta.getCosto_flete());
            ps.setString(8, venta.getTelefono_chofer());
            // Ejecutar la inserción
            int rowsAffected = ps.executeUpdate();
            // Obtener el folio generado
            if (rowsAffected > 0) {
                try (ResultSet generatedKeys = ps.getGeneratedKeys()) {
                    if (generatedKeys.next()) {
                        folio_venta = generatedKeys.getInt(1);
                    }
                }
            }
        }
    } catch (SQLException e) {
        //JOptionPane.showMessageDialog(null, e.toString());
    } finally {
        // Cerrar la conexión en el bloque finally
        if (con != null) {
            try {
                con.close();
            } catch (SQLException ex) {
                 // Manejo de error al cerrar la conexión
            }
        }
    }
    return folio_venta; // Devuelve el folio de la venta registrada
    }
    //Para el detalle venta
    public int registrarDetalle(DetalleVenta d) {
    Connection con = null;
    PreparedStatement ps = null;
    int filasAfectadas = 0;
    try {
        con = conexion.conectar();
        ps = con.prepareStatement("INSERT INTO detalle_venta(folio_venta, id_material, peso_bruto, peso_tara, peso_neto, descuento_porcentaje, observacion, subtotal, precio_utilizado) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)");
        ps.setInt(1, d.getFolio_venta());
        ps.setInt(2, d.getId_material());
        ps.setDouble(3, d.getPeso_bruto());
        ps.setDouble(4, d.getPeso_tara());
        ps.setDouble(5, d.getPeso_neto());
        ps.setDouble(6, d.getDescuento_porcentaje());
        ps.setString(7, d.getObservacion());
        ps.setDouble(8, d.getSubtotal());
        ps.setDouble(9, d.getPrecio_selecionado());
        filasAfectadas = ps.executeUpdate();
        // Si el detalle de la compra se registró correctamente, actualizamos el stock
        if (filasAfectadas > 0) {
            ActualizarStockVenta(d.getPeso_neto(), d.getId_material());
        }   
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null,e.toString());
    } finally {
        try {
            if (ps != null) ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,e.toString());
        }
        try {
            if (con != null) con.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,e.toString());
        }
    }
    return filasAfectadas;
    }
    //Para actualizar el stock
    public boolean ActualizarStockVenta(double cantidad, int id_material) {
    Connection con = null;
    PreparedStatement ps = null;
    boolean actualizado = false;
    try {
        con = conexion.conectar();
        // Consultar la cantidad actual del material
        String consultaStock = "SELECT cantidad_kg FROM material WHERE id_material = ?";
        ps = con.prepareStatement(consultaStock);
        ps.setInt(1, id_material);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            double stockActual = rs.getDouble("cantidad_kg");
            double nuevoStock = stockActual - cantidad;
            // Actualizar el stock
            String actualizarStock = "UPDATE material SET cantidad_kg = ? WHERE id_material = ?";
            ps = con.prepareStatement(actualizarStock);
            ps.setDouble(1, nuevoStock);
            ps.setInt(2, id_material);
            int filasActualizadas = ps.executeUpdate();
            actualizado = (filasActualizadas > 0);
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, e.toString());
    } finally {
        try {
            if (ps != null) ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,e.toString());
        }
        try {
            if (con != null) con.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,e.toString());
        }
    }
    return actualizado;
    }
    //Consultar para las ventas realizadas
    public List ConsultaVenta(){
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = null;
        List<Venta> listventa = new ArrayList();
        /*String sql = "SELECT DISTINCT venta.folio_venta, venta.fecha_venta, venta.total_venta, cliente.nombre_cliente, venta.metodo_pago, venta.status, " +
        "venta.flete, venta.costo_flete, chofer.nombre, usuario.nombre " +
        "FROM VENTA " +
        "JOIN CLIENTE ON VENTA.id_cliente = CLIENTE.id_cliente " +
        "JOIN CHOFER ON VENTA.telefono_chofer = CHOFER.telefono_chofer " +
        "JOIN USUARIO ON VENTA.telefono = USUARIO.telefono " +
        "ORDER BY venta.folio_venta ASC";*/
        String sql = "SELECT DISTINCT venta.folio_venta, venta.fecha_venta, venta.total_venta, cliente.nombre_cliente, venta.metodo_pago, venta.status, " +
        "venta.flete, venta.costo_flete, chofer.nombre, usuario.nombre " +
        "FROM VENTA " +
        "JOIN CLIENTE ON VENTA.id_cliente = CLIENTE.id_cliente " +
        "JOIN CHOFER ON VENTA.telefono_chofer = CHOFER.telefono_chofer " +
        "JOIN USUARIO ON VENTA.telefono = USUARIO.telefono " +
        "ORDER BY venta.fecha_venta DESC";

        try {
            con = conexion.conectar();//establecer conexion a la bd
            ps = con.prepareStatement(sql); //para prepara la consulta
            rs = ps.executeQuery();//ejecutar la consultar y obtener el resultado 
            //procesamos los rsultados de la consulta
            while(rs.next()){
                //intanciamos a la venta para agregar con set
                Venta venta = new Venta();
                venta.setFolio_venta(rs.getInt("venta.folio_venta"));
                venta.setFecha_venta(rs.getString("venta.fecha_venta"));
                venta.setTotal_venta(rs.getDouble("venta.total_venta"));
                venta.setNombre_cliente(rs.getString("cliente.nombre_cliente"));
                venta.setMetodo_pago(rs.getString("venta.metodo_pago"));
                venta.setStatus(rs.getString("venta.status"));
                venta.setFlete(rs.getString("venta.flete"));
                venta.setCosto_flete(rs.getDouble("venta.costo_flete"));
                venta.setNombre_chofer(rs.getString("chofer.nombre"));
                venta.setNombre_usuario(rs.getString("usuario.nombre"));
                //añadimos a la lista la venta
                listventa.add(venta);
                
            }            
        } catch (Exception e) {
            
        }finally{
            try {
                if(rs != null) rs.close();
            } catch (Exception e) {
            }
            try {
                if(ps != null) ps.close();
            } catch (Exception e) {
            }
            try {
                if(con != null) con.close();
            } catch (Exception e) {
            }
        
        }
    return listventa;
    }
    //Consulta Entre Fechas
    public List<Venta> buscarVentaPorFecha(Date fechaInicio, Date fechaFin){
        List<Venta> listaventa = new ArrayList<>();
        Connection con = null;        
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "SELECT DISTINCT venta.folio_venta, venta.fecha_venta, venta.total_venta, "
           + "cliente.nombre_cliente, venta.metodo_pago, venta.status, "
           + "venta.flete, venta.costo_flete, chofer.nombre, usuario.nombre "
           + "FROM venta "
           + "JOIN cliente ON venta.id_cliente = cliente.id_cliente "
           + "JOIN chofer ON venta.telefono_chofer = chofer.telefono_chofer "
           + "JOIN usuario ON venta.telefono = usuario.telefono "
           + "WHERE venta.fecha_venta >= ? AND venta.fecha_venta < ?";
        try {
            con = conexion.conectar();
            if (con == null) {            
            JOptionPane.showMessageDialog(null,"Conexión a la base de datos fallida");
            return listaventa;  // Devuelve la lista vacía si falla la conexión
            }
            ps = con.prepareStatement(sql);
            // Establecer las fechas en el PreparedStatement
            if (fechaInicio != null && fechaFin != null) {
                ps.setDate(1, new java.sql.Date(fechaInicio.getTime()));
                ps.setDate(2, new java.sql.Date(fechaFin.getTime()));
            } else {
                JOptionPane.showMessageDialog(null,"Error: Fechas de inicio o fin son nulas.");
                return listaventa;  // Salir si las fechas no son válidas
            }
            rs = ps.executeQuery();
            while(rs.next()){
                Venta venta = new Venta();
                venta.setFolio_venta(rs.getInt("venta.folio_venta"));
                venta.setFecha_venta(rs.getString("venta.fecha_venta"));
                venta.setTotal_venta(rs.getDouble("venta.total_venta"));
                venta.setNombre_cliente(rs.getString("cliente.nombre_cliente"));
                venta.setMetodo_pago(rs.getString("venta.metodo_pago"));
                venta.setStatus(rs.getString("venta.status"));
                venta.setFlete(rs.getString("venta.flete"));
                venta.setCosto_flete(rs.getDouble("venta.costo_flete"));
                venta.setNombre_chofer(rs.getString("chofer.nombre"));
                venta.setNombre_usuario(rs.getString("usuario.nombre"));
                listaventa.add(venta);          
            }            
        } catch (Exception e) {
        }finally{
            try {
                if(ps != null) ps.close();
            } catch (SQLException e) {
            }
            try {
                if(rs != null) rs.close();
            } catch (SQLException e) {
            }
            try {
                if(con != null) con.close();
            } catch (SQLException e) {
            }
        }
        return listaventa;    
    }
    //Para la consulta por folio
    public List ConsultaFolio(){
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        List<Venta> listasfolio = new ArrayList();
        String sql = "SELECT DISTINCT venta.folio_venta, venta.fecha_venta, venta.total_venta, cliente.nombre_cliente, venta.metodo_pago, venta.status, \n" +
"                venta.flete, venta.costo_flete, chofer.nombre, usuario.nombre \n" +
"                FROM VENTA \n" +
"                JOIN \n" +
"                CLIENTE ON VENTA.id_cliente = CLIENTE.id_cliente\n" +
"                JOIN \n" +
"                CHOFER ON VENTA.telefono_chofer = CHOFER.telefono_chofer\n" +
"                JOIN \n" +
"                USUARIO ON VENTA.telefono = USUARIO.telefono ORDER BY venta.folio_venta DESC";
        try {
            con = conexion.conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                Venta venta = new Venta();
                venta.setFolio_venta(rs.getInt("venta.folio_venta"));
                venta.setFecha_venta(rs.getString("venta.fecha_venta"));
                venta.setTotal_venta(rs.getDouble("venta.total_venta"));
                venta.setNombre_cliente(rs.getString("cliente.nombre_cliente"));
                venta.setMetodo_pago(rs.getString("venta.metodo_pago"));
                venta.setStatus(rs.getString("venta.status"));
                venta.setFlete(rs.getString("venta.flete"));
                venta.setCosto_flete(rs.getDouble("venta.costo_flete"));
                venta.setNombre_chofer(rs.getString("chofer.nombre"));
                venta.setNombre_usuario(rs.getString("usuario.nombre"));
                listasfolio.add(venta);         
            }
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }finally{
            try {
                if(ps != null) ps.close();
            } catch (SQLException e) {
                //JOptionPane.showMessageDialog(null, e.toString());
            }
            try {
                if(rs != null) rs.close();
            } catch (SQLException e) {
                //JOptionPane.showMessageDialog(null, e.toString());
            }
            try {
                if(con != null) con.close();
            } catch (SQLException e) {
                //JOptionPane.showMessageDialog(null, e.toString());
            }        
        }
        return listasfolio;
    }
    //Consulta para detalles de la venta
    public List<DetalleVenta> obtenerDetallesVenta(int folioVenta) {
    List<DetalleVenta> detalles = new ArrayList<>();
    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    String sql = "SELECT dv.folio_venta, m.nombre_material, dv.peso_bruto, dv.peso_tara, dv.peso_neto, "
               + "dv.descuento_porcentaje, dv.precio_utilizado, dv.observacion, dv.subtotal "
               + "FROM detalle_venta dv "
               + "JOIN material m ON dv.id_material = m.id_material "
               + "WHERE dv.folio_venta = ?";   
    try {
        con = conexion.conectar();
        ps = con.prepareStatement(sql);
        ps.setInt(1, folioVenta);
        rs = ps.executeQuery();        
        while (rs.next()) {
            DetalleVenta detalle = new DetalleVenta();
            detalle.setFolio_venta(rs.getInt("folio_venta"));
            detalle.setNombre_material(rs.getString("nombre_material"));
            detalle.setPeso_bruto(rs.getDouble("peso_bruto"));
            detalle.setPeso_tara(rs.getDouble("peso_tara"));
            detalle.setPeso_neto(rs.getDouble("peso_neto"));
            detalle.setDescuento_porcentaje(rs.getDouble("descuento_porcentaje"));
            detalle.setObservacion(rs.getString("observacion"));
            detalle.setSubtotal(rs.getDouble("subtotal"));
            detalle.setPrecio_selecionado(rs.getDouble("precio_utilizado"));
            detalles.add(detalle);
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, e.toString());
    } finally {
        try {
            if (rs != null) rs.close();
            if (ps != null) ps.close();
            if (con != null) con.close();
        } catch (SQLException e) {
            // Manejo de cierre de recursos
        }
    }
    return detalles;
    }
    //Pagos Pendientes
    public List<Venta> obtenerPagosPendientes() {
        List<Venta> listaVenta = new ArrayList<>();
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "SELECT venta.folio_venta, venta.fecha_venta, cliente.nombre_cliente, venta.total_venta, venta.metodo_pago, venta.status, cliente.telefono, cliente.referencia\n" +
                    "FROM venta\n" +
                    "JOIN cliente ON venta.id_cliente = cliente.id_cliente\n" +
                    "WHERE venta.status = 'Pendiente' ORDER BY venta.folio_venta DESC;";
        try {
            con = conexion.conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
            Venta venta = new Venta();
            venta.setFolio_venta(rs.getInt("venta.folio_venta"));
            venta.setFecha_venta(rs.getString("venta.fecha_venta"));
            venta.setNombre_cliente(rs.getString("cliente.nombre_cliente"));
            venta.setTotal_venta(rs.getDouble("venta.total_venta"));
            venta.setMetodo_pago(rs.getString("venta.metodo_pago"));
            venta.setStatus(rs.getString("venta.status"));
            venta.setTelefono(rs.getString("cliente.telefono"));
            venta.setReferencia(rs.getString("cliente.referencia"));
            
            listaVenta.add(venta);
        }
            
        } catch (Exception e) {
        }finally {
        try {
            if (rs != null) rs.close();
            if (ps != null) ps.close();
            if (con != null) con.close();
        } catch (SQLException e) {
        }
        }
        return listaVenta;
    }
    //para el modulo venta para pagos pendientes
    public boolean MarcarComoPagado(int Folio){
        Connection con = null;
        PreparedStatement  ps = null;
        String sql = "UPDATE VENTA SET status = 'Pagado' WHERE folio_venta = ?";
        boolean isUpdated = false;
        try {
            con = conexion.conectar();
            ps = con.prepareStatement(sql);
            ps.setInt(1, Folio);
            int filasAfectadas = ps.executeUpdate();
            isUpdated = filasAfectadas > 0; // Retorna true si se actualizó el estatus            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al cambiar el estatus: " + e.getMessage());
        }finally{
            try {
                if(ps != null) ps.close();
                if(con != null) con.close();
            } catch (SQLException e) {
                JOptionPane.showConfirmDialog(null, "Erro al cerrar los recursos");
            }
        }
        return isUpdated;// Retorna el resultado de la actualización
    }
    //para pagos Realizados
    public List<Venta> obtenerPagosRealizados(){
        List<Venta> listaventa = new ArrayList<>();
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "select venta.folio_venta, venta.fecha_venta, cliente.nombre_cliente,\n" +
                    "venta.total_venta, venta.metodo_pago, venta.status, cliente.telefono,\n" +
                    "cliente.referencia from venta\n" +
                    "join\n" +
                    "cliente on\n" +
                    "cliente.id_cliente = venta.id_cliente\n" +
                    "WHERE venta.status = 'Pagado' ORDER BY venta.folio_venta DESC";
        try {
            con = conexion.conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                Venta venta = new Venta();
                venta.setFolio_venta(rs.getInt("venta.folio_venta"));
                venta.setFecha_venta(rs.getString("venta.fecha_venta"));
                venta.setNombre_cliente(rs.getString("cliente.nombre_cliente"));
                venta.setTotal_venta(rs.getDouble("venta.total_venta"));
                venta.setMetodo_pago(rs.getString("venta.metodo_pago"));
                venta.setStatus(rs.getString("venta.status"));
                venta.setTelefono(rs.getString("cliente.telefono"));
                venta.setReferencia(rs.getString("cliente.referencia"));
                listaventa.add(venta);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }finally{
            try {
                if(ps != null) ps.close();
                if(rs != null ) rs.close();
                if(con != null) con.close();
            } catch (SQLException e) {
                
            }
        }
        return listaventa;
    }
    
}
