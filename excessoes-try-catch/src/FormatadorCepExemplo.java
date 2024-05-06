/**
 * EXERCÍCIO exceptions
 * exercício criando exception personalizada
 */

public class FormatadorCepExemplo {
    public static void main(String[] args) {

            String cepFormatado;
            try {
                cepFormatado = formatarCep("1234568");
                System.out.println(cepFormatado);
            } catch (CepInvalidoException e) {
                // TODO Auto-generated catch block
                System.out.println("O cep não corresponde as regras de negócio");;
            }
   
    }

    static String formatarCep(String cep) throws CepInvalidoException{
        if(cep.length() != 8){
            throw new CepInvalidoException();
        }
        cep = "123.456-78";
        return cep;
    }        
}
