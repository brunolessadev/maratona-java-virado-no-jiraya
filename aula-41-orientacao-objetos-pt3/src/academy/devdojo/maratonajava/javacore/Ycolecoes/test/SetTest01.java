package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetTest01 {
    public static void main(String[] args) {

        Set<Manga> mangas = new LinkedHashSet<>();

        mangas.add(new Manga(5L,"Hellsing",19.9,0));
        mangas.add(new Manga(1L,"Pokemon",9.5,5));
        mangas.add(new Manga(4L,"Berserk",3.2,0));
        mangas.add(new Manga(3L,"Attack on titan",11.20,2));
        mangas.add(new Manga(2L,"Dragon Ball",2.99,0));
        mangas.add(new Manga(2L,"Dragon Ball",2.99,0));

        for (Manga manga: mangas){
            System.out.println(manga);
        }



    }
}
