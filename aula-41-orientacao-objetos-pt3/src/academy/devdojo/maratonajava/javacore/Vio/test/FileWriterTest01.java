package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest01 {
    public static void main(String[] args) {
        File file = new File("D:\\Programando\\repositorio-maratona-java-virado-no-jiraya\\aula-41-orientacao-objetos-pt3\\arquivo\\file.txt");
        try (FileWriter fw = new FileWriter(file, true)){
            fw.write("O DevDojo é o melhor curso do Brasil \n Continuando a cantoria na próxima linha \n");
            fw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
