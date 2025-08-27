package Atividades;
import java.util.Scanner;
public class ObjetoConsulta {
    public static void main (String [] args ){
        Scanner ler = new Scanner (System.in);
        Consulta consulta3 = new Consulta("02/08/2025", "Joana", "Stefanie");
        Consulta consulta2 = new Consulta ("Peter", "Stefanie");
        Consulta consulta1 = new Consulta ();

        System.out.print("Insira o nome do paciente: ");
        consulta1.setNomePcnte(ler.next());

        System.out.println("----Consulta 1 ----");
        System.out.println(consulta1.getNomePcnte());
        System.out.println("----Consulta 2 ----");
        System.out.println(consulta2.getNomePcnte());
        System.out.println(consulta2.getNomeDents());
        System.out.println("----Consulta 3 ----");
        System.out.println(consulta3.getData());
        System.out.println(consulta3.getNomePcnte());
        System.out.println(consulta3.getNomeDents());
    }
}
