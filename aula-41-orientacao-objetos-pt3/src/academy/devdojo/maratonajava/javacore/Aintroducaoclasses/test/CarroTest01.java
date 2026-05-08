package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Fusca";
        carro1.modelo = "Tradicional";
        carro1.ano = 1973;

        carro2.nome = "Chevett";
        carro2.modelo = "Junior";
        carro2.ano = 1992;

        System.out.println("Carro: " +carro1.nome+ " Modelo: " +carro1.modelo+ " Ano: " +carro1.ano);
        System.out.println("Carro: " +carro2.nome+ " Modelo: " +carro2.modelo+ " Ano: " +carro2.ano);

    }
}
