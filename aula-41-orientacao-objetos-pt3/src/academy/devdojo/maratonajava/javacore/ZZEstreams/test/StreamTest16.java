package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.Category;
import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.LightNovel;
import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.Promotion;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamTest16 {
    public static void main(String[] args) {
        System.out.println("Numero de threads");
        System.out.println(Runtime
                .getRuntime()
                .availableProcessors());

        long num = 100_000_000;
        System.out.println("-------------------");
        sumFor(num);
        System.out.println("-------------------");
        sumStreamIterate(num);
        System.out.println("-------------------");
        sumParallelStreamIterate(num);
        System.out.println("-------------------");
        sumLongStreamIterate(num);
        System.out.println("-------------------");
        sumLongParallelStreamIterate(num);
        System.out.println("-------------------");
        sumLongWhile(num);

    }

    private static void sumFor(long num) {
        System.out.println("Sum for");
        long result = 0;
        long init = System.currentTimeMillis();
        for (long i = 1; i <= num; i++) {
            result += i;
        }
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + "ms");
    }

    private static void sumStreamIterate(long num) {
        System.out.println("Sum Stream Iterate");
        long init = System.currentTimeMillis();
        long result = Stream.iterate(1L, i -> i + 1).limit(num).reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + "ms");
    }

    private static void sumParallelStreamIterate(long num) {
        System.out.println("Sum Stream Parallel Iterate");
        long init = System.currentTimeMillis();
        long result = Stream.iterate(1L, i -> i + 1).limit(num).parallel().reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + "ms");
    }

    private static void sumLongStreamIterate(long num) {
        System.out.println("Sum Long Stream Parallel Iterate");
        long init = System.currentTimeMillis();
        long result = LongStream.rangeClosed(1L, num).reduce(0L,Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + "ms");
    }

    private static void sumLongParallelStreamIterate(long num) {
        System.out.println("Sum Long Stream Parallel Iterate");
        long init = System.currentTimeMillis();
        long result = LongStream.rangeClosed(1L, num).parallel().reduce(0L,Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + "ms");
    }

    private static void sumLongWhile(long num) {
        System.out.println("Sum Long While");
        long init = System.currentTimeMillis();

        long result = 0L;
        long i = 1L;

        while (true) {
            if (i > num) {
                break;
            }
            result += i;
            i++;
        }

        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + "ms");
    }
}
