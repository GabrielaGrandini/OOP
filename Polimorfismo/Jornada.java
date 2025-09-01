package Polimorfismo;

public class Jornada extends Funcionario {
    private int horasTrabalhadas;
    private double salarioHora;
    public Jornada(long id, String nome, String telefone, int matricula, String endereco, int horasTrabalhadas, double salarioHora) {
        super(id, nome, telefone, matricula, endereco);
        this.horasTrabalhadas = horasTrabalhadas;
        this.salarioHora = salarioHora;
    }

    @Override
    public void calcularSalario (){
        salario = salarioHora * horasTrabalhadas;
        System.out.println("Salário jornada: R$ " + salario);
    }
}
