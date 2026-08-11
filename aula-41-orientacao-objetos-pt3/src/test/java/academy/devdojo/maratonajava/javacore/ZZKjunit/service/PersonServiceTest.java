package academy.devdojo.maratonajava.javacore.ZZKjunit.service;

import academy.devdojo.maratonajava.javacore.ZZKjunit.dominio.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PersonServiceTest {

    @Test
    void isAdult() {
        Person person = new Person(15);
        PersonService personService = new PersonService();

        Assertions.assertFalse(personService.isAdult(person));
    }
}