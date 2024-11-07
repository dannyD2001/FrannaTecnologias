package controlador;
import conexion.conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.Compra;
import modelo.DetalleCompra;
public class ctrl_compra {
    //ACA modifique aca para poder obtener el folio
    public int registrarCompra(Compra c) {
    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    int folio_compra = -1;
    try {
        //Conexión a la base de datos
        con = conexion.conectar();
        //Preparamos la consulta para insertar la compra
        ps = con.prepareStatement("INSERT INTO COMPRA(total_compra, id_provedor, telefono, metodo_pago, status) VALUES (?, ?, ?, ?, ?)", Statement.RETURN_GENERATED_KEYS);
        ps.setDouble(1, c.getTotal_compra());
        ps.setInt(2, c.getId_provedor());
        ps.setString(3, c.getTelefono());
        ps.setString(4, c.getMetodo_pago());
        ps.setString(5, c.getStatus());
        //Ejecutamos la inserción
        ps.executeUpdate();
        //Obtener el folio_compra generado
        rs = ps.getGeneratedKeys();
        if (rs.next()) {
            folio_compra = rs.getInt(1); // Guardamos el folio de la compra
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, e.toString());
    } finally {
        try {
            if (rs != null) rs.close();
            if (ps != null) ps.close();
            if (con != null) con.close();
        } catch (SQLException e) {
            // Manejo de excepciones en el cierre de recursos
        }
    }
    return folio_compra; // Devolver el folio de la compra generado sirvira en la interfaz
    }
    
