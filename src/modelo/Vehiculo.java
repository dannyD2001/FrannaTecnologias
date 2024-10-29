package modelo;
public class Vehiculo {
    private String placa;
    private String marca;

    public Vehiculo(String placa, String marca) {
        this.placa = placa;
        this.marca = marca;
    }
    public Vehiculo() {
        this.placa = "";
        this.marca = "";
    }
    //

    public Vehiculo(String placa) {
        this.placa = placa;
    }
    

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    @Override
     public String toString() {
        return this.placa; // Sobreescribir toString para que devuelva la placa
    }
}
