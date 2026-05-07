// Define o pacote onde esta classe esta organizada dentro do projeto.
package academy.devdojo.maratonajava.introducao;

// Declara uma classe publica chamada EstruturaRepeticaoP2.
// Em Java, todo codigo precisa ficar dentro de uma classe.
public class EstruturaRepeticaoP2 {

    // Metodo principal do programa.
    // A execucao comeca por este metodo quando o programa e iniciado.
    public static void main(String[] args) {

        // Estrutura de repeticao "for".
        // Ela repete o bloco de codigo enquanto a condicao for verdadeira.
        //
        // int i = 10: cria a variavel "i" e inicia com o valor 10.
        // i <= 1000000: continua repetindo enquanto "i" for menor ou igual a 1.000.000.
        // i++: aumenta o valor de "i" em 1 a cada repeticao.
        for ( int i = 10 ; i <= 1000000 ; i++ ) {

            // Verifica se o numero atual e par.
            // O operador "%" pega o resto da divisao.
            // Se "i % 2" for igual a 0, significa que "i" e divisivel por 2.
            if( i % 2 == 0) {

                // Mostra no console o valor atual de "i".
                // Esta linha so sera executada quando "i" for par.
                System.out.println(i);
            }
        }
    }
}
