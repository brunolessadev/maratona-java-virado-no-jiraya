package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest01 {
    public static void main(String[] args) {
//        \d = Todos os dígitos
//        \D = Todos os que não for dígitos
//        \s = Espaços em branco \t \n \f \r
//        \S = Todos os caracteres excluindo os em branco
//        \w = a-ZA-Z. dígitos, _
//        \W = Tudo que não for inluso no \w
        String regeX = "\\w";
//        String texto = "abaaba";
        String texto2 = "hasd_42a1s3d455a s866d";
        Pattern pattern = Pattern.compile(regeX);
        Matcher matcher = pattern.matcher(texto2);
        System.out.println("texto: " +texto2);
        System.out.println("indice: 0123456789");
        System.out.println("regex: " + regeX);
        System.out.println("Posições encontradas");
        while(matcher.find()){
            System.out.println(matcher.start()+" "+ matcher.group()+"\n");
        }
    }
}
