package modelo;
/**
 *
 * @author Danny Dominguez
 */
public class Venta {
    private int folio_venta;
    private String fecha_venta;
    private double total_venta;
    private int id_cliente;
    private String telefono;
    private String metodo_pago;
    private String status;
    private String flete;
    private double costo_flete;

    public Venta(int folio_venta, String fecha_venta, double total_venta, int id_cliente, String telefono, String metodo_pago, String status, String flete, double costo_flete) {
        this.folio_venta = folio_venta;
        this.fecha_venta = fecha_venta;
        this.total_venta = total_venta;
        this.id_cliente = id_cliente;
        this.telefono = telefono;
        this.metodo_pago = metodo_pago;
        this.status = status;
        this.flete = flete;
        this.costo_flete = costo_flete;
    }
    
    public int getFolio_venta() {
        return folio_venta;
    }

    public void setFolio_venta(int folio_venta) {
        this.folio_venta = folio_venta;
    }

    public String getFecha_venta() {
        return fecha_venta;
    }

    public void setFecha_venta(String fecha_venta) {
        this.fecha_venta = fecha_venta;
    }

    public double getTotal_venta() {
        return total_venta;
    }

    public void setTotal_venta(double total_venta) {
        this.total_venta = total_venta;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getMetodo_pago() {
        return metodo_pago;
    }

    public void setMetodo_pago(String metodo_pago) {
        this.metodo_pago = metodo_pago;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getFlete() {
        return flete;
    }

    public void setFlete(String flete) {
        this.flete = flete;
    }

    public double getCosto_flete() {
        return costo_flete;
    }

    public void setCosto_flete(double costo_flete) {
        this.costo_flete = costo_flete;
    }    
}
