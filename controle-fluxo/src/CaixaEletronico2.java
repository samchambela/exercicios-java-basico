public class CaixaEletronico2 {
    public static void main(String[] args) {

    // condicional composta

       double saldo = 25.0;
       double valorSolicitado = 24.0;

       if(valorSolicitado < saldo) { //dentro do if ou else possui mais de 1 instrução = precisa montar um bloco {}
           saldo = saldo - valorSolicitado;
           System.out.println("Novo saldo: R$" + saldo);
       } else
           System.out.println("Saldo insuficiente");

        System.out.println(saldo);
    }
}