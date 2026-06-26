package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.time.ZoneId;
import java.util.Date;

public class FileTest01 {
    public static void main(String[] args) {
        File file = new File("D:\\Programando\\repositorio-maratona-java-virado-no-jiraya\\aula-41-orientacao-objetos-pt3\\arquivo\\file.txt");
        try {

            boolean isCreated = file.createNewFile();
            System.out.println("Foi Criado ? "+isCreated);
            System.out.println("path " +file.getName());
            System.out.println("path absolute " +file.getAbsolutePath());
            System.out.println("is directory  " +file.isDirectory());
            System.out.println("is file  " +file.isFile());
            System.out.println("is hidden  " +file.isHidden());
            System.out.println("last modified "+ Instant.ofEpochMilli(file.lastModified()).atZone(ZoneId.systemDefault()).toLocalDate());

            boolean exists = file.exists();
            if(exists){
                boolean isDeleted = file.delete();
                System.out.println("Foi Deletado ? "+isDeleted);
            }else{
                System.out.println("Arquivo não existe!");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
