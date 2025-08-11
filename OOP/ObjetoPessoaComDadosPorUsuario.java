package OOP;
import java.util.Scanner;

public class ObjetoPessoaComDadosPorUsuario{
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa();



        System.out.println("Informe 1º o nome: ");
        pessoa1.setNome(ler.next());
        System.out.println("Informe a 1º idade: ");
        pessoa1.setIdade(ler.nextInt());
        System.out.println("Informe o 1º endereço: ");
        pessoa1.setEndereco(ler.next());
        ler.nextLine();
        System.out.println("Informe a 1º profissão: ");
        pessoa1.setProfissao(ler.next());
        ler.nextLine();

        System.out.println("Informe 2º o nome: ");
        pessoa2.setNome(ler.next());
        System.out.println("Informe a 2º idade: ");
        pessoa2.setIdade(ler.nextInt());
        System.out.println("Informe o 2º endereço: ");
        pessoa2.setEndereco(ler.next());
        ler.nextLine();
        System.out.println("Informe a 2º profissão: ");
        pessoa2.setProfissao(ler.next());
        ler.nextLine();

        System.out.println("---- OBJETO 1 ----");
        System.out.println(pessoa1.getNome());
        System.out.println(pessoa1.getIdade());
        System.out.println(pessoa1.getEndereco());
        System.out.println(pessoa1.getProfissao());

        System.out.println("---- OBJETO 2 ----");
        System.out.println(pessoa2.getNome());
        System.out.println(pessoa2.getIdade());
        System.out.println(pessoa2.getEndereco());
        System.out.println(pessoa2.getProfissao());
    }
}
