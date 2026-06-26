package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest06 {
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
//        . 1.3 = 123, 133, 1@3, 1A3

        String regeX = "[^abc]";
        String texto = "luffy@hotmail.com, 123jotaro@gmail.com, #@!zoro@mail.br, teste@gmail.com.br, sakura@mail";
        System.out.println("Email válido ?");
        System.out.println("zoro@mail.br".matches(regeX));
        System.out.println(Arrays.toString(texto.split(",")));
        System.out.println(texto.split(",")[1].trim());
        Pattern pattern = Pattern.compile(regeX);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("texto: " +texto);
        System.out.println("indice: 0123456789");
        System.out.println("regex: " + regeX);
        System.out.println("Posições encontradas");

        while(matcher.find()){
            System.out.print(matcher.start()+" "+ matcher.group()+"\n");
        }
    }
}
