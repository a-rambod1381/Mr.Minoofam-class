package Homework3;

public class Main {
    public static void main(String[] args) {
        Car car = CarFactory.getCar(Car.Audi);
        car.start();
    }
}
