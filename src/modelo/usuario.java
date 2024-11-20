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
    private String inicio_sesion;
    private String ultimo_acceso;
        //constructor vacio
    public usuario() {
        this.telefono = "";
        this.nombre = "";
        this.apellidoP = "";
        this.apellidoM = "";
        this.contraseña = "";
        this.tipo_usuario = "";
    }

    //constructor
    public usuario(String telefono, String nombre, String apellidoP, String apellidoM, String contraseña, String tipo_usuario, String inicio_sesion, String ultimo_acceso) {
        this.telefono = telefono;
        this.nombre = nombre;
        this.apellidoP = apellidoP;
        this.apellidoM = apellidoM;
        this.contraseña = contraseña;
        this.tipo_usuario = tipo_usuario;
        this.inicio_sesion = inicio_sesion;
        this.ultimo_acceso = ultimo_acceso;
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

    public String getInicio_sesion() {
        return inicio_sesion;
    }

    public void setInicio_sesion(String inicio_sesion) {
        this.inicio_sesion = inicio_sesion;
    }

    public String getUltimo_acceso() {
        return ultimo_acceso;
    }

    public void setUltimo_acceso(String ultimo_acceso) {
        this.ultimo_acceso = ultimo_acceso;
    }
    
    @Override
    public String toString() {
        return String.valueOf(this.nombre); // Esto asegura que se muestre el nombre del usuario
        
    }  
   
}
