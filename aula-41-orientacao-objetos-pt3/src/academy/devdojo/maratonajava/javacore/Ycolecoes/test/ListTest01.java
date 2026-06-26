package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList(16); //1.5
        List<String> nomes2 = new ArrayList(16);
        nomes.add("Naruto");
        nomes.add("Konoha");
        nomes.add("7");
        nomes.remove(2);
        nomes.remove("Naruto");

        nomes2.add("Sasuske");
        nomes2.add("Konoha/Uchiha");
        nomes2.add("0");

        nomes.addAll(nomes2);

        for(String nome: nomes){
            System.out.println(nome);
        }


        System.out.println("--------------");
        int size = nomes2.size();
        for (int i = 0; i < size; i++) {
            System.out.println(nomes2.get(i));
        }
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
    }
}
