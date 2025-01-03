package modelo;

//constructor vacio
public class Categoria {
    private int id_categoria;
    private String nombre_categoria;
    public Categoria() {
        this.id_categoria = 0;
        this.nombre_categoria = "";
    }
    public Categoria(int id_categoria, String nombre_categoria) {
        this.id_categoria = id_categoria;
        this.nombre_categoria = nombre_categoria;
    }

    public int getId_categoria() {
        return id_categoria;
    }
    public void setId_categoria(int id_categoria) {
        this.id_categoria = id_categoria;
    }
    public String getNombre_categoria() {
        return nombre_categoria;
    }
    public void setNombre_categoria(String nombre_categoria) {
        this.nombre_categoria = nombre_categoria;
    }
    // Sobrescribimos toString para mostrar el nombre en el JComboBox
      @Override
    public String toString() {
        return nombre_categoria; // Esto es lo que mostrará el JComboBox
    }
}
