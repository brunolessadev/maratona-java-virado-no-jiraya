package academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.test;

import academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.dominio.Person;

public class BuilderPatternTest0101 {
    static void main() {
        Person build = Person.PersonBuilder
                .builder()
                .firstName("Naruto")
                .lastName("Uzumaki")
                .userName("Chunin")
                .email("narutochunin@gmail.com")
                .build();

        System.out.println(build);
    }
}
