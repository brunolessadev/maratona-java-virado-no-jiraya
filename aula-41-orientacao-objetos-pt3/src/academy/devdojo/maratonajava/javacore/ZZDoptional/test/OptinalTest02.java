package academy.devdojo.maratonajava.javacore.ZZDoptional.test;

import academy.devdojo.maratonajava.javacore.ZZDoptional.dominio.Manga;
import academy.devdojo.maratonajava.javacore.ZZDoptional.repositorio.MangaRepositorio;

import java.util.Optional;

public class OptinalTest02 {
    public static void main(String[] args) {
        Optional<Manga> mangaBytitle = MangaRepositorio.findByTitle("Boku no Hero");
        mangaBytitle.ifPresent(m -> m.setTitle("Boku no Hero 2"));
        System.out.println(mangaBytitle);

        Manga mangaById = MangaRepositorio.findById(2)
                .orElseThrow(IllegalArgumentException::new);

        System.out.println(mangaById);

        Manga newManga = MangaRepositorio.findByTitle("Drifters")
                .orElse(new Manga(3, "Drifters", 20));

        System.out.println(newManga);

    }
}
