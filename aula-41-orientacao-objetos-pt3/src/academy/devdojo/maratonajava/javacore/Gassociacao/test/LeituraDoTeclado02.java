package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import java.util.Scanner;

public class LeituraDoTeclado02 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("O grand software de previsão do futuro");
        System.out.println("Digite a sua pergunta e eu responderei sim ou não");
        String pergunta = input.nextLine();
        if(pergunta.charAt(0) == ' '){
            System.out.println("SIM");
        }else {
            System.out.println("Não");
        }
    }
}
