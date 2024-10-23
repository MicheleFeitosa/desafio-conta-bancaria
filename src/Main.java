import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nome = "Michele Feitosa";
        String tipoConta = "Corrente";
        double saldo = 2599.99;
        int opcao = 0;

        System.out.println("***********************************");
        System.out.println("\nNome do Cliente: " + nome);
        System.out.println("Tipo de conta: " + tipoConta);
        System.out.println("Saldo atual: " + saldo);
        System.out.println("\n***********************************");

        String menu = """
                
                ** Digite sua opção **
                 1 - Consultar saldo
                 2 - Transferir valor
                 3 - Receber valor\s
                 4 - Sair
                 
                """;

        Scanner leitura = new Scanner(System.in);

        while( opcao != 4){
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 1) {
                System.out.println("O saldo atual é de: " + saldo);
            } else if (opcao == 2){
                System.out.println("Qual o valor você deseja transferir?");
                double valor = leitura.nextDouble();
                if (valor > saldo){
                    System.out.println("Saldo insuficiente para transferência!");
                } else {
                    saldo -= valor;
                    System.out.println("Saldo atual: " + saldo);
                }
            } else if (opcao == 3){
                System.out.println("Valor recebido: ");
                double valor = leitura.nextDouble();
                saldo += valor;
                System.out.println("Saldo atual: " + saldo);
            } else if (opcao != 4) {
                System.out.println("Opção inválida, digite novamente.");
            }

        }
    }
}