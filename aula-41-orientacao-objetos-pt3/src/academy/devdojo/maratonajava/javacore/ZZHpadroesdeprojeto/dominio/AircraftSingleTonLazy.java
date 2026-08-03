package academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.dominio;

import java.util.HashSet;
import java.util.Set;

public class AircraftSingleTonLazy {
    private static AircraftSingleTonLazy INSTANCE;
    private final Set<String> availableSeats = new HashSet<>();
    private final String name;

    public AircraftSingleTonLazy(String name) {
        this.name = name;
    }

    {
        availableSeats.add("1A");
        availableSeats.add("1B");
    }
    public static AircraftSingleTonLazy getINSTANCE() {
        if(INSTANCE == null) {
            synchronized (AircraftSingleTonLazy.class) {
                if(INSTANCE == null) {
                    INSTANCE = new AircraftSingleTonLazy("787-900");
                }
            }
        }
        return INSTANCE; }
    public boolean bookSeat(String seat){
        return availableSeats.remove(seat);
    }
}
