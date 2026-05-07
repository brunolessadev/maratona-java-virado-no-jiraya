// Define o pacote onde esta classe esta organizada dentro do projeto.
package academy.devdojo.maratonajava.introducao;

// Declara uma classe publica chamada EstruturaRepeticaoP2.
// Em Java, todo codigo precisa ficar dentro de uma classe.
public class EstruturaRepeticaoP3 {

    // Metodo principal do programa.
    // A execucao comeca por este metodo quando o programa e iniciado.
    public static void main(String[] args) {
        int valorMax = 50;
        for(int i = 1; i <= valorMax ; i++){
            if( i > 25 ) {
                break;
            }
            System.out.println("i "+i);
        }
    }
}
