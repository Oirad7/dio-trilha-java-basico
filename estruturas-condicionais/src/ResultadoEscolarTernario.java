/**
 * exercício operador ternário ( condição ? verdadeiro : falso ) aninhado
 * para definir com base na nota se aluno está aprovado, em recuperação ou reprovado
 */

public class ResultadoEscolarTernario {
    public static void main(String [] args){
        int nota = 7;
        String resultado = nota >= 7 ? "Aprovado" : (nota >= 5 && nota < 7) ? "Recuperação" : "Reprovado";
        System.out.println(resultado);

        }
}
