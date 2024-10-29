package modelo;
/**
 *
 * @author Danny Dominguez
 */
public class Venta {
    int folio_venta;
    String fecha_venta;
    String hora_venta;
    double total_venta;

    public Venta(int folio_venta, String fecha_venta, String hora_venta, double total_venta) {
        this.folio_venta = folio_venta;
        this.fecha_venta = fecha_venta;
        this.hora_venta = hora_venta;
        this.total_venta = total_venta;
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

    public String getHora_venta() {
        return hora_venta;
    }

    public void setHora_venta(String hora_venta) {
        this.hora_venta = hora_venta;
    }

    public double getTotal_venta() {
        return total_venta;
    }

    public void setTotal_venta(double total_venta) {
        this.total_venta = total_venta;
    }
    


}
