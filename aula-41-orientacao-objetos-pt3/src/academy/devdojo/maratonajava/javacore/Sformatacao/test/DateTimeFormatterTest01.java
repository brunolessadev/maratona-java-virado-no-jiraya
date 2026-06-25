package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateTimeFormatterTest01 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        String s1 = date.format(DateTimeFormatter.BASIC_ISO_DATE);
        String s2 = date.format(DateTimeFormatter.ISO_DATE);
        String s3 = date.format(DateTimeFormatter.ISO_LOCAL_DATE);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        LocalDate parse1 = LocalDate.parse("20260625", DateTimeFormatter.BASIC_ISO_DATE);
        LocalDate parse2 = LocalDate.parse("2026-06-25+23:00", DateTimeFormatter.ISO_DATE);
        LocalDate parse3 = LocalDate.parse("2026-06-25", DateTimeFormatter.ISO_LOCAL_DATE);

        System.out.println(parse1);
        System.out.println(parse2);
        System.out.println(parse3);

        LocalDateTime now = LocalDateTime.now();
        String s4 = now.format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(s4);

        LocalDateTime parse4 = LocalDateTime.parse("2026-06-25T20:32:47.3335551",DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(parse4);

        DateTimeFormatter dateTimeFormatterBR = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formatBR = LocalDate.now().format(dateTimeFormatterBR);
        System.out.println(formatBR);

        LocalDate parseBr = LocalDate.parse("25/06/2026",dateTimeFormatterBR);
        System.out.println(parseBr);


        DateTimeFormatter dateTimeFormatterGR = DateTimeFormatter.ofPattern("dd.MMMM.yyyy", Locale.GERMAN);;
        String formatGR = LocalDate.now().format(dateTimeFormatterGR);
        System.out.println(formatGR);
        LocalDate parseGR = LocalDate.parse("25.Juni.2026", dateTimeFormatterGR);
        System.out.println(parseGR);


    }
}
