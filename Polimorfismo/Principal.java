package Polimorfismo;

public class Principal {
    public static void main (String [] args){
        System.out.println("Gamer");
        Gamer gamer = new Gamer();
        gamer.ligar();
        gamer.carregandoSistema();
        gamer.reiniciar();
        gamer.desligar();

        System.out.println("\nHome");
        Home home = new Home();
        home.ligar();
        home.carregandoSistema();
        home.reiniciar();
        home.desligar();
    }
}
