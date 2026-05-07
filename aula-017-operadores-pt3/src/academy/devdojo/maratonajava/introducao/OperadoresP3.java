package academy.devdojo.maratonajava.introducao;

public class OperadoresP3 {
    public static void main(String[] args) {
        int age = 29;
        float salary = 3500F;
        boolean isEligibleForHigherTaxBracket = age >= 30 && salary >= 4612;
        boolean isEligibleForLowerTaxBracket = age < 30 && salary > 3381;
        System.out.println("isEligibleForHigherTaxBracket " + isEligibleForHigherTaxBracket);
        System.out.println("isEligibleForLowerTaxBracket " + isEligibleForLowerTaxBracket);
    }
}
