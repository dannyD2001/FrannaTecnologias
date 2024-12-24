package modelo;

public class Paca {
    private int id_paca;
    private int id_produccion;
    private double peso_kg;
    private String estado;

    public Paca(int id_paca, int id_produccion, double peso_kg, String estado) {
        this.id_paca = id_paca;
        this.id_produccion = id_produccion;
        this.peso_kg = peso_kg;
        this.estado = estado;
    }
    public Paca(int id_produccion, double peso_kg, String estado) {
        
        this.id_produccion = id_produccion;
        this.peso_kg = peso_kg;
        this.estado = estado;
    }

    public int getId_paca() {
        return id_paca;
    }

    public void setId_paca(int id_paca) {
        this.id_paca = id_paca;
    }

    public int getId_produccion() {
        return id_produccion;
    }

    public void setId_produccion(int id_produccion) {
        this.id_produccion = id_produccion;
    }

    public double getPeso_kg() {
        return peso_kg;
    }

    public void setPeso_kg(double peso_kg) {
        this.peso_kg = peso_kg;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
}
