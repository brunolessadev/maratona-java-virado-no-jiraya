package academy.devdojo.maratonajava.javacore.Xserializacao.test;

import academy.devdojo.maratonajava.javacore.Xserializacao.dominio.Aluno;
import academy.devdojo.maratonajava.javacore.Xserializacao.dominio.Turma;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SerializacaoTest01 {
    public static void main(String[] args) {
        Aluno aluno = new Aluno(7L,"Naruto Uzumaki", "123456789");
        Turma turma = new Turma("Maratona Java Virada do Jiraya em Breve Ricos");
        aluno.setTurma(turma);
        serializar(aluno);
        deserializar();

    }
    private static void serializar(Aluno aluno){
        Path path = Paths.get("pasta/aluno.ser");
        try(ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(path))){
            oos.writeObject(aluno);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static void deserializar(){
        Path path = Paths.get("pasta/aluno.ser");
        try(ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(path))){
            Aluno aluno = (Aluno)  ois.readObject();
            System.out.println(aluno);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
