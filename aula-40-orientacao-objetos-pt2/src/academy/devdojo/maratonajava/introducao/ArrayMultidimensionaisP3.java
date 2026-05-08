// Define o pacote onde esta classe esta organizada dentro do projeto.
package academy.devdojo.maratonajava.introducao;

// Declara uma classe publica chamada EstruturaRepeticaoP2.
// Em Java, todo codigo precisa ficar dentro de uma classe.
public class ArrayMultidimensionaisP3 {

    // Metodo principal do programa.
    // A execucao comeca por este metodo quando o programa e iniciado.
    public static void main(String[] args) {
        int[] array = {3, 2, 1};

        int[][] arrayInt = new int[3][];

        arrayInt[0] = new int[2];
        arrayInt[1] = array;
        arrayInt[2] = new int[]{1, 2, 3, 4, 5, 6};

        int[][] arrayInt2 = {{0, 0}, {3, 2, 1}, {1, 2, 3, 4, 5, 6}};

        for (int[] arrrayBase : arrayInt2) {
            System.out.println("\n--------");
            for (int num : arrrayBase) {
                System.out.print(num + " ");
            }
        }
    }
}

