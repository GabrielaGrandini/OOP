package Atividades;

public class Animal {
    private float tamanho;
    private String cor;
    private String especie;

    public Animal () {

    }
    public Animal (float tamanho, String cor, String especie){
        this.tamanho = tamanho;
        this.cor = cor;
        this.especie = especie;
    }
    public Animal (float tamanho, String cor) {
        this.tamanho = tamanho;
        this.cor = cor;
    }

    public float getTamanho() {
        return tamanho;
    }

    public void setTamanho(float tamanho) {
        this.tamanho = tamanho;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }
}
