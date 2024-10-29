package modelo;

public class Cliente {

    private int id_cliente;
    private String nombre_cliente;
    private String apellido_p;
    private String telefono;
    private String ciudad;

    public Cliente(int id_cliente, String nombre_cliente, String apellido_p, String telefono, String ciudad) {
        this.id_cliente = id_cliente;
        this.nombre_cliente = nombre_cliente;
        this.apellido_p = apellido_p;
        this.telefono = telefono;
        this.ciudad = ciudad;
    }

    //contructor de 2

    public Cliente(int id_cliente, String nombre_cliente) {
        this.id_cliente = id_cliente;
        this.nombre_cliente = nombre_cliente;
    }
    
    
    
    public Cliente() {
        this.id_cliente = 0;
        this.nombre_cliente = "";
        this.apellido_p = "";
        this.telefono = "";
        this.ciudad = "";
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

    public String getApellido_p() {
        return apellido_p;
    }

    public void setApellido_p(String apellido_p) {
        this.apellido_p = apellido_p;
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
    @Override
    public String toString() {
        return String.valueOf(this.nombre_cliente); // Esto asegura que se muestre el nombre cliente
    }  
    
}
