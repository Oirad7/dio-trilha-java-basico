import javax.swing.event.SwingPropertyChangeSupport;

public class Operadores{

    public static void main(String [] args) {
/* 
// concatenação
        String nomeCompleto = "LINGUAGEM" + "JAVA";
        System.out.println(nomeCompleto);

        //concatenação
        String concatenacao ="?";

        concatenacao = 1+1+1+"1";
        System.out.println(concatenacao);
        
        concatenacao = 1+"1"+1+1;
        System.out.println(concatenacao);
        
        concatenacao = 1+"1"+1+"1";
        System.out.println(concatenacao);
        
        concatenacao = "1"+(1+1+1);
        System.out.println(concatenacao);

*/

/*
        //OPERADOR TORNAR NÚMERO NEGATIVO
        int numero = 5;

        System.out.println(- numero);

        System.out.println(numero);

        numero = - numero;

        System.out.println(numero);

        //tornar o número negativo em numero positivo
        numero = - numero;

        System.out.println(numero);
 */

 /*
        //OPERADOR INCREMENTO E DECREMENTO

        int numero = 5;
        numero++;
        System.out.println(numero);

        //imprimie e depois atualiza
        System.out.println(numero++);
        System.out.println(numero);

        //atualiza e imprimie 
        System.out.println(numero);
        System.out.println(++numero);
        System.out.println(numero);        

        //decremento é equivalente
        System.out.println(--numero);        

        //operador negação
        boolean variavel = true;
        System.out.println(variavel);
        System.out.println(!variavel);
        System.out.println(variavel);
        System.out.println("alterando o valor da variável");
        variavel = !variavel;
        System.out.println(variavel);
 */

 /*
         //OPERADORES RELACIONAIS 
        int a = 5,b = 6;



        System.out.println("a > b ? " + (a > b));
        System.out.println("a < b ? " + (a < b));
        System.out.println("a == b ? " + (a == b));
        System.out.println("a != b ? " + (a != b));        


        String nomeUm = "Dario";
        String nomeDois = "Dario";

        System.out.println("nomeUm == nomeDois ?" + (nomeUm == nomeDois));

        String nome3 = new String("Dario");
        String nome4 = new String("Dario");

        System.out.println("Usando objetos string nome3 == nome4 ?" + (nome3 == nome4));
        System.out.println("Usando objetos string e comparando com equals nome3 == nome4 ?" + nome3.equals(nome4));
 */


        /*
        //OPERADOR TERNÁRIO
        int a,b;

        a = 6;
        b = 5;

        String resultado = a > b ? "verdadeiro" : "falso";
        System.out.println(resultado);

        resultado = a < b ? "verdadeiro" : "falso";
        System.out.println(resultado);

         */

         //OPERADORES LÓGICOS && ||

         boolean condicao1 = true;
         boolean condicao2 = false;

         if(condicao1 && condicao2){
            System.out.println("AND - as duas condiçõe verdadeira");
         }

         if(condicao1 || condicao2){
            System.out.println("OR - uma das condiçõe verdadeira");
         }

         if((condicao1 || condicao2) && (7>4)){
            System.out.println("E avaliando duas condições - as duas condiçõe verdadeiras");
         }



    }   
    
}