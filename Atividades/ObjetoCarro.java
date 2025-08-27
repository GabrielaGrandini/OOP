package Atividades;
import java.util.Scanner;
public class ObjetoCarro {
    public static void main (String [] args){
        Scanner ler = new Scanner (System.in);
        Carro carro1 = new Carro ();
        Carro carro2 = new Carro ("Nivus", "OQ67O8",23443);
        Carro carro3 = new Carro ("PQ85C0",3725);

        System.out.print("Insira o modelo do carro: ");
        carro1.setModelo(ler.next());

        System.out.println("Carro 1: ");
        System.out.println(carro1.getModelo());
        System.out.println("Carro 2: ");
        System.out.println(carro2.getModelo());
        System.out.println(carro2.getPlaca());
        System.out.println(carro2.getNumChassi());
        System.out.println("Carro 3: ");
        System.out.println(carro3.getPlaca());
        System.out.println(carro3.getNumChassi());

    }
}
