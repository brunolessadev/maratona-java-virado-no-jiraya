package academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.test;

import academy.devdojo.maratonajava.javacore.ZZGconcorrencia.dominio.AircraftSingletonEager;
import academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.dominio.Aircraft;

public class AircraftTest01 {
    static void main() {
        bookSeat("1A");
        bookSeat("1A");
        AircraftTest01.bookSeat("1A");

    }
    static void bookSeat(String seat){
        System.out.println(AircraftSingletonEager.getINSTANCE());
        Aircraft aircraft = new Aircraft("787-900");
        System.out.println(aircraft.bookSeat(seat));
    }
}
