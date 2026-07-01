package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;
import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Smartphone;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

class SmartphoneMarcaComparator implements Comparator<Smartphone>{
    @Override
    public int compare(Smartphone o1, Smartphone o2) {
        return o1.getMarca().compareTo(o2.getMarca());
    }
}

public class NavigableSetTest01 {
    public static void main(String[] args) {
        NavigableSet <Smartphone> set = new TreeSet<>(new SmartphoneMarcaComparator());
        Smartphone smartphone = new Smartphone("123", "Nokia");
        set.add(smartphone);
        System.out.println(set);

        NavigableSet<Manga> mangas = new TreeSet<>();
        mangas.add(new Manga(5L,"Hellsing",19.9,0));
        mangas.add(new Manga(1L,"Pokemon",9.5,5));
        mangas.add(new Manga(4L,"Berserk",3.2,0));
        mangas.add(new Manga(3L,"Attack on titan",11.20,2));
        mangas.add(new Manga(2L,"Dragon Ball",2.99,0));
        mangas.add(new Manga(10L,"Aaragon",2.99,0));
        for (Manga manga : mangas) {
            System.out.println(manga);
        }

    }
}
