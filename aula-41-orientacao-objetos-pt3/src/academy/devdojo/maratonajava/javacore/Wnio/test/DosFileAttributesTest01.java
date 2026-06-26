package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.DosFileAttributes;

public class DosFileAttributesTest01 {
    public static void main(String[] args) {
        Path path = Paths.get("pasta/test.txt");
        try {
            if(Files.notExists(path))Files.createFile(path);

//            Files.setAttribute(path,"dos:hidden",true);
//            Files.setAttribute(path,"dos:readonly",true);
//
//            Files.setAttribute(path,"dos:hidden",false);
//            Files.setAttribute(path,"dos:readonly",false);

            DosFileAttributes dosFileAttributes = Files.readAttributes(path, DosFileAttributes.class);
            System.out.println(dosFileAttributes.isHidden());
            System.out.println(dosFileAttributes.isReadOnly());

            DosFileAttributeView fileAttributeView = Files.getFileAttributeView(path, DosFileAttributeView.class);
            fileAttributeView.setHidden(false);
            fileAttributeView.setReadOnly(false);
            System.out.println(fileAttributeView.readAttributes().isHidden());
            System.out.println(fileAttributeView.readAttributes().isReadOnly());

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
