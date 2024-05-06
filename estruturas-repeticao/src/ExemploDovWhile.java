/**
 * Exemplo da estrutura de repetição DO WHILE 
 * dica-se o telefone e enquanto não atender continua tocando
 * import java.util.Random para gerar se atendeu ou não
 */

import java.util.Random;
public class ExemploDovWhile {
	public static void main(String[] args) {
		
		System.out.println("Discando...");
		
		do {
			System.out.println("Telefone tocando");
		}while(tocando());
		
		System.out.println("Alô !!!");
	}

	private static boolean tocando() {
		boolean atendeu = new Random().nextInt(3)==1;
		System.out.println("Atendeu? " + atendeu);
		return ! atendeu;
	}
}