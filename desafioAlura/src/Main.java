import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner escolha = new Scanner(System.in);

        System.out.println("*****************************************************");
        System.out.println("Dados iniciais do cliente:\n\n");
        System.out.println("Nome completo:  João Patrick Leitão Pereira");
        System.out.println("Tipo da conta:  Corrente");
        double saldo = 2500.0;
        System.out.println("Saldo atual:    R$" + saldo);
        System.out.println("*****************************************************");

        System.out.println("\n\nOperações\n\n");
        System.out.println("1- Consultar saldos");
        System.out.println("2- Receber Valor");
        System.out.println("3- Transferir valor");
        System.out.println("4- Sair\n\n");

        System.out.print("Digite a opção desejada: ");
        int opcao = escolha.nextInt();

        while (opcao != 4) {

            if (opcao == 1) {
                System.out.println("Seu saldo atual é de: " + saldo + "\n");
                System.out.print("Digite a opção desejada: ");
                opcao = escolha.nextInt();
            }
            if (opcao == 2) {
                System.out.print("Digite o valor que você quer receber: ");
                double valorReceber = escolha.nextDouble();
                System.out.println("Feito! Seu saldo agora é de: R$" + (saldo += valorReceber) + "\n");
                System.out.print("Digite a opção desejada: ");
                opcao = escolha.nextInt();
            }
            if (opcao == 3) {
                System.out.print("Digite o valor que você quer retirar: ");
                double valorRetirar = escolha.nextDouble();
                System.out.println("Feito! Seu saldo agora é de: R$" + (saldo -= valorRetirar) + "\n");
                System.out.print("Digite a opção desejada: ");
                opcao = escolha.nextInt();
            }

            if (opcao != 4 && opcao != 3 && opcao != 2 && opcao != 1) {
                System.out.println("Código inválido, tente novamente!\n");
                System.out.print("Digite a opção desejada: ");
                opcao = escolha.nextInt();
            }
        }
    }
}