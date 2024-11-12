package modelo;

public class DetalleVenta {
    private int folio_venta;
    private String nombre_material; // Nuevo atributo para el nombre del material
    private int id_material;
    private double peso_bruto;
    private double peso_tara;
    private double peso_neto;
    private double descuento_porcentaje;
    private String observacion;
    private double subtotal;
    private double precio_selecionado; //nuevo
    //constru vacio
    public DetalleVenta() {
        this.folio_venta = 0;
        this.nombre_material = "";
        this.id_material = 0;
        this.peso_bruto = 0;
        this.peso_tara = 0;
        this.peso_neto = 0;
        this.descuento_porcentaje = 0;
        this.observacion = "";
        this.subtotal = 0;
    }
        

    public DetalleVenta(int folio_venta, String nombre_material, int id_material, double peso_bruto, double peso_tara, double peso_neto, double descuento_porcentaje, String observacion, double subtotal, double precio_selecionado) {
        this.folio_venta = folio_venta;
        this.nombre_material = nombre_material;
        this.id_material = id_material;
        this.peso_bruto = peso_bruto;
        this.peso_tara = peso_tara;
        this.peso_neto = peso_neto;
        this.descuento_porcentaje = descuento_porcentaje;
        this.observacion = observacion;
        this.subtotal = subtotal;
        this.precio_selecionado = precio_selecionado;
    }

    public DetalleVenta(int folio_venta, int id_material, double peso_bruto, double peso_tara, double peso_neto, double descuento_porcentaje, String observacion, double subtotal, double precio_selecionado) {
        this.folio_venta = folio_venta;
        this.id_material = id_material;
        this.peso_bruto = peso_bruto;
        this.peso_tara = peso_tara;
        this.peso_neto = peso_neto;
        this.descuento_porcentaje = descuento_porcentaje;
        this.observacion = observacion;
        this.subtotal = subtotal;
        this.precio_selecionado = precio_selecionado;
    }    

    public int getFolio_venta() {
        return folio_venta;
    }

    public void setFolio_venta(int folio_venta) {
        this.folio_venta = folio_venta;
    }

    public String getNombre_material() {
        return nombre_material;
    }

    public void setNombre_material(String nombre_material) {
        this.nombre_material = nombre_material;
    }

    public int getId_material() {
        return id_material;
    }

    public void setId_material(int id_material) {
        this.id_material = id_material;
    }

    public double getPeso_bruto() {
        return peso_bruto;
    }

    public void setPeso_bruto(double peso_bruto) {
        this.peso_bruto = peso_bruto;
    }

    public double getPeso_tara() {
        return peso_tara;
    }

    public void setPeso_tara(double peso_tara) {
        this.peso_tara = peso_tara;
    }

    public double getPeso_neto() {
        return peso_neto;
    }

    public void setPeso_neto(double peso_neto) {
        this.peso_neto = peso_neto;
    }

    public double getDescuento_porcentaje() {
        return descuento_porcentaje;
    }

    public void setDescuento_porcentaje(double descuento_porcentaje) {
        this.descuento_porcentaje = descuento_porcentaje;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getPrecio_selecionado() {
        return precio_selecionado;
    }

    public void setPrecio_selecionado(double precio_selecionado) {
        this.precio_selecionado = precio_selecionado;
    }
    
    
}
