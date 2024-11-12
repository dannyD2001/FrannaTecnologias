package modelo;
public class Venta {
    private int folio_venta;
    private String fecha_venta;
    private double total_venta;
    private int id_cliente;
    private String nombre_cliente;  //// Cambiamos id_cliente por nombre_cliente
    private String telefono;
    private String nombre_usuario; //Cmabiamos el telefono por nombre_usuario
    private String metodo_pago;
    private String status;
    private String flete;
    private double costo_flete;
    private String nombre_chofer;  //cambiamos el telefono_chofer por nombre_chofer
    private String telefono_chofer;
    private String referencia;        
    //constructor normal
    public Venta(int folio_venta, String fecha_venta, double total_venta, int id_cliente, String nombre_cliente, String telefono, String nombre_usuario, String metodo_pago, String status, String flete, double costo_flete, String nombre_chofer, String telefono_chofer, String referencia) {
        this.folio_venta = folio_venta;
        this.fecha_venta = fecha_venta;
        this.total_venta = total_venta;
        this.id_cliente = id_cliente;
        this.nombre_cliente = nombre_cliente;
        this.telefono = telefono;
        this.nombre_usuario = nombre_usuario;
        this.metodo_pago = metodo_pago;
        this.status = status;
        this.flete = flete;
        this.costo_flete = costo_flete;
        this.nombre_chofer = nombre_chofer;
        this.telefono_chofer = telefono_chofer;
        this.referencia = referencia;
    }

    //constructor vacio
    public Venta() {
        this.folio_venta = 0;
        this.total_venta = 0;
        this.id_cliente = 0;
        this.telefono = "";
        this.metodo_pago = "";
        this.status = "";
        this.flete = "";
        this.costo_flete = 0;
        this.telefono_chofer = "";
        this.referencia = "";
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

    public String getNombre_cliente() {
        return nombre_cliente;
    }

    public void setNombre_cliente(String nombre_cliente) {
        this.nombre_cliente = nombre_cliente;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
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

    public String getNombre_chofer() {
        return nombre_chofer;
    }

    public void setNombre_chofer(String nombre_chofer) {
        this.nombre_chofer = nombre_chofer;
    }

    public String getTelefono_chofer() {
        return telefono_chofer;
    }

    public void setTelefono_chofer(String telefono_chofer) {
        this.telefono_chofer = telefono_chofer;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }
 
}
