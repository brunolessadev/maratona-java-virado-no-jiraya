package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        String nome = "Naruto ";
        nome.concat("Uzumaki");
        nome.substring(0,3);

        System.out.println(nome);
        StringBuilder sb = new StringBuilder(nome);
        sb.append("Uzumaki " + "Hokage");
        sb.reverse();
        sb.reverse();
        sb.delete(0,8);
        System.out.println(sb);
    }
}
