
import java.util.Date;

public class Operadores {
    public static void main(String[] args) {
        //operador de atribuição "="
        //"Tipos de variaveis" + "nome " = "valor"

        String nome = "Diego";
        int idade = 38;
        double peso = 75.6;
        char sexo = 'M';
        boolean doadorOrgao = false;
        Date dataNascimento = new Date();

        // operadores aritméticos: + (adicao), -(subtracao), /(divisao) e *(multiplicacao)
        double soma = 10.5 + 15.7;
        int subtracao = 113 - 25;
        int multiplicacao = 20 * 7;
        int divisao = 15 / 3;
        int modulo = 18 % 3;
        double resultado = (10 * 7) + (20/4);

        // concatenacao de texto
        String nomeCompleto = "Linguagem" + "Java";
        System.out.println(nomeCompleto);

        String concatenacao = "?";

        concatenacao = 1+1+1+"1"; 

        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+1;
        
        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+"1";

        System.out.println(concatenacao);

        concatenacao = "1"+1+1+1;

        System.out.println(concatenacao);

        concatenacao = "1"+(1+1+1);

        System.out.println(concatenacao);
        
    }
}
