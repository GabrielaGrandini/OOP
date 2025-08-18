import java.util.Scanner;

public class ObjetoConvenio {
    public static void main (String[] args){
        Scanner ler = new Scanner (System.in);
        Convenio convenio = new Convenio ();

        System.out.println("---- FICHA ----");
        System.out.println("Nome: ");
        convenio.setNome(ler.nextLine ());
        System.out.println("Plano: ");
        convenio.setPlano(ler.nextLine());
        System.out.println("Tarifa: ");
        convenio.setTarifa(ler.nextDouble ());

        System.out.println("---- FICHA FINAL ----");
        System.out.println(convenio.getNome());
        System.out.println(convenio.getPlano());
        System.out.println(convenio.getTarifa());
    }
}
