package academy.devdojo.maratonajava.introducao;
/**
 * Tipos primitivos, palavras reservadas: <b>int, double, float, char, byte, short, long, boolean</b><br/>
 * OBS: São todos numéricos*/
public class TiposPrimitivosPT3 {
    private static Object age;

    public static void main(String[] args){
        int age = (int)10000000000L; //casting
        long numberBig = 100000L;
        double salaryDouble = 2000.0D;
        float salaryFloat = 2500.0F;
        byte ageByte = -128;
        short ageShort = 31000;
        boolean trueV = true;
        boolean falseF = false;
        char characterC = '\u0041';


        System.out.println("A idade é "+age+" anos.");
        System.out.println(trueV);
        System.out.println(trueV=false);
        System.out.println(age);
        System.out.print("char "+characterC);
    }
}
