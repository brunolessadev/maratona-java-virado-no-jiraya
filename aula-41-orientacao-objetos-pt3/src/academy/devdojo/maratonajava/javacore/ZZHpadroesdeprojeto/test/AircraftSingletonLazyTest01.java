package academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.test;

import academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.dominio.AircraftSingleTonLazy;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class AircraftSingletonLazyTest01 {
    static void main() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        bookSeat("1A");
        bookSeat("1A");
        System.out.println(AircraftSingleTonLazy.getINSTANCE());
        Constructor<AircraftSingleTonLazy> declaredConstructor = AircraftSingleTonLazy.class.getDeclaredConstructor(String.class);
        declaredConstructor.setAccessible(true);
        AircraftSingleTonLazy aircraftSingleTonLazy = declaredConstructor.newInstance("787-900");
        System.out.println(aircraftSingleTonLazy);
    }
    private static void bookSeat(String seat){
        System.out.println(AircraftSingleTonLazy.getINSTANCE());
        AircraftSingleTonLazy aircraftSingleTonLazy = AircraftSingleTonLazy.getINSTANCE();
        System.out.println(aircraftSingleTonLazy.bookSeat(seat));
    }
}
