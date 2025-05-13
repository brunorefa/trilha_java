public class tipos_operadores {
    public static void main(String[] args) throws Exception {
        // operadores aritméticos
        int a = 10;
        int b = 5;
        System.out.println("Soma: " + (a + b));
        System.out.println("Subtração: " + (a - b));
        System.out.println("Multiplicação: " + (a * b));
        System.out.println("Divisão: " + (a / b));
        System.out.println("Módulo: " + (a % b));

        // operadores de comparação
        System.out.println("Igualdade: " + (a == b));
        System.out.println("Diferença: " + (a != b));
        System.out.println("Maior que: " + (a > b));
        System.out.println("Menor que: " + (a < b));
        System.out.println("Maior ou igual a: " + (a >= b));
        System.out.println("Menor ou igual a: " + (a <= b));

        // operadores lógicos
        boolean x = true;
        boolean y = false;
        System.out.println("E lógico: " + (x && y));
        System.out.println("Ou lógico: " + (x || y));
        System.out.println("Não lógico: " + (!x));

        // operadores de atribuição
        int c = 10;
        c += 5; // c = c + 5
        System.out.println("Atribuição: " + c);
        c -= 5; // c = c - 5
        System.out.println("Atribuição: " + c);
        c *= 5; // c = c * 5
        System.out.println("Atribuição: " + c); 
        c /= 5; // c = c / 5
        System.out.println("Atribuição: " + c);
        c %= 5; // c = c % 5
        System.out.println("Atribuição: " + c);

        // operadores unários
        int d = 10;
        System.out.println("Pré-incremento: " + (++d)); // incrementa antes de usar
        System.out.println("Pós-incremento: " + (d++)); // incrementa depois de usar
        System.out.println("Valor atual de d: " + d); // mostra o valor atual
        System.out.println("Pré-decremento: " + (--d)); // decrementa antes de usar
        System.out.println("Pós-decremento: " + (d--)); // decrementa depois de usar
        System.out.println("Valor atual de d: " + d); // mostra o valor atual

        // operadores ternários
        int e = 10;
        int f = 5;
        int maior = (e > f) ? e : f; // se e for maior que f, maior recebe e, senão recebe f
        System.out.println("Maior: " + maior);

        String nomeCompleto = "LINGUAGEM" + " JAVA"; // concatenação de strings
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
