/**
 * exercício condicional SWITCH em cascata sem uso de break, acumulando os benefícos, 
 * do plano, a estrutura do switch foi montada com o plano menor na base e os maiores acima
 */

public class PlanoOperadora {
    public static void main(String[] args) {
        String plano = "B"; //M //I

        switch (plano) {
            case "I":{
                System.out.println("5Gb Youtube");
            }
            case "M":{
                System.out.println("Whats e Instagram grátis");
            }
            case "B":{
                System.out.println("100 mintos de ligação");
            }

        }

    }
}
