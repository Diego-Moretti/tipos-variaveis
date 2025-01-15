public class Conta {

    //variavel classe conta
    double saldo = 10.0;

    public void sacar(Double valor){
        //variavel local de metodo
        double novoSaldo = saldo - valor;
    }

    public void imprimirSaldo(){
        //disponivel em toda a classe
        System.out.println(saldo);
        // somente o metodo sacar conhece esta variavel por isso o erro em printar novoSaldo
        //System.out.println(novoSaldo);

    }

    public double calcularDividaExponencial(){
        double valorParcela = 50.0;
        double valorMontante = 0.0; //comecando a variavel
        for (int x=1; x<=5; x++) { //a variavel de escopo
            //esta variavel sera reiniciada a cada execucao
            double valorCalculado = valorParcela * x;
            valorMontante = valorMontante + valorCalculado;
        }
        //escopo de fluxo
        //x e valorCalculado nunca estarao disponivel fora do bloco
        return valorMontante;     
    }
    public static void main(String[] args) {
        
    }

}
