package modelo;
/**
 *
 * @author Danny Dominguez
 */
public class Material {
    private int id_material;
    private String nombre_material;
    private int cantidad_kg;
    private double precio_compra;
    private int id_categoria;
    private String unidad_de_medida;
    private double precio_compra2;
    private double precio_compra3;
    private double precio_venta;
    private double precio_venta2;
    private double precio_venta3;
    private double precio_compra4;
    private double precio_compra5;
       // Constructor con 8 parámetros
    public Material(int id_material, String nombre_material, int cantidad_kg, double precio_compra, double precio_venta, double precio_compra2, double precio_compra3, double precio_venta2, double precio_venta3, double precio_compra4, double precio_compra5) {    
        this.id_material = id_material;
        this.nombre_material = nombre_material;
        this.cantidad_kg = cantidad_kg;
        this.precio_compra = precio_compra;
        this.precio_venta = precio_venta;
        this.precio_compra2 = precio_compra2;
        this.precio_compra3 = precio_compra3;
        this.precio_venta2 = precio_venta2;
        this.precio_venta3 = precio_venta3;
        this.precio_compra4 = precio_compra4;
        this.precio_compra5 = precio_compra5;
    }
    //constructor vacio
    public Material() {
        this.id_material = 0;
        this.nombre_material = "";
        this.cantidad_kg = 0;
        this.precio_compra = 0;
        this.precio_venta = 0;
        this.id_categoria = 0;
        this.unidad_de_medida = "";
        this.precio_compra2 = 0;
        this.precio_compra3 = 0;
        this.precio_venta2 = 0;
        this.precio_venta3 = 0;
        this.precio_compra4 = 0;
        this.precio_compra5 = 0;
    }

    public Material(int id_material, String nombre_material, int cantidad_kg, double precio_compra, int id_categoria, String unidad_de_medida, double precio_compra2, double precio_compra3, double precio_venta, double precio_venta2, double precio_venta3, double precio_compra4, double precio_compra5) {
        this.id_material = id_material;
        this.nombre_material = nombre_material;
        this.cantidad_kg = cantidad_kg;
        this.precio_compra = precio_compra;
        this.id_categoria = id_categoria;
        this.unidad_de_medida = unidad_de_medida;
        this.precio_compra2 = precio_compra2;
        this.precio_compra3 = precio_compra3;
        this.precio_venta = precio_venta;
        this.precio_venta2 = precio_venta2;
        this.precio_venta3 = precio_venta3;
        this.precio_compra4 = precio_compra4;
        this.precio_compra5 = precio_compra5;
    }

    public int getId_material() {
        return id_material;
    }

    public void setId_material(int id_material) {
        this.id_material = id_material;
    }

    public String getNombre_material() {
        return nombre_material;
    }

    public void setNombre_material(String nombre_material) {
        this.nombre_material = nombre_material;
    }

    public int getCantidad_kg() {
        return cantidad_kg;
    }

    public void setCantidad_kg(int cantidad_kg) {
        this.cantidad_kg = cantidad_kg;
    }

    public double getPrecio_compra() {
        return precio_compra;
    }

    public void setPrecio_compra(double precio_compra) {
        this.precio_compra = precio_compra;
    }

    public int getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(int id_categoria) {
        this.id_categoria = id_categoria;
    }

    public String getUnidad_de_medida() {
        return unidad_de_medida;
    }

    public void setUnidad_de_medida(String unidad_de_medida) {
        this.unidad_de_medida = unidad_de_medida;
    }

    public double getPrecio_compra2() {
        return precio_compra2;
    }

    public void setPrecio_compra2(double precio_compra2) {
        this.precio_compra2 = precio_compra2;
    }

    public double getPrecio_compra3() {
        return precio_compra3;
    }

    public void setPrecio_compra3(double precio_compra3) {
        this.precio_compra3 = precio_compra3;
    }

    public double getPrecio_venta() {
        return precio_venta;
    }

    public void setPrecio_venta(double precio_venta) {
        this.precio_venta = precio_venta;
    }

    public double getPrecio_venta2() {
        return precio_venta2;
    }

    public void setPrecio_venta2(double precio_venta2) {
        this.precio_venta2 = precio_venta2;
    }

    public double getPrecio_venta3() {
        return precio_venta3;
    }

    public void setPrecio_venta3(double precio_venta3) {
        this.precio_venta3 = precio_venta3;
    }

    public double getPrecio_compra4() {
        return precio_compra4;
    }

    public void setPrecio_compra4(double precio_compra4) {
        this.precio_compra4 = precio_compra4;
    }

    public double getPrecio_compra5() {
        return precio_compra5;
    }

    public void setPrecio_compra5(double precio_compra5) {
        this.precio_compra5 = precio_compra5;
    }
       
    @Override
    public String toString() {
        return String.valueOf(this.nombre_material); // Esto asegura que se muestre el id_material
    }
}
