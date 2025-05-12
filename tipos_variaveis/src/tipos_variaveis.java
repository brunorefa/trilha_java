public class tipos_variaveis {
    public static void main(String[] args) throws Exception {
        byte idade = 35;
        short anoNascimento = 1988;
        int anoAtual = 2023; // se começar com 0, colocar como string
        long cpf = 12345678901L; //se começar com 0, colocar como string
        float altura = 1.75f;
        double salarioMinimo = 2500.33;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal; // casting
        // casting é a conversão de um tipo de dado para outro

        int numero = 5;
        numero = 5 * 5; // reatribuição
        System.out.println(numero);

        final double VALOR_DE_PI = 3.14; // constante
        // variavel é um espaço na memoria que armazena um valor
        // constante é um espaço na memoria que armazena um valor fixo
        // variavel é um espaço na memoria que armazena um valor que pode ser alterado
        // constante é um espaço na memoria que armazena um valor que não pode ser alterado

    }
}
