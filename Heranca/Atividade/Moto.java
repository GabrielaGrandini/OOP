package Heranca.Atividade;

public class Moto extends Veiculo {
    private int cilindrada;

    public Moto (String nome, String modelo, int ano, String cor, int cilindrada){
        super(nome, modelo, ano, cor);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
}
