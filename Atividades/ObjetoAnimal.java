package Atividades;
import java.util.Scanner;
public class ObjetoAnimal {
    public static void main (String [] args) {
        Scanner ler = new Scanner(System.in);
        Animal animal1 = new Animal();
        Animal animal2 = new Animal(4.4F, "Preto", "Gato");
        Animal animal3 = new Animal(10, "Branco");

        System.out.print("Insira a espécie do animal: ");
        animal1.setEspecie(ler.next());

        System.out.println("----Animal 1 ----");
        System.out.println(animal1.getEspecie());
        System.out.println("----Animal 2 ----");
        System.out.println(animal2.getTamanho());
        System.out.println(animal2.getCor());
        System.out.println(animal2.getEspecie());
        System.out.println("----Animal 3 ----");
        System.out.println(animal3.getTamanho());
        System.out.println(animal3.getCor());
    }
}
