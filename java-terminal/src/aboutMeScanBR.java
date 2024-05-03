import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class aboutMeScanBR {
    public static void main(String[] args) {
 
        Locale l = new Locale("pt","BR");
        Locale.setDefault(l);
        NumberFormat nf = NumberFormat.getInstance(l);

        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite seu nome");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome");
        String sobrenome = scanner.next();

        System.out.println("Digite sua idade");
        int idade = scanner.nextInt();

        System.out.println("Digite sua altura em metros");
        double altura = scanner.nextDouble();

        System.out.println("Ola meu nome e: " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos");
        System.out.println("Minha altura e " + nf.format(altura) + " m");
        

    }
    
}
