package modelo;
public class Provedor {
    private int id_provedor;
    private String nombre;
    private String telefono;
    private String ciudad;
    private String referencia;  
    private String correo_electronico;
    //contructor vacio
        public Provedor() {
        this.id_provedor = 0;
        this.nombre = "";
        this.correo_electronico = "";
    }
    //constructor con dos campos 
    public Provedor(int id_provedor, String nombre, String correo_electronico) {
        this.id_provedor = id_provedor;
        this.nombre = nombre;
        this.correo_electronico = correo_electronico;
    }

    public Provedor(int id_provedor, String nombre, String telefono, String ciudad, String referencia, String correo_electronico) {
        this.id_provedor = id_provedor;
        this.nombre = nombre;
        this.telefono = telefono;
        this.ciudad = ciudad;
        this.referencia = referencia;
        this.correo_electronico = correo_electronico;
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

    public String getCorreo_electronico() {
        return correo_electronico;
    }

    public void setCorreo_electronico(String correo_electronico) {
        this.correo_electronico = correo_electronico;
    }
    
    @Override
    public String toString() {
        return String.valueOf(this.nombre); // Esto asegura que se muestre el id_prove
    }           
}

