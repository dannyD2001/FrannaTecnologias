package modelo;

public class Produccion {
    private int id_paca;
    private int id_material;
    private int kg_utilizados;
    private String nombre_material;

    // Constructor con parámetros
    public Produccion(int id_material, int kg_utilizados) {
        this.id_material = id_material;
        this.kg_utilizados = kg_utilizados;
    }

    // Constructor con más parámetros
    public Produccion(int id_paca, int id_material, int kg_utilizados, String nombre_material) {
        this.id_paca = id_paca;
        this.id_material = id_material;
        this.kg_utilizados = kg_utilizados;
        this.nombre_material = nombre_material;
    }

    // Constructor sin parámetros
    public Produccion() {
        // Este es el constructor sin parámetros
    }

    // Getters y Setters
    public int getId_paca() {
        return id_paca;
    }

    public void setId_paca(int id_paca) {
        this.id_paca = id_paca;
    }

    public int getId_material() {
        return id_material;
    }

    public void setId_material(int id_material) {
        this.id_material = id_material;
    }

    public int getKg_utilizados() {
        return kg_utilizados;
    }

    public void setKg_utilizados(int kg_utilizados) {
        this.kg_utilizados = kg_utilizados;
    }

    public String getNombre_material() {
        return nombre_material;
    }

    public void setNombre_material(String nombre_material) {
        this.nombre_material = nombre_material;
    }
}
