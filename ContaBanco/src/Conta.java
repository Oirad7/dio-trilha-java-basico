import java.util.Locale;
import java.util.Scanner;

public class Conta {
        int numero; 
        String agencia;
        String nomeCliente;
        double saldo;

        public void registrarAgencia(String parametroAgencia) {
            agencia = parametroAgencia;
        }

        public void registrarConta(int parametroConta) {
            numero = parametroConta;
        }

        public void registrarNomeCliente(String parametroNomeCliente) {
            nomeCliente = parametroNomeCliente;
        }

        public void registrarSaldo(double parametroSaldo) {
            saldo = parametroSaldo;
        }
      
}
