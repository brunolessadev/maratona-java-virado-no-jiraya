package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Smartphone;

public class EqualsTest03 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("1ABC1", "iPhone");
        Smartphone s2 = new Smartphone("1ABC1", "Pixel");        Smartphone s1 = new Smartphone("1ABC1", "iPhone");
        Smartphone s3 = new Smartphone("1ABC1", "Samsumg");        Smartphone s1 = new Smartphone("1ABC1", "iPhone");
        Smartphone s4 = new Smartphone("1ABC1", "Xiomi");
        System.out.println(s1.equals(s2));
    }
}
