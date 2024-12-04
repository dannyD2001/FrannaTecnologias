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
    private String telefono_chofer;
    private String nombre_chofer;  //cambiamos el telefono_chofer por nombre_chofer
    private double adelanto;

    public Compra() {
        this.folio_compra = 0;
        this.total_compra = 0;
        this.id_provedor = 0;
        this.nombre_provedor = "";
        this.telefono = "";
        this.nombre = "";
        this.metodo_pago = "";
        this.status = "";
        this.telefono_provedor = "";
        this.referencia = "";
        this.flete = "";
        this.costo_flete = 0;
        this.nombre_chofer = "";
        this.telefono_chofer = "";
        this.adelanto = 0;
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

    public String getTelefono_chofer() {
        return telefono_chofer;
    }

    public void setTelefono_chofer(String telefono_chofer) {
        this.telefono_chofer = telefono_chofer;
    }

    public String getNombre_chofer() {
        return nombre_chofer;
    }

    public void setNombre_chofer(String nombre_chofer) {
        this.nombre_chofer = nombre_chofer;
    }

    public double getAdelanto() {
        return adelanto;
    }

    public void setAdelanto(double adelanto) {
        this.adelanto = adelanto;
    }

    
    
}

