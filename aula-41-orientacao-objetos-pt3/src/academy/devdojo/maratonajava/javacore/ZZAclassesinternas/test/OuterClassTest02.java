package academy.devdojo.maratonajava.javacore.ZZAclassesinternas.test;

public class OuterClassTest02 {

    private String name = "Midoriya";

    void print(){
        final String lastName = "Izuku";
        class LocalClass{
            public void printLocal(){
                System.out.println(name + " " + lastName);
            }
        }
        LocalClass localClass = new LocalClass();
        localClass.printLocal();
    }
    public static void main(String[] args) {
        OuterClassTest02 outerClassTest02 = new OuterClassTest02();
        outerClassTest02.print();
    }
}
