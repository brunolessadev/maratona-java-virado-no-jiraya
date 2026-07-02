package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Consumidor;
import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.HashMap;
import java.util.Map;

public class MapTest02 {
    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("Kakashi");
        Consumidor consumidor2 = new Consumidor("Might Guy");

        Manga manga1 = new Manga(5L, "Hellsing", 19.9);
        Manga manga2 =new Manga(1L,"Pokemon",9.5);
        Manga manga3 =new Manga(4L,"Berserk",3.2);
        Manga manga4 =new Manga(3L,"Attack on titan",11.20);
        Manga manga5 =new Manga(2L,"Dragon Ball",2.99);

        Map<Consumidor, Manga> consumidorMangaMap = new HashMap<>();
        consumidorMangaMap.put(consumidor1,manga1);
        consumidorMangaMap.put(consumidor2,manga4);

        for (Map.Entry<Consumidor, Manga> entry : consumidorMangaMap.entrySet()){
            System.out.println(entry.getKey().getNome()+" - " + entry.getValue().getNome());
        }
    }
}
