public class ResultadoEscolar3 {
    public static void main(String[] args) {

        // condicional ternária
        // cenário 1

        int nota = 6;
        //                          se          senão
        String resultado = nota >= 7 ? "Aprovado" : "Reprovado";

        System.out.println(resultado);


        // cenário 2

        int nota2 = 7;
        //                            se          senão                      se
        String resultado2 = nota2 >= 7 ? "Aprovado" : nota2 >= 5 && nota2 < 7 ? "Recuperação" : "Reprovado";

        System.out.println(resultado2);

    }
}