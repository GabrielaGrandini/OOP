package Modificador;
import java.util.Scanner;

public class ObjetoPessoaAutomovel {
    public static void main (String [] args){
        Scanner ler = new Scanner (System.in);
        Pessoa pessoa = new Pessoa ();

        String cor, nome;
        int velocidade;

        System.out.println("Informe a cor do carro: ");
        cor = ler.next ();

        System.out.println("Informeo nome do carro: ");
        nome = ler.next ();

        System.out.println("Informe a velocidade do carro: ");
        velocidade = ler.nextInt ();

        pessoa.compraCarro(nome,velocidade,cor);

        Automovel automovel = pessoa.getAutomovel();

        System.out.println("O carro comprado foi " + automovel.getNome()+ " da cor " + automovel.getCor() + " que atinge a velocidade de "+ automovel.getVelocidade());

        ler.close();
    }
}
