import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        double saldo = 0; 
        // Loop infinito para manter o programa em execução até que o usuário decida sair
        while (true) { 
          System.out.println("******* MENU ********");
          System.out.println("1 - deposito");
          System.out.println("2 - sacar");
          System.out.println("3 - exibir saldo");
          System.out.println("0 - sair");
          System.out.println("Digite a opção desejada:");

            int opcao = scanner.nextInt(); 
        // TODO: Implemente as condições necessárias para avaliaa a opção escolhida:
        // Dica: Utilze o switch/case para o programa realizar as operações escolhidas pelo usuário.
            switch(opcao){
              case 1:{ 
                System.out.println("Digite o valor do depósito: ");
                double deposito = scanner.nextDouble();
                saldo = saldo + deposito;
                break;
              }
              case 2:{
                System.out.println("Digite o valor do saque: ");
                double saque = scanner.nextDouble();
                if(saque > saldo) {
                  System.out.println("não há saldo para este valor de saque!");
                  break;
                } 
                saldo = saldo - saque;
                break;
              }
              case 3:{
                System.out.println("o saldo atual é: " + saldo);
                break;
              }


        // Exibe mensagem de opção inválida se o usuário escolher uma opção inválida:    
              default:
                    System.out.println("Opção inválida. Tente novamente."); 
            }
          if (opcao == 0) {
            System.out.println("saindo...");
            break;
          } 
        }
    }
}