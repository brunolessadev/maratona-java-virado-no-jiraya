package academy.devdojo.maratonajava.javacore.ZZGconcorrencia.test;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class ScheduledThreadPoolTest01 {
    private static final ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
    private static void beeper(){
        Runnable r = () -> {
            System.out.println(LocalTime.now().format(formatter) + " beep");
            try {
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };
//      executor.schedule(r, 2, TimeUnit.SECONDS);
//        ScheduledFuture<?> scheduledFuture = executor.scheduleWithFixedDelay(r, 1, 5, TimeUnit.SECONDS);
        ScheduledFuture<?> scheduledFuture = executor.scheduleAtFixedRate(r, 1, 5, TimeUnit.SECONDS);
        executor.schedule(() -> {
            System.out.println("Cancelando o scheduleWithFixedDelay");
            scheduledFuture.cancel(false);
            executor.shutdown();
        }, 10,TimeUnit.SECONDS);
    }

    static void main() {
        System.out.println(LocalTime.now().format(formatter));
        beeper();
    }
}
