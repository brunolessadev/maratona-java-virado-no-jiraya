package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest02 {
    public static void main(String[] args) {
        Queue<Manga> mangas = new PriorityQueue<>(new MangaPrecoComparator().reversed());
        mangas.add(new Manga(5L,"Hellsing",19.9,0));
        mangas.add(new Manga(1L,"Pokemon",3.2,5));
        mangas.add(new Manga(4L,"Berserk",9.5,0));
        mangas.add(new Manga(3L,"Attack on titan",11.20,2));
        mangas.add(new Manga(2L,"Dragon Ball",2.99,0));
        mangas.add(new Manga(10L,"Aaragon",2.99,0));

        while (!mangas.isEmpty()){
            System.out.println(mangas.poll());
        }
    }
}
