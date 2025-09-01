package Heranca.Atividade;

public class PrincipalVeiculo {
    public static void main (String [] args){
        Veiculo veiculo = new Veiculo("Volvo", "FH", 1998, "Branco");
        System.out.println("Veículo");
        System.out.println("Nome: " + veiculo.getNome());
        System.out.println("Modelo: " + veiculo.getModelo());
        System.out.println("Ano: " + veiculo.getAno());
        System.out.println("Cor: " + veiculo.getCor());

        Automovel automovel = new Automovel("Fiat", "Cronos", 2018, "Vermelho", 4, "1.0 Firefly de três cilindros");
        System.out.println("\nAutomóvel ");
        System.out.println("Nome: " + automovel.getNome());
        System.out.println("Modelo: " + automovel.getModelo());
        System.out.println("Ano: " + automovel.getAno());
        System.out.println("Cor: " + automovel.getCor());
        System.out.println("Número de portas: " + automovel.getNumeroPortas());
        System.out.println("Motor: " + automovel.getMotor());

        Moto moto = new Moto("Honda", "CG 160 Titan",2015, "Preto", 162);
        System.out.println("\nMoto ");
        System.out.println("Nome: " + moto.getNome());
        System.out.println("Modelo: " + moto.getModelo());
        System.out.println("Ano: " + moto.getAno());
        System.out.println("Cor: " + moto.getCor());
        System.out.println("Cilindradas: " + moto.getCilindrada());
    }
}
