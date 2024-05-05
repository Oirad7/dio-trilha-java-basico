import java.util.Locale;
import java.util.Scanner;


public class ContaTerminal {


    public static void main(String[] args) {

        Conta conta = new Conta();
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da Agência !");
        conta.agencia = scanner.next();
        
        System.out.println("Por favor, digite o número da Conta !");
        conta.numero = scanner.nextInt();

        System.out.println("Por favor, digite o nome do cliente !");
        conta.nomeCliente = scanner.next();

        System.out.println("Por favor, digite o saldo da conta !");
        conta.saldo = scanner.nextDouble();

        System.out.println("Olá " + conta.nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + conta.agencia + ", conta.conta " + conta.numero + " e seu saldo " + conta.saldo + " já está disponível para saque");
         
    }
}

