package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormateTest01 {
    public static void main(String[] args) {
        String pattern = " 'Amsterdam' dd 'de' MMMM 'de' YYYY";
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);

        System.out.println(sdf.format(new Date()));
    }
}
