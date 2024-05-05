/**
 * Classe para objetos do tipo Conta, onde serão contidos valores e métodos para o mesmo
 * @author Dario Moura
 */
public class Conta {
        int numero; 
        String agencia;
        String nomeCliente;
        double saldo;

        /**
         * Este método atribui o valor do parâmetro ao atributo agencia
         * @param parametroAgencia o número da agência a ser atribuido
         */
        public void registrarAgencia(String parametroAgencia) {
            agencia = parametroAgencia;
        }

        /**
         * Este método atribui o valor do parâmetro ao atributo numero (da conta)
         * @param parametroConta o número da conta
         */
        public void registrarConta(int parametroConta) {
            numero = parametroConta;
        }

        /**
         * Este método atribui o valor do parâmetro ao atributo nomeCliente
         * @param parametroNomeCliente o nome do cliente
         */
        public void registrarNomeCliente(String parametroNomeCliente) {
            nomeCliente = parametroNomeCliente;
        }

        /**
         * Este método atribui o valor do parâmetro ao atributo saldo
         * @param parametroSaldo o saldo da conta
         */
        public void registrarSaldo(double parametroSaldo) {
            saldo = parametroSaldo;
        }
      
}
