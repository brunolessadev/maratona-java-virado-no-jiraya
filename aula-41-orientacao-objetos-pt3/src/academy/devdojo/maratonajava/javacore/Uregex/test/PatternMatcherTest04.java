package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest04 {
    public static void main(String[] args) {
//        \d = Todos os dígitos
//        \D = Todos os que não for dígitos
//        \s = Espaços em branco \t \n \f \r
//        \S = Todos os caracteres excluindo os em branco
//        \w = a-ZA-Z. dígitos, _
//        \W = Tudo que não for inluso no \w
//        [] =
//        ? Zero ou uma
//        * Zero ou mais
//        + Uma ou mais
//        {n,m} de n até m
//        ()
//        | o(v|c)o ovo | oco
//        $

        String regeX = "0[xX]([0-9a-fA-F])+(\\s|$)";
        String texto = "12 0x 0X 0xFFABC 0x10G 0X1";
        Pattern pattern = Pattern.compile(regeX);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("texto: " +texto);
        System.out.println("indice: 0123456789");
        System.out.println("regex: " + regeX);
        System.out.println("Posições encontradas");

        while(matcher.find()){
            System.out.println(matcher.start()+" "+ matcher.group()+"\n");
        }
    }
}
