package ZOO;

import java.util.Scanner;

public class ObjetoAnimal {
    public static void main (String[] args){
        Scanner ler = new Scanner (System.in);
        Animal animal1 = new Animal ();

        System.out.println("---- FICHA ----");
        System.out.print("Nome: ");
        animal1.setNome(ler.nextLine());
        System.out.print("Espécie: ");
        animal1.setEspecie(ler.nextLine());
        System.out.print("Idade: ");
        animal1.setIdade(ler.nextInt());
        System.out.print("Peso: " );
        animal1.setPeso(ler.nextDouble());

        System.out.println("---- DADOS ----");
        System.out.println(animal1.getNome());
        System.out.println(animal1.getEspecie());
        System.out.println(animal1.getIdade());
        System.out.println(animal1.getPeso());

    }
}
