package modelo;
//agregue la fecha
public class Compra {
    private int folio_compra;
    private String fecha;
    private double total_compra;
    private int id_provedor;
    private String nombre_provedor;  // Cambiamos id_provedor por nombre_provedor
    private String telefono;
    private String nombre; //nombre usuario
    private String metodo_pago;
    private String status;
    private String telefono_provedor;
    private String referencia;
    private String flete;
    private double costo_flete;

    public Compra(int folio_compra, String fecha, double total_compra, int id_provedor, String nombre_provedor, String telefono, String nombre, String metodo_pago, String status, String telefono_provedor, String referencia, String flete, double costo_flete) {
        this.folio_compra = folio_compra;
        this.fecha = fecha;
        this.total_compra = total_compra;
        this.id_provedor = id_provedor;
        this.nombre_provedor = nombre_provedor;
        this.telefono = telefono;
        this.nombre = nombre;
        this.metodo_pago = metodo_pago;
        this.status = status;
        this.telefono_provedor = telefono_provedor;
        this.referencia = referencia;
        this.flete = flete;
        this.costo_flete = costo_flete;
    }
    //
    public Compra() {
        this.total_compra = 0.0;
        this.id_provedor = 0;
        this.nombre_provedor = "";
        this.telefono = "";
        this.metodo_pago = "";
        this.status = "";
        this.telefono_provedor = "";
        this.referencia = "";
        this.flete = "";
        this.costo_flete = 0.0;
        this.nombre = "";
    }

    public int getFolio_compra() {
        return folio_compra;
    }

    public void setFolio_compra(int folio_compra) {
        this.folio_compra = folio_compra;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getTotal_compra() {
        return total_compra;
    }

    public void setTotal_compra(double total_compra) {
        this.total_compra = total_compra;
    }

    public int getId_provedor() {
        return id_provedor;
    }

    public void setId_provedor(int id_provedor) {
        this.id_provedor = id_provedor;
    }

    public String getNombre_provedor() {
        return nombre_provedor;
    }

    public void setNombre_provedor(String nombre_provedor) {
        this.nombre_provedor = nombre_provedor;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public String getTelefono_provedor() {
        return telefono_provedor;
    }

    public void setTelefono_provedor(String telefono_provedor) {
        this.telefono_provedor = telefono_provedor;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
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

