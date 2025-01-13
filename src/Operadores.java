

public class Operadores {
    public static void main(String[] args) {
        //operador de atribuição "="
        //"Tipos de variaveis" + "nome " = "valor"
        /*
        String nome = "Diego";
        int idade = 38;
        double peso = 75.6;
        char sexo = 'M';
        boolean doadorOrgao = false;
        Date dataNascimento = new Date(); 
        */
        

        // operadores aritméticos: + (adicao), -(subtracao), /(divisao) e *(multiplicacao)
        /*
        double soma = 10.5 + 15.7;
        int subtracao = 113 - 25;
        int multiplicacao = 20 * 7;
        int divisao = 15 / 3;
        int modulo = 18 % 3;
        double resultado = (10 * 7) + (20/4);
         */

        // concatenacao de texto
        /*
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
        */
        

        /** operadores unários 
         * (+) operador unário de valor positivo - números são positivos sem esse operador explicitamente
         * (-) operador unário de valor negativo - nega um número ou expressão aritmética
         * (++) operador unário de incremento de valor - incrementa o valor em uma unidade
         * (--) operador unário de decremento de valor - decrementa o valor em 1 unidade
         * (!) operador unário lógico de negação - nega o valor de uma expressao booleana
         * 
         */
        /*
        int numero = 5;

        numero = - numero;

        System.out.println(numero);
        //para voltar a ser positivo é necessário realizar uma multiplicao
        numero = numero * -1;

        System.out.println(numero);
        */

        /* 
        int numero = 5;

        //x repeticao

        //numero++ é igual a seguinte expressão: numero = numero + 1;
        //imprime o valor de numero e depois incrementa o valor
        System.out.println(numero++);
        //imprime o valor incrementado do valor numero 
        System.out.println(++ numero);

        //numero-- é igual a seguinte expressão: numero = numero - 1;
        //imprime o valor de numero e depois decrementa o valor
        System.out.println(numero--);
        //imprime o valor decrementado do valor numero 
        System.out.println(-- numero);
        
        boolean variavel = true;
        //(!)inverte o valor da variavel booleana
        variavel = !variavel; 
        System.out.println(variavel);
        */

        // Operador ternário
        //Forma resumida para definir uma condição para escolher por um ou mais valores dentro de uma condicao
        //representado pelo simbolo ?:
        //<Expressão condicional> ? <Caso condicao seja true> :
        // <Caso condicao seja false>
        /*
        int a, b;

        a=6;
        b=6;

        String resultado = a==b ? "verdadeiro" : "falso";

        String resultado = "";
        
        if(a==b)
            resultado = "verdadeiro";
        else
            resultado = "falso";
        */
        // System.out.println(resultado);

        //Operadores relacionais
        /*
        == Verifica a igualdade das variaveis
        != Verifica a diferenca das variaveis
        >  Verifica se uma variavel é maior que a outra
        >= Verifica se uma variavel é maior ou igual a outra
        <  Verifica se uma variavel é menor que a outra
        <= Verifica se uma variavel é menor ou igual a outra

        
       String nomeUm = "DIEGO";
       String nomeDois = new String ("DIEGO");

       System.out.println (nomeUm.equals(nomeDois));  


        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        if(numero1 < numero2){
            System.out.println("a nossa condição é verdadeira");
        }


        System.out.println("numeroUm é igual a numeroDois? " + simNao );

        simNao = numero1 != numero2;

        System.out.println("numeroUm é diferente a numeroDois? " + simNao );

        simNao = numero1 >= numero2;

        System.out.println("numeroUm é maior que o numeroDois? " + simNao );
        */

        // Operadores lógicos
        /*
        && Operador lógico "E"
        || Operador Lógico "OU"
    
        */
        boolean condicao1 = true;
        boolean condicao2 = true;

        if(condicao1 && (7 > 4) ){
            System.out.println("As duas condições são verdadeiras");
        }

        if(condicao1 && condicao2){
            System.out.println("As duas condições são verdadeiras");
        }
        if(condicao1 || condicao2){
            System.out.println("Umas das condições é verdadeira");
        }
        System.out.println("Fim");
    }
}
