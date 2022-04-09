package Homework3;

public class CarFactory {
    public static Car getCar(int c){
        switch (c) {
            case 1:
                return new Audi();
            case 2:
                return new BMW();
            case 3:
                return new Mercedes_Benz();
            default:
                return null;
        }
    }
}
