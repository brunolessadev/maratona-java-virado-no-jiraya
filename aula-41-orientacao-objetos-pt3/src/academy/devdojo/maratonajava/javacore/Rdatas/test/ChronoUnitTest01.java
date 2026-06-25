package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class ChronoUnitTest01 {
    public static void main(String[] args) {
        LocalDateTime aniversario = LocalDateTime.of(1988, Month.AUGUST, 6, 12, 0,0);
        LocalDateTime now = LocalDateTime.now();
        long lu1 = ChronoUnit.DAYS.between(aniversario, now);
        long lu2 = ChronoUnit.WEEKS.between(aniversario, now);
        long lu3 = ChronoUnit.YEARS.between(aniversario, now);
        System.out.println(lu1);
        System.out.println(lu2);
        System.out.println(lu3);
    }
}
