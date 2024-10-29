package modelo;
/**
 *
 * @author Danny Dominguez
 */
public class usuario {
    //atributos
    private String telefono;
    private String nombre;
    private String apellidoP;
    private String apellidoM;
    private String contraseña;
    private String tipo_usuario;
        //constructor vacio
    public usuario() {
        this.telefono = "";
        this.nombre = "";
        this.apellidoP = "";
        this.apellidoM = "";
        this.contraseña = "";
        this.tipo_usuario = "";
    }

    public usuario(String telefono, String nombre, String apellidoP, String apellidoM, String contraseña, String tipo_usuario) {
        this.telefono = telefono;
        this.nombre = nombre;
        this.apellidoP = apellidoP;
        this.apellidoM = apellidoM;
        this.contraseña = contraseña;
        this.tipo_usuario = tipo_usuario;
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

    public String getApellidoP() {
        return apellidoP;
    }

    public void setApellidoP(String apellidoP) {
        this.apellidoP = apellidoP;
    }

    public String getApellidoM() {
        return apellidoM;
    }

    public void setApellidoM(String apellidoM) {
        this.apellidoM = apellidoM;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getTipo_usuario() {
        return tipo_usuario;
    }

    public void setTipo_usuario(String tipo_usuario) {
        this.tipo_usuario = tipo_usuario;
    }

   
    

   
}
