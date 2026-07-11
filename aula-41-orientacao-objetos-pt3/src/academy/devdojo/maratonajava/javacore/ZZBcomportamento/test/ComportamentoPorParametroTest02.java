package academy.devdojo.maratonajava.javacore.ZZBcomportamento.test;

import academy.devdojo.maratonajava.javacore.ZZBcomportamento.dominio.Car;
import academy.devdojo.maratonajava.javacore.ZZBcomportamento.interfaces.CarPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

public class ComportamentoPorParametroTest02 {
    private static List<Car> cars = List.of(
            new Car("green", 2011),
            new Car("black",1998),
            new Car("red", 2019)
    );
    public static void main(String[] args) {

//        List<Car> greenCars = filter(cars, new CarPredicate() {
//            @Override
//
//            public boolean test(Car car) {
//                return car.getColor().equals("green");
//            }
//        });

        //Novo jeito de fazer

        List<Car> redcCars = filter(cars, car -> car.getColor().equals("red"));
        List<Car> greenCars = filter(cars, car -> car.getColor().equals("green"));
        System.out.println(greenCars);
        System.out.println(redcCars);

        List<Car> yearBeforeCars = filter(cars, car -> car.getYear() < 2015);
        System.out.println(yearBeforeCars);
    }
    private static List<Car> filter (List<Car> cars, Predicate<Car> carPredicate){

        List<Car> filteredCar = new ArrayList<>();
        for (Car car : cars) {
            if(carPredicate.test(car)){
                filteredCar.add(car);
            }
        }
        return filteredCar;
    }
}
