package lesson4;

public class Car {
    String color = "red";
    String engine = "V6";
}

class TestCar {
    public static void main(String[] args) {
        Car Car1 = new Car();
        //Car Car2 = new Car();
        Car Car2 = Car1;
        System.out.println(new Car().color);
    }
}
