// Define o pacote onde esta classe esta organizada dentro do projeto.
package academy.devdojo.maratonajava.introducao;

// Declara uma classe publica chamada EstruturaRepeticaoP2.
// Em Java, todo codigo precisa ficar dentro de uma classe.
public class EstruturaRepeticaoP4 {

    // Metodo principal do programa.
    // A execucao comeca por este metodo quando o programa e iniciado.
    public static void main(String[] args) {
        double valorTotal = 30000;
        for (int parcela = (int) valorTotal ; parcela >= 1 ; parcela--) {
            double valorParcela = valorTotal / parcela;
            if (valorParcela < 1000) {
                continue;
            }
            System.out.println("Parcela " + parcela + " R$ " + valorParcela);
        }
    }
}
