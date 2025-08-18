import java.util.Scanner;
public class ObjetoAviao {
    public static void main (String[] args) {
        Aviao aviao1 = new Aviao ();
        Aviao aviao2 = new Aviao ();
        Aviao aviao3 = new Aviao ();
        Scanner ler = new Scanner (System.in);

        System.out.println("Preencha as seguintes fichas de seu avião. \n---FICHA 1---");
        System.out.print("Tipo: ");
        aviao1.setTipo(ler.nextLine());
        System.out.print("Cor: ");
        aviao1.setCor(ler.nextLine());
        System.out.print("Velocidade: ");
        aviao1.setVelocidade(ler.nextInt());
        System.out.print("Quantidade de Assentos: ");
        aviao1.setQuantidadeAssento(ler.nextInt ());

        ler.nextLine();

        System.out.println("---FICHA 2---");
        System.out.print("Tipo: ");
        aviao2.setTipo(ler.nextLine());
        System.out.print("Cor: ");
        aviao2.setCor(ler.nextLine());
        System.out.print("Velocidade: ");
        aviao2.setVelocidade(ler.nextInt());
        System.out.print("Quantidade de Assentos: ");
        aviao2.setQuantidadeAssento(ler.nextInt ());

        ler.nextLine();

        System.out.println("---FICHA 3---");
        System.out.print("Tipo: ");
        aviao3.setTipo(ler.nextLine());
        System.out.print("Cor: ");
        aviao3.setCor(ler.nextLine());
        System.out.print("Velocidade: ");
        aviao3.setVelocidade(ler.nextInt());
        System.out.print("Quantidade de Assentos: ");
        aviao3.setQuantidadeAssento(ler.nextInt ());

        System.out.println("---AVIÃO 1---");
        System.out.println(aviao1.getTipo());
        System.out.println(aviao1.getCor());
        System.out.println(aviao1.getVelocidade());
        System.out.println(aviao1.getQuantidadeAssento());

        System.out.println("---AVIÃO 2---");
        System.out.println(aviao2.getTipo());
        System.out.println(aviao2.getCor());
        System.out.println(aviao2.getVelocidade());
        System.out.println(aviao2.getQuantidadeAssento());

        System.out.println("---AVIÃO 3---");
        System.out.println(aviao3.getTipo());
        System.out.println(aviao3.getCor());
        System.out.println(aviao3.getVelocidade());
        System.out.println(aviao3.getQuantidadeAssento());

    }
}
