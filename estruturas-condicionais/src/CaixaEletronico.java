/**
 * exercício condicional  if  
 * para definir com base no valor solicitado se o saque pode ser feito ou não
 */
public class CaixaEletronico {
    public static void main(String[] args) throws Exception {

        double saldo = 15.0;
        double valorSolicitado = 17.0;

        System.out.println("saldo inicial    : " + saldo);
        System.out.println("valor solicitado : " + valorSolicitado);

        if(valorSolicitado <= saldo) {
            saldo = saldo - valorSolicitado;
            System.out.println("saldo atual     : " + saldo);
        }else {
            System.out.println("você não tem saldo disponível!");
            System.out.println("saldo atual      : " + saldo);
        }
    }
}



