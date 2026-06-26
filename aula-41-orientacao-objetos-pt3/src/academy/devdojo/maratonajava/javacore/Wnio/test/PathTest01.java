package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest01 {
    public static void main(String[] args) {
        Path p1 = Paths.get("D:\\Programando\\repositorio-maratona-java-virado-no-jiraya\\aula-41-orientacao-objetos-pt3\\arquivo2\\arquivo.txt");
        Path p2 = Paths.get("D:\\Programando\\repositorio-maratona-java-virado-no-jiraya\\aula-41-orientacao-objetos-pt3\\arquivo2", "arquivo.txt");
        Path p3 = Paths.get("D", "Programando\\repositorio-maratona-java-virado-no-jiraya\\aula-41-orientacao-objetos-pt3\\arquivo2", "arquivo.txt");
        Path p4 = Paths.get("D", "Programando", "repositorio-maratona-java-virado-no-jiraya", "aula-41-orientacao-objetos-pt3", "arquivo2", "arquivo.txt");
        System.out.println(p1.getFileName());
        System.out.println(p2.getFileName());
        System.out.println(p3.getFileName());
        System.out.println(p4.getFileName());
    }
}
