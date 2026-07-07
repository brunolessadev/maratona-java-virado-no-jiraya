package academy.devdojo.maratonajava.javacore.Zgenerics.test;

import academy.devdojo.maratonajava.javacore.Zgenerics.dominio.Barco;
import academy.devdojo.maratonajava.javacore.Zgenerics.dominio.Carro;
import academy.devdojo.maratonajava.javacore.Zgenerics.service.BarcoRentavelService;
import academy.devdojo.maratonajava.javacore.Zgenerics.service.CarroRentavelService;
import academy.devdojo.maratonajava.javacore.Zgenerics.service.RentavelService;

import java.util.ArrayList;
import java.util.List;

public class ClasseGenericaTest03 {
    public static void main(String[] args) {

        List<Carro> carrosDisponiveis = new ArrayList<>(
                List.of(
                        new Carro("BMW"),
                        new Carro("Fusca")));

        List<Barco> barcosDisponiveis = new ArrayList<>(
                List.of(
                        new Barco("Lancha"),
                        new Barco("Canoa")));

        RentavelService<Carro> rentavelServiceCarro = new RentavelService<>(carrosDisponiveis);
        Carro carro = rentavelServiceCarro.buscarObjetoDisponivel();
        System.out.println("Usando o carro por um mês...");
        rentavelServiceCarro.retornarObjetoAlugado(carro);

        System.out.println("---------------------------------------------");

        RentavelService<Barco> rentavelServiceBarco = new RentavelService<>(barcosDisponiveis);
        Barco barco = rentavelServiceBarco.buscarObjetoDisponivel();
        System.out.println("Usando o barco por um mês...");
        rentavelServiceBarco.retornarObjetoAlugado(barco);
    }
}
