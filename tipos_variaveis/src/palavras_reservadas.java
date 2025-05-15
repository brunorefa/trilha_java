public class palavras_reservadas {
    public static void main(String[] args) {
        // Palavras reservadas em Java
        String[] palavrasReservadas = {
            "abstract", "assert", "boolean", "break", "byte",
            "case", "catch", "char", "class", "const",
            "continue", "default", "do", "double", "else",
            "enum", "extends", "final", "finally", "float",
            "for", "goto", "if", "implements", "import",
            "instanceof", "int", "interface", "long", "native",
            "new", "null", "package", "private", "protected",
            "public", "return", "short", "static", "strictfp",
            "super", "switch", "synchronized", "this", 
            // Adicione mais palavras reservadas conforme necessário
        }; 

        // Exibir as palavras reservadas
        for (String palavra : palavrasReservadas) {
            System.out.println(palavra);
        }
    }
    // Método para verificar se uma palavra é reservada
    public static boolean isPalavraReservada(String palavra) {
        String[] palavrasReservadas = {
            "abstract", "assert", "boolean", "break", "byte",
            "case", "catch", "char", "class", "const",
            "continue", "default", "do", "double", "else",
            "enum", "extends", "final", "finally", "float",
            "for", "goto", "if", "implements", "import",
            "instanceof", "int", "interface", "long", "native",
            "new", "null", "package", "private", "protected",
            "public", "return", "short", "static", 
            // Adicione mais palavras reservadas conforme necessário
        };

        for (String palavraReservada : palavrasReservadas) {
            if (palavra.equals(palavraReservada)) {
                return true;
            }
        }
        return false;
    }
    // Método para verificar se uma palavra é válida
    public static boolean isPalavraValida(String palavra) {
        // Verifica se a palavra não é vazia e não é uma palavra reservada
        return !palavra.isEmpty() && !isPalavraReservada(palavra);
    }
}


// public = acesso de qualquer classe
// protected = acesso de classes do mesmo pacote ou subclasses
// private = acesso apenas dentro da própria classe

// primitivos
// byte = 8 bits
// short = 16 bits
// int = 32 bits
// long = 64 bits
// short = 16 bits
// float = 32 bits
// double = 64 bits
// char = 16 bits
// boolean = 1 bit
// String = 16 bits
// String = sequência de caracteres

// modificadores de classe
// abstract = classe abstrata
// class = classe
// extends = indica a superclasse que a subclasse herda
// final = classe final
// interface = interface
// implements = implementação de interface
// native = código nativo
// static = variável estática
// strictfp = precisão em ponto flutuante
// synchronized = sincronização de threads
// transient = variável temporária
// volatile = variável volátil

// controle de fluxo
// break = interrompe o loop
// case = caso em um switch
// continue = continua o loop
// default = valor padrão em um switch

// assent = afirmação
// do = loop do-while
// else = alternativa em um if
// enum = enumeração
// for = loop for
// goto = rótulo
// if = condição
// instanceof = verifica o tipo de um objeto
// new = cria um novo objeto
// null = valor nulo
// package = pacote

// tratamento de erros
// assert = afirmação
// catch = captura exceções
// finally = bloco final
// throw = lança uma exceção
// throws = declara exceções
// try = bloco de tentativa

// escopo de uso
// arquivo = package, import, static
// classe = public, protected, private, final, abstract
// método = public, protected, private, static, final, void e return
// atributo = public, protected, private, static, final

// palavras opostas
// package = import
// extends = implements
// final = abstract
// throws = throw
// public = private
// protected = private

