package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringTest01 {
    public static void main(String[] args) {
        String nome = "Goku"; // String constant pool
        String nome2 = "Goku";
        nome = nome.concat(" Dragon Ball");

        System.out.println(nome);
        System.out.println(nome == nome2);

        String nome3 = new String("Goku");
        System.out.println(nome2==nome3);
        System.out.println(nome2==nome3.intern());
    }
}
