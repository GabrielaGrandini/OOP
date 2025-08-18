package Computador;

import java.util.Scanner;
public class ObjetoComputador {
    public static void main (String[] args){
        Scanner ler = new Scanner (System.in);
        Computador computador = new Computador();

        for (int i = 0; i < 3; i++){
            System.out.println("Informe os seguintes dados do computador. \n ---FICHA "+(i+1)+"---");
            System.out.print("Marca: ");
            computador.setMarca(ler.nextLine());
            System.out.print("Modelo: ");
            computador.setModelo(ler.nextLine());
            System.out.print("Sistema Operacional: ");
            computador.setSistemaOperacional(ler.nextLine());
            System.out.print("Memória: ");
            computador.setMemoria(ler.nextInt ());
            System.out.print("SSD: ");
            computador.setSsd(ler.nextInt ());
            System.out.print("Monitor: ");
            computador.setMonitor(ler.nextInt ());
            System.out.print("CPU:  ");
            computador.setCpu(ler.next());
            ler.nextLine();
            System.out.print("Cooler: ");
            computador.setCooler(ler.nextLine());
            System.out.print("Placa-Mãe: ");
            computador.setPlacaMae(ler.nextLine());
            System.out.println("---FICHA "+(i+1)+"---");
            System.out.println(computador.getMarca());
            System.out.println(computador.getModelo());
            System.out.println(computador.getSistemaOperacional());
            System.out.println(computador.getMemoria());
            System.out.println(computador.getSsd());
            System.out.println(computador.getMonitor());
            System.out.println(computador.getCpu());
            System.out.println(computador.getCooler());
            System.out.println(computador.getPlacaMae());
            System.out.println("-------------------");
        }

    }
}
