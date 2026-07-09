package academy.devdojo.maratonajava.javacore.ZZAclassesinternas.test;

public class OuterClassTest03 {
    private String name = "Tsunade";
    static class Nested{
        private String lastName = "Sannin";
        void print(){
            System.out.println(new OuterClassTest03().name + " " + lastName);
        }

    }
    public static void main(String[] args) {
        Nested nested = new Nested();
        nested.print();
    }
}
