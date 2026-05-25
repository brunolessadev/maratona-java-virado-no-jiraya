package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.dominio;

public class Anime {
    private String nome;
    private static int[] episodios = {1,2,3,4,5,6,7,8,9,10,11,12};

    static {
        System.out.println("Dentro do Bloco de Inicialização1");
        episodios = new int[100];
        for (int i = 0; i < episodios.length ; i++) {
            episodios[i] = i+1;
        };
    }
    static {
        System.out.println("Dentro do Bloco de Inicialização2");
        };

    static {
        System.out.println("Dentro do Bloco de Inicialização3");
        };

    static {
        System.out.println("Dentro do Bloco de Inicialização não estatico");
    };


    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {

        for (int episodio : Anime.episodios) {
            System.out.print(episodio + " ");
        }

        System.out.println();
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
