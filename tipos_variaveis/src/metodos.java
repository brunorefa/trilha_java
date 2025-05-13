public class metodos {
    public static void main(String[] args) throws Exception {
        // Métodos em Java
        // Métodos são blocos de código que realizam uma tarefa específica e podem ser reutilizados.
        // Eles podem receber parâmetros e retornar valores.

        // Método sem parâmetros e sem retorno
        saudacao();

        // Método com parâmetros e sem retorno
        saudacaoPersonalizada("João");

        // Método com parâmetros e com retorno
        int soma = somar(5, 10);
        System.out.println("Soma: " + soma);
    }

    // Método sem parâmetros e sem retorno
    public static void saudacao() {
        System.out.println("Olá, bem-vindo ao Java!");
    }

    // Método com parâmetros e sem retorno
    public static void saudacaoPersonalizada(String nome) {
        System.out.println("Olá, " + nome + "! Bem-vindo ao Java!");
    }

    // Método com parâmetros e com retorno
    public static int somar(int a, int b) {
        return a + b;
    }
}
