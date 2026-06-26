package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.*;

public class BufferedWriterTest01 {
    public static void main(String[] args) {
        File file = new File("D:\\Programando\\repositorio-maratona-java-virado-no-jiraya\\aula-41-orientacao-objetos-pt3\\arquivo\\file.txt");
        try (FileWriter fw = new FileWriter(file, true);
             BufferedWriter br = new BufferedWriter(fw)){
             br.write("O DevDojo é o melhor curso do Brasil, Continuando a cantoria na próxima linha ");
             br.newLine();
             br.flush();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
