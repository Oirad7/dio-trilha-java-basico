//aula sobre javadoc 
//comando para javadoc: javadoc -encoding UTF-8 docencoding ISO-8859-1 -d ../docs  src/*.java 

/**
 * Calculadora
 * A Calculadora realiza operações matemáticas entre números inteiros 
 * <b>Note: </b>Leia atemtamemte a documentação desta classe
 * para desfrutar dos recursos oferecidos pelo autor
 * 
 * @author Gleyson Sampaio
 * @version 1.0
 * @since 01/01/2022
 * 
 */

public class Calculadora {
    /**
     * Este método é utilizado para somar dois númeero inteiros
     * @param numeroUm este é oprimeiro parâmetro do método
     * @param numeroDois este é o segundo parâmetro do método
     * @return int o resultado deste método é a soma dos dois números
     */
    public int somar(int numeroUm, int numeroDois){
        return (numeroUm + numeroDois);

    }
}
