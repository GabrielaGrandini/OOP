package Encapsulamento;

public class ObjetoTema {
    public static void main(String[] args) {

        Tema tema1 = new Tema (12345789,"Harvey Nomikos", 1000.00, "Preto" );

        System.out.println(tema1.getId());
        System.out.println(tema1.getNome());
        System.out.println(tema1.getValorAluguel());
        System.out.println(tema1.getCorToalha());
    }
}
