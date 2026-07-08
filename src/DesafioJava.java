import java.util.Scanner;

public class DesafioJava {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int valor;
        int operacao = 0;
        String nome = "Jaccqueline Oliveira";
        String tipoConta = "Conta Corrente";
        int saldoInicial = 2500;

        System.out.println(""" 
                Dados iniciais do cliente:
                """);
        System.out.println("Nome: "+ nome);
        System.out.println("Tipo Conta: "+ tipoConta);
        System.out.println("Saldo inicial: "+ saldoInicial);

        System.out.println("""
                *******************************************************
                
                Operações 
                
                1- Consultar Saldos
                2- Receber Valor
                3- Transferir Valor
                4- Sair""");
        operacao = leitura.nextInt();

        while (operacao != -1) {

            if (operacao == 1) {
                System.out.println("Seu saldo é " + saldoInicial);
            } else if (operacao == 2) {
                System.out.println("Digite o valor a receber: ");
                valor = leitura.nextInt();
                valor = saldoInicial + valor;
                System.out.println("Saldo atual: " + valor);
            } else if (operacao == 3) {
                System.out.println("Digite o valor a transferir: ");
                valor = leitura.nextInt();

                if (valor <= saldoInicial) {
                    valor = saldoInicial - valor;
                    System.out.println("Saldo atual: " + valor);
                } else {
                    System.out.println("Saldo insuficiente para transferência.");
                }
            } else {
                System.out.println("Opção inválida.");
            }
            System.out.println("\nDigite a próxima operação (ou -1 para sair): ");
            operacao = leitura.nextInt();
        }
    }
}