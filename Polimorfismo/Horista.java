package Polimorfismo;

public class Horista extends Funcionario {
    private int quantidadeHoras;
    private double valorHora;
    public Horista(long id, String nome, String telefone, int matricula, String endereco, int quantidadeHoras, double valorHora) {
        super(id, nome, telefone, matricula, endereco);
        this.quantidadeHoras = quantidadeHoras;
        this.valorHora = valorHora;
    }

    @Override
    public void calcularSalario (){
        salario = valorHora * quantidadeHoras;
        System.out.println("Salário Horista: R$ " + salario);
    }
}
