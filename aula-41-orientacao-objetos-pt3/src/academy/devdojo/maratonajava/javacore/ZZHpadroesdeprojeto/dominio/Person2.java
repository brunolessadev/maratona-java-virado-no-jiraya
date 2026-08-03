package academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.dominio;

public class Person2 {
    private String firstName;
    private String lastName;
    private String userName;
    private String email;

    public Person2(String firstName, String lastName, String userName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person2{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}