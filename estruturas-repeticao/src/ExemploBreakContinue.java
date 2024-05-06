/**
 * Exemplo estrutura de repetição FOR com uso de BREAK e CONTINUE
 * FOR para iterar 4 vezes, com BREAK itera 2X na 3ª que é a condição sai e com CONTINUE itera 2X, na 3ª pula e itera a 4ª
 */
public class ExemploBreakContinue {
    
    public static void main(String[] args) {
        System.out.println("*** exemplo break quando === 3 ***");
        for(int numeroA = 1; numeroA < 5; numeroA++){
            if(numeroA == 3)
                break;
            System.out.println(numeroA);
        }

       System.out.println("*** exemplo continue quando == 3 ***");    
       for(int numeroB = 1; numeroB < 5; numeroB++){
        
            if(numeroB == 3)
                 continue;
                 System.out.println(numeroB);
         }                 
        }
    }

