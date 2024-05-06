/**
 * Exemplo aperfeiçoado para estrutura de repetição WHILE 
 * enquanto houver dinheiro para comprar o doce oferecido (gerado aleatóriamente) o laço continua
 * import java.util.concurrent.ThreadLocalRandom para gerar valor dos doces
 */

import java.util.concurrent.ThreadLocalRandom; 

public class ExemploWhile {

    public static void main(String[] args) {
        double mesada = 50.0;
        double valorDoce = 0;

        while (mesada > 0) {
            valorDoce = valorAleatorio();

            //alteração do código original para interromper o loop quando não houver dinheiro para comprar o doce oferecido
            if (valorDoce > mesada) { 
                break;
            } else {
                System.out.println("Doce de valor: " + valorDoce + " adicionado no carrinho");
                mesada = mesada - valorDoce;
            }
        }
        System.out.println("Joãozinho não tem mais dinheiro suficiente para comprar o doce oferecido no valor de " + valorDoce + " Sobrou " + mesada + "da sua mesada.");

    }

    private static double valorAleatorio(){
        return ThreadLocalRandom.current().nextDouble(2,8);
    }    
}

