package Polimorfismo;

public class SalarioFunc {
    public static void main (String [] args) {
        Jornada jornada = new Jornada (1, "João", "(11) 9999-9999", 12, "Avenida Paulista", 220, 50);
        Horista horista = new Horista (2, "Maria", "(11) 8888-8888", 11, "Avenida Paulista", 220, 55);
        PessoaJuridica pessoaJuridica = new PessoaJuridica (3, "Empresa XYZ", "(11) 9999-9999", 12, "Avenida Paulista",100000.5, 5000.3);

        jornada.calcularSalario();
        horista.calcularSalario();
        pessoaJuridica.calcularSalario();


    }
}
