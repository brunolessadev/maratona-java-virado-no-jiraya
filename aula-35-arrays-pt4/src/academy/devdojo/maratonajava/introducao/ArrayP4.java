// Define o pacote onde esta classe esta organizada dentro do projeto.
package academy.devdojo.maratonajava.introducao;

// Declara uma classe publica chamada EstruturaRepeticaoP2.
// Em Java, todo codigo precisa ficar dentro de uma classe.
public class ArrayP4 {

    // Metodo principal do programa.
    // A execucao comeca por este metodo quando o programa e iniciado.
    public static void main(String[] args) {
        int[] numeros = new int[3];
        int[] numeros2 = {1,2,3,4,5};
        int[] numeros3 = new int[] {1,2,3,4,5,6};

        /*
        for (int i = 0; i < numeros3.length; i++) {
            System.out.println(numeros3[i]);
        }
        */

        for(int num : numeros3){
            System.out.println(num);
        }
    }
}

