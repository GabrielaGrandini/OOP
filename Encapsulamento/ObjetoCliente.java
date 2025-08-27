package Encapsulamento;

public class ObjetoCliente {
    public static void main (String [] args) {
        Cliente cliente1 = new Cliente();

        cliente1.setId(123456789);
        cliente1.setNome("Gabriela");
        cliente1.setTelefone("12345-1234");
        cliente1.setCpf("111.222.333-44");
        cliente1.setRg("123.456.789-10");

        System.out.println(cliente1.getId());
        System.out.println(cliente1.getNome());
        System.out.println(cliente1.getTelefone());
        System.out.println(cliente1.getCpf());
        System.out.println(cliente1.getRg());

    }
}
