
package modelo;

public class Chofer {
    private String telefono_chofer;
    private String nombre;
    private String apellido_p;
    private String tipo_chofer;
    private String placa;

    public Chofer(String telefono_chofer, String nombre, String apellido_p, String tipo_chofer, String placa) {
        this.telefono_chofer = telefono_chofer;
        this.nombre = nombre;
        this.apellido_p = apellido_p;
        this.tipo_chofer = tipo_chofer;
        this.placa = placa;
    }

    public Chofer(String telefono_chofer) {
        this.telefono_chofer = telefono_chofer;
    }
    
    

     public Chofer() {
        this.telefono_chofer = "";
        this.nombre = "";
        this.apellido_p = "";
        this.tipo_chofer = "";
        this.placa = "";
    }

    public String getTelefono_chofer() {
        return telefono_chofer;
    }

    public void setTelefono_chofer(String telefono_chofer) {
        this.telefono_chofer = telefono_chofer;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido_p() {
        return apellido_p;
    }

    public void setApellido_p(String apellido_p) {
        this.apellido_p = apellido_p;
    }

    public String getTipo_chofer() {
        return tipo_chofer;
    }

    public void setTipo_chofer(String tipo_chofer) {
        this.tipo_chofer = tipo_chofer;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
        @Override
    public String toString() {
        return String.valueOf(this.nombre); // Esto asegura que se muestre el nombre chofer
        
    }  
}
