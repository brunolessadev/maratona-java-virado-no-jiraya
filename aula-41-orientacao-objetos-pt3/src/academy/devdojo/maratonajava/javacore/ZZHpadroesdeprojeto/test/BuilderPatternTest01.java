package academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.test;

import academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.dominio.Person;

public class BuilderPatternTest01 {
    static void main() {
        Person build = new Person.PersonBuilder()
                .firstName("Naruto")
                .lastname("Uzumaki")
                .userName("Chunin")
                .email("narutochunin@gmail.com")
                .build();

        System.out.println(build);
    }
}
