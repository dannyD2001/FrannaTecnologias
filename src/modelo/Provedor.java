package modelo;
public class Provedor {
    private int id_provedor;
    private String nombre;
    private String telefono;
    private String ciudad;
    private String referencia;    
    //contructor vacio
        public Provedor() {
        this.id_provedor = 0;
        this.nombre = "";
    }
    //constructor con dos campos 
    public Provedor(int id_provedor, String nombre) {
        this.id_provedor = id_provedor;
        this.nombre = nombre;
    }
    public Provedor(int id_provedor, String nombre, String telefono, String ciudad, String referencia) {
        this.id_provedor = id_provedor;
        this.nombre = nombre;
        this.telefono = telefono;
        this.ciudad = ciudad;
        this.referencia = referencia;
    }
    public int getId_provedor() {
        return id_provedor;
    }
    public void setId_provedor(int id_provedor) {
        this.id_provedor = id_provedor;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getCiudad() {
        return ciudad;
    }
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    public String getReferencia() {
        return referencia;
    }
    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }    
    @Override
    public String toString() {
        return String.valueOf(this.nombre); // Esto asegura que se muestre el id_prove
    }           
}

