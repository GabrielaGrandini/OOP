package Atividades;

public class Carro {
    private String modelo;
    private String placa;
    private int numChassi;

    public Carro () {

    }
    public Carro (String modelo, String placa, int numChassi){
        this.modelo = modelo;
        this.placa = placa;
        this.numChassi = numChassi;
    }
    public Carro (String placa, int numChassi) {
        this.placa = placa;
        this.numChassi = numChassi;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getNumChassi() {
        return numChassi;
    }

    public void setNumChassi(int numChassi) {
        this.numChassi = numChassi;
    }
}