    //Es para el Detalle Compra
    public int registrarDetalle(DetalleCompra d) {
    Connection con = null;
    PreparedStatement ps = null;
    int filasAfectadas = 0;
    try {
        con = conexion.conectar();
        ps = con.prepareStatement("INSERT INTO detalle_compra(folio_compra, id_material, peso_bruto, peso_tara, peso_neto, descuento_porcentaje, observacion, subtotal, precio_utilizado) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)");
        ps.setInt(1, d.getFolio_compra());
        ps.setInt(2, d.getId_material());
        ps.setDouble(3, d.getPeso_bruto());
        ps.setDouble(4, d.getPeso_tara());
        ps.setDouble(5, d.getPeso_neto());
        ps.setDouble(6, d.getDescuento_porcentaje());
        ps.setString(7, d.getObservacion());
        ps.setDouble(8, d.getSubtotal());
        ps.setDouble(9, d.getPrecio_selecionado());
        // demás parámetros aquí...
        filasAfectadas = ps.executeUpdate();
        
        // Si el detalle de la compra se registró correctamente, actualizamos el stock
        if (filasAfectadas > 0) {
            ActualizarStockCompra(d.getPeso_neto(), d.getId_material());
        }
        
        
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null,e.toString());
    } finally {
        try {
            if (ps != null) ps.close();
            if (con != null) con.close();
        } catch (SQLException e) {
            // Manejar cierre de recursos
        }
    }
    return filasAfectadas;
    }
    //para obtener el nombre del provedor desde su id
    //NOTA
    //agregamos la consulta con el Join de tabla a tabla y luego modifica en el modelo de esa tabla agregando el nombre provedor igual agrega el seter y geter y constructor
    //para listar las compras
    public List ConsultaCompra(){
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = null;
        List<Compra> listcompras = new ArrayList();
        String sql = "SELECT DISTINCT compra.folio_compra, compra.fecha_compra, compra.total_compra, provedor.nombre, compra.metodo_pago, compra.status " +
             "FROM compra " +
             "JOIN provedor ON compra.id_provedor = provedor.id_provedor";
        try {
            con = conexion.conectar(); // Establecemos conexión
            ps = con.prepareStatement(sql); // Preparamos la consulta
            rs = ps.executeQuery();// Ejecutamos la consulta y obtenemos el ResultSet
            // Procesamos los resultados del ResultSet
            while(rs.next()){
                Compra compra = new Compra();
                compra.setFolio_compra(rs.getInt("compra.folio_compra"));
                compra.setFecha(rs.getString("compra.fecha_compra"));
                compra.setTotal_compra(rs.getDouble("compra.total_compra"));
                compra.setNombre_provedor(rs.getString("nombre")); // Correctamente obtenemos el nombre del proveedor
                compra.setMetodo_pago(rs.getString("compra.metodo_pago"));
                compra.setStatus(rs.getString("compra.status"));
                //añadir la compra a la lista
                listcompras.add(compra);
            }            
        } catch (SQLException e) {
        }finally {
        // Cerramos los recursos en el bloque finally
        try {
            if (rs != null) rs.close();
            if (ps != null) ps.close();
            if (con != null) con.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
        }    
    return listcompras;
    }
    //stock
    public boolean ActualizarStockCompra(double cantidad, int id_material) {
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
            double nuevoStock = stockActual + cantidad;

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
            if (con != null) con.close();
        } catch (SQLException e) {
            // Manejar cierre de recursos
        }
    }

    return actualizado;
    }
    //para consultar el detalle compra
    public List<DetalleCompra> obtenerDetallesCompra(int folioCompra) {
    List<DetalleCompra> detalles = new ArrayList<>();
    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    String sql = "SELECT dc.folio_compra, m.nombre_material, dc.peso_bruto, dc.peso_tara, dc.peso_neto, "
               + "dc.descuento_porcentaje, dc.precio_utilizado, dc.observacion, dc.subtotal "
               + "FROM detalle_compra dc "
               + "JOIN material m ON dc.id_material = m.id_material "
               + "WHERE dc.folio_compra = ?";
    
    try {
        con = conexion.conectar();
        ps = con.prepareStatement(sql);
        ps.setInt(1, folioCompra);
        rs = ps.executeQuery();
        
        while (rs.next()) {
            DetalleCompra detalle = new DetalleCompra();
            detalle.setFolio_compra(rs.getInt("folio_compra"));
            detalle.setNombre_material(rs.getString("nombre_material")); // Asignar el nombre del material
            //detalle.setId_material(rs.getInt("id_material"));
            detalle.setPeso_bruto(rs.getDouble("peso_bruto"));
            detalle.setPeso_tara(rs.getDouble("peso_tara"));
            detalle.setPeso_neto(rs.getDouble("peso_neto"));
            detalle.setDescuento_porcentaje(rs.getDouble("descuento_porcentaje"));
            detalle.setPrecio_selecionado(rs.getDouble("precio_utilizado"));//6
            detalle.setObservacion(rs.getString("observacion"));
            detalle.setSubtotal(rs.getDouble("subtotal"));
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
    //para la consulta del folio
    public List consultaFolio(){
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        List <Compra> listfolio = new ArrayList();
        String sql = "SELECT DISTINCT compra.folio_compra, compra.fecha_compra, compra.total_compra, provedor.nombre, compra.metodo_pago, compra.status " +
             "FROM compra " +
             "JOIN provedor ON compra.id_provedor = provedor.id_provedor";
        try {
            con = conexion.conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                Compra compra = new  Compra();
                compra.setFolio_compra(rs.getInt("compra.folio_compra"));
                compra.setFecha(rs.getString("compra.fecha_compra"));
                compra.setNombre_provedor(rs.getString("provedor.nombre"));
                compra.setTotal_compra(rs.getDouble("compra.total_compra"));
                compra.setMetodo_pago(rs.getString("compra.metodo_pago"));
                compra.setStatus(rs.getString("compra.status"));
                listfolio.add(compra);
            
            }
        } catch (Exception e) {
            //agrega mensaje
        } finally{
            try {
            if (rs != null) rs.close();
            if (ps != null) ps.close();
            if (con != null) con.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error al cerrar los recursos"+e.getMessage());
            }
        }
        return listfolio;     
    }
    
    //esto es para la CONSULTA EN FECHAS
    public List<Compra> buscarComprasPorFecha(Date fechaInicio, Date fechaFin) {
    List<Compra> listaCompras = new ArrayList<>();
    String sql = "SELECT DISTINCT compra.folio_compra, compra.fecha_compra, compra.total_compra, "
               + "provedor.nombre, compra.metodo_pago, compra.status "
               + "FROM compra "
               + "JOIN provedor ON compra.id_provedor = provedor.id_provedor "
               + "WHERE DATE(compra.fecha_compra) BETWEEN ? AND ?";    
    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    try {
        con = conexion.conectar();  // Verifica que este método funcione correctamente
        if (con == null) {            
            JOptionPane.showMessageDialog(null,"Conexión a la base de datos fallida");
            return listaCompras;  // Devuelve la lista vacía si falla la conexión
        }
        ps = con.prepareStatement(sql);
        // Establecer las fechas en el PreparedStatement
        if (fechaInicio != null && fechaFin != null) {
            ps.setDate(1, new java.sql.Date(fechaInicio.getTime()));
            ps.setDate(2, new java.sql.Date(fechaFin.getTime()));
        } else {
            JOptionPane.showMessageDialog(null,"Error: Fechas de inicio o fin son nulas.");
            return listaCompras;  // Salir si las fechas no son válidas
        }
        rs = ps.executeQuery();
        while (rs.next()) {
            Compra compra = new Compra();
            compra.setFolio_compra(rs.getInt("compra.folio_compra"));
            compra.setFecha(rs.getString("compra.fecha_compra"));  // Aquí almacena la fecha y hora completa
            compra.setNombre_provedor(rs.getString("provedor.nombre"));
            compra.setTotal_compra(rs.getDouble("compra.total_compra"));
            compra.setMetodo_pago(rs.getString("compra.metodo_pago"));
            compra.setStatus(rs.getString("compra.status"));
            listaCompras.add(compra);
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null,"Error al ejecutar la consulta SQL");
    } finally {
        try {
            if (rs != null) rs.close();
            if (ps != null) ps.close();
            if (con != null) con.close();
        } catch (SQLException e) {
            System.out.println("Error al cerrar los recursos: " + e.getMessage());//quitar
        }
    }    
    return listaCompras;
    }
    
    //consulta para pagos pendientes-ACA DUPLICA PARA AHORA SEA PAGOS PAGADOS
    public List<Compra> obtenerPagosPendientes() {
        List<Compra> listaCompras = new ArrayList<>();
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "SELECT compra.folio_compra, compra.fecha_compra, provedor.nombre, compra.total_compra, compra.metodo_pago, compra.status, provedor.telefono, provedor.referencia\n" +
                    "FROM compra\n" +
                    "JOIN provedor ON compra.id_provedor = provedor.id_provedor\n" +
                    "WHERE compra.status = 'Pendiente';";
        try {
        con = conexion.conectar();
        ps = con.prepareStatement(sql);
        rs = ps.executeQuery();
        
        while (rs.next()) {
            Compra compra = new Compra();
            compra.setFolio_compra(rs.getInt("compra.folio_compra"));
            compra.setFecha(rs.getString("compra.fecha_compra"));
            compra.setNombre_provedor(rs.getString("provedor.nombre"));
            compra.setTotal_compra(rs.getDouble("compra.total_compra"));
            compra.setMetodo_pago(rs.getString("compra.metodo_pago"));
            compra.setStatus(rs.getString("compra.status"));
            compra.setTelefono_provedor(rs.getString("provedor.telefono"));
            compra.setReferencia(rs.getString("provedor.referencia"));
            
            listaCompras.add(compra);
        }
    } catch (SQLException e) {
    }finally {
        try {
            if (rs != null) rs.close();
            if (ps != null) ps.close();
            if (con != null) con.close();
        } catch (SQLException e) {
        }
    }
    return listaCompras;
    }
    //Para pagos realizados
    public List<Compra> obtenerPagosPagados() {
        List<Compra> listaCompras = new ArrayList<>();
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "SELECT compra.folio_compra, compra.fecha_compra, provedor.nombre, compra.total_compra, compra.metodo_pago, compra.status, provedor.telefono, provedor.referencia\n" +
                    "FROM compra\n" +
                    "JOIN provedor ON compra.id_provedor = provedor.id_provedor\n" +
                    "WHERE compra.status = 'Pagado';";
        try {
        con = conexion.conectar();
        ps = con.prepareStatement(sql);
        rs = ps.executeQuery();
        
        while (rs.next()) {
            Compra compra = new Compra();
            compra.setFolio_compra(rs.getInt("compra.folio_compra"));
            compra.setFecha(rs.getString("compra.fecha_compra"));
            compra.setNombre_provedor(rs.getString("provedor.nombre"));
            compra.setTotal_compra(rs.getDouble("compra.total_compra"));
            compra.setMetodo_pago(rs.getString("compra.metodo_pago"));
            compra.setStatus(rs.getString("compra.status"));
            compra.setTelefono_provedor(rs.getString("provedor.telefono"));
            compra.setReferencia(rs.getString("provedor.referencia"));
            
            listaCompras.add(compra);
        }
    } catch (SQLException e) {    
    }finally {
        try {
            if (rs != null) rs.close();
            if (ps != null) ps.close();
            if (con != null) con.close();
        } catch (SQLException e) {
        }
    }
    return listaCompras;
    }
    
    //para la parte de marcar como pagado en el modulo PAGO pendiente
    public boolean marcarComoPagado(int folio) {
    Connection con = null;
    PreparedStatement ps = null;
    String sql = "UPDATE compra SET status = 'Pagado' WHERE folio_compra = ?";
    boolean isUpdated = false;

    try {
        con = conexion.conectar(); // Asegúrate de que este método esté implementado correctamente
        ps = con.prepareStatement(sql);
        ps.setInt(1, folio);
        int rowsAffected = ps.executeUpdate();
        
        isUpdated = rowsAffected > 0; // Retorna true si se actualizó el estatus
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al cambiar el estatus: " + ex.getMessage());
    } finally {
        try {
            if (ps != null) ps.close();
            if (con != null) con.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al cerrar los recursos: " + e.getMessage());
        }
    }
    
    return isUpdated; // Retorna el resultado de la actualización
    }


    
    
    //PARA FOTURA REVISA ESTO ES PARA ANULAR COMPRA todo lo que esta abajo
    //lo de aca no funciona revisa
    public boolean anularCompra(int folio_compra) {
    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    boolean anulado = false;

    try {
        con = conexion.conectar();

        // Paso 1: Obtener los detalles de la compra (materiales y cantidades)
        String sqlDetalleCompra = "SELECT id_material, peso_neto FROM detalle_compra WHERE folio_compra = ?";
        ps = con.prepareStatement(sqlDetalleCompra);
        ps.setInt(1, folio_compra);
        rs = ps.executeQuery();

        // Paso 2: Para cada material en la compra, reducir el stock
        while (rs.next()) {
            int id_material = rs.getInt("id_material");
            double cantidadComprada = rs.getDouble("peso_neto");

            // Actualizar el stock restando la cantidad comprada
            if (!reducirStock(id_material, cantidadComprada)) {
                // Si hay un error al actualizar el stock, cancelamos el proceso de anulación
                return false;
            }
        }

        // Paso 3: Cambiar el estado de la compra a 'anulado'
        String sqlAnularCompra = "UPDATE compra SET status = 'anulado' WHERE folio_compra = ?";
        ps = con.prepareStatement(sqlAnularCompra);
        ps.setInt(1, folio_compra);
        int filasAfectadas = ps.executeUpdate();

        // Si el estado se actualizó correctamente, marcamos la anulación como exitosa
        if (filasAfectadas > 0) {
            anulado = true;
        }

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, e.toString());
    } finally {
        try {
            if (rs != null) rs.close();
            if (ps != null) ps.close();
            if (con != null) con.close();
        } catch (SQLException e) {
            // Manejo de errores de cierre de recursos
        }
    }
    return anulado;
    }
    public boolean reducirStock(int id_material, double cantidad) {
    Connection con = null;
    PreparedStatement ps = null;
    boolean reducido = false;

    try {
        con = conexion.conectar();
        // Primero, obtenemos la cantidad actual en stock
        String consultaStock = "SELECT cantidad_kg FROM material WHERE id_material = ?";
        ps = con.prepareStatement(consultaStock);
        ps.setInt(1, id_material);
        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            double stockActual = rs.getDouble("cantidad_kg");

            // Restamos la cantidad comprada al stock
            double nuevoStock = stockActual - cantidad;

            // Actualizamos el stock en la tabla material
            String actualizarStock = "UPDATE material SET cantidad_kg = ? WHERE id_material = ?";
            ps = con.prepareStatement(actualizarStock);
            ps.setDouble(1, nuevoStock);
            ps.setInt(2, id_material);

            int filasActualizadas = ps.executeUpdate();
            reducido = (filasActualizadas > 0);
        }

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, e.toString());
    } finally {
        try {
            if (ps != null) ps.close();
            if (con != null) con.close();
        } catch (SQLException e) {
            // Manejo de cierre de recursos
        }
    }
    return reducido;
    }   
}
