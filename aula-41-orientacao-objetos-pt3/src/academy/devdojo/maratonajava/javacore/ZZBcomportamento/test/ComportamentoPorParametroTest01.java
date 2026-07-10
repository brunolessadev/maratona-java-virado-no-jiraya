package academy.devdojo.maratonajava.javacore.ZZBcomportamento.test;

import academy.devdojo.maratonajava.javacore.ZZBcomportamento.dominio.Car;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTest01 {
    private static List<Car> cars = List.of(
            new Car("green", 2011),
            new Car("black",1998),
            new Car("red", 2019)
    );
    public static void main(String[] args) {
        System.out.println(filterCarBycollor(cars,"green"));
        System.out.println(filterCarBycollor(cars,"red"));
        System.out.println(filterCarAge(cars,2015));

    }

    private static List<Car> filterCarBycollor(List<Car> cars, String cor){
        List<Car> collorCar = new ArrayList<>();
        for (Car car : cars) {
            if(car.getColor().equals(cor)){
                collorCar.add(car);
            }
        }
        return collorCar;
    }

    private static List<Car> filterCarAge(List<Car> cars, int year){
        List<Car> oldCar = new ArrayList<>();
        for (Car car : cars) {
            if(car.getYear() < year){
                oldCar.add(car);
            }
        }
        return oldCar;
    }


}
