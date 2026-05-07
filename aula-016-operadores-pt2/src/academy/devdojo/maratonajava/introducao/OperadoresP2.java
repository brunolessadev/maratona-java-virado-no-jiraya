package academy.devdojo.maratonajava.introducao;

public class OperadoresP2 {
    public static void main(String[] args) {
        int remainder = 21 % 2;
        System.out.println(remainder);

        boolean isTenGreaterThanTwenty = 10 > 20;
        boolean isTenLessThanTwenty = 10 < 20;
        boolean isTenEqualToTwenty = 10 == 20;
        boolean isTenEqualToTen = 10 == 10;
        boolean isTenDifferentFromTen = 10 != 10;
        boolean isTenDifferentFromTwenty = 10 != 20;

        System.out.println("isTenGreaterThanTwenty " + isTenGreaterThanTwenty);
        System.out.println("isTenLessThanTwenty " + isTenLessThanTwenty);
        System.out.println("isTenEqualToTwenty " + isTenEqualToTwenty);
        System.out.println("isTenEqualToTen " + isTenEqualToTen);
        System.out.println("isTenDifferentFromTen " + isTenDifferentFromTen);
        System.out.println("isTenDifferentFromTwenty " + isTenDifferentFromTwenty);
    }
}
