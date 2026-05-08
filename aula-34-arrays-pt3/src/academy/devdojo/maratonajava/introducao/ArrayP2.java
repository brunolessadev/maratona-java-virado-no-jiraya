// Define o pacote onde esta classe esta organizada dentro do projeto.
package academy.devdojo.maratonajava.introducao;

// Declara uma classe publica chamada EstruturaRepeticaoP2.
// Em Java, todo codigo precisa ficar dentro de uma classe.
public class ArrayP2 {

    // Metodo principal do programa.
    // A execucao comeca por este metodo quando o programa e iniciado.
    public static void main(String[] args) {
        String [] nomes = new String [4];
        nomes[0] = "Goku";
        nomes[1] = "Vegeta";
        nomes[2] = "Trunks";
        nomes[3] = "Picolo";

        for (int i = 0; i < nomes.length ; i++) {
            System.out.println(nomes[i]);
        }
    }
}
