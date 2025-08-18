import java.util.Scanner;
public class ObjetoCadeira {
    public static void main (String[] args){
        Scanner ler = new Scanner (System.in);
        Cadeira cadeira = new Cadeira ();

        for (int i = 0; i < 3; i++){
            System.out.println("Informe os seguintes aspectos de sua cadeira. \n ---FICHA "+(i+1)+"---");
            System.out.print("Tipo: ");
            cadeira.setTipo(ler.nextLine());
            System.out.print("Cor: ");
            cadeira.setCor(ler.nextLine());
            System.out.print("Material: ");
            cadeira.setMaterial(ler.nextLine());
            System.out.print("Quantidade de pés: ");
            cadeira.setQntdPes(ler.nextInt ());
            ler.nextLine();
            System.out.println("---FICHA "+(i+1)+"---");
            System.out.println(cadeira.getTipo());
            System.out.println(cadeira.getCor());
            System.out.println(cadeira.getMaterial());
            System.out.println(cadeira.getQntdPes());
            System.out.println("-------------------");
        }

    }
}
