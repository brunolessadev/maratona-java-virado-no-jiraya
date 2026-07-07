package academy.devdojo.maratonajava.javacore.Zgenerics.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class WildcardTest02 {
    public static void main(String[] args) {

        List<Cachorro> cachorros = List.of(new Cachorro(), new Cachorro());
        List<Gato> gatos = List.of(new Gato(), new Gato());
        printConsulta(cachorros);
        printConsulta(gatos);
        List<Animal> animals = new ArrayList<>();
        printConsulta(animals);
    }
    private static void printConsulta(List<? extends Animal> animals){
        Cachorro a1 = new Cachorro();

        for (Animal animal : animals) {
            animal.consulta();
        }
    }
    private static void printConsultaAnimal(List<? super Animal> animals){
        Animal animal = new Cachorro();
        Animal animal1 = new Gato();
    }
}
