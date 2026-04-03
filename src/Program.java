import java.util.Scanner;

import static java.text.ChoiceFormat.nextDouble;

public class Program {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ContaBancaria conta = new ContaBancaria("Leonardo", 300.00);
        int opcao;

        do {
            System.out.println("--------------------------");
            System.out.println("--------------------------");
            System.out.println("$$$$ Banco do Povão - O Banco com a cara do povo $$$$");
            System.out.println("MENU INICIAL");
            System.out.println("Escolha uma das opções a seguir:");
            System.out.println("--------------------------");
            System.out.println("1 - Deposito");
            System.out.println("2 - Saque em Espécie");
            System.out.println("3 - Ver saldo");
            System.out.println("0 - Sair");
            System.out.println("--------------------------");
            System.out.println("DIGITE AQUI: ");

            opcao = scanner.nextInt();

            switch (opcao) {

                case 1:
                    System.out.print("Digite o valor do deposito: ");
                    double deposito = scanner.nextDouble();
                    conta.depositar(deposito);
                    System.out.println("--------------------------");
                    System.out.println("--------------------------");
                    break;

                case 2:
                    System.out.print("Digite o valor do saque: ");
                    double saque = scanner.nextDouble();
                    conta.sacar(saque);
                    System.out.println("--------------------------");
                    System.out.println("--------------------------");
                    break;

                case 3:
                    conta.mostrarSaldo();
                    System.out.println("--------------------------");
                    System.out.println("--------------------------");
                    break;

                case 0:
                    System.out.println("Encerrando");
                    System.out.println("Obrigado por usar nossos serviços!");
                    System.out.println("--------------------------");
                    System.out.println("--------------------------");
                    break;

                default:
                    System.out.println("Opção Inválida");

            }

        }
        while (opcao != 0);
        scanner.close();
    }
}
