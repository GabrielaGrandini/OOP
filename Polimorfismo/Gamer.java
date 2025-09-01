package Polimorfismo;

public class Gamer implements Computador {
    @Override
    public void ligar() {
        System.out.println("Seja bem vindo! Ligando o computador.");
    }

    @Override
    public void reiniciar() {
        System.out.println("Reiniciando o sistema.");
    }

    @Override
    public void desligar() {
        System.out.println("Desligando o computador. Tchau!");
    }

    @Override
    public void carregandoSistema() {
        System.out.println("Carregando o sistema, aguarde :D ");
    }
}
