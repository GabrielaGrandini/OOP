package Heranca.Atividade;

public class Veiculo {
    private String nome;
    private String modelo;
    private int ano;
    private String cor;

    public Veiculo (String nome, String modelo, int ano, String cor){
        this.nome = nome;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
