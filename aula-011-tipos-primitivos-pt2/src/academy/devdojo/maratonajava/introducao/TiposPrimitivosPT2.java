package academy.devdojo.maratonajava.introducao;
/**
 * Tipos primitivos, palavras reservadas: <b>int, double, float, char, byte, short, long, boolean</b><br/>
 * OBS: São todos numéricos*/
public class TiposPrimitivosPT2 {
    public static void main(String[] args){
        int age = 10;
        long numberBig = 100000;
        double salaryDouble = 2000;
        float salaryFloat = 2000;
        byte ageByte = -128;
        short ageShort = 10;
        boolean trueV = true;
        boolean falseF = false;
        char characterC = '\u0041';


        System.out.println("A idade é "+age+" anos.");
        System.out.println(trueV);
        System.out.println(trueV=false);
        System.out.print("char "+characterC);
    }
}
