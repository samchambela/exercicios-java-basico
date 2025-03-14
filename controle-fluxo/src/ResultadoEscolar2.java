public class ResultadoEscolar2 {
    public static void main(String[] args) {

        // condicional encadeada

        int nota = 10;

        if(nota >= 7) // igual: ==
            System.out.println("Aprovado");

        else if(nota >= 5 && nota < 7) //senão se | && = e | true ou false
            System.out.println("Prova de Recuperação");

        else
            System.out.println("Reprovado");
    }
}
