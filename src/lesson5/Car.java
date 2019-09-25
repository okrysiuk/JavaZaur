package lesson5;

public class Car {
    String color;
    String engine;
    int realTimeSpeed;

    int gaz(int speedIncrease) {
        realTimeSpeed += speedIncrease;
        return realTimeSpeed;
    }

    int tormoz (int speedDecrease) {
        realTimeSpeed -= speedDecrease;
        return realTimeSpeed;
    }

    void showInfo() {
        System.out.println(color + " Car with " + engine + " now riding with speed: " + realTimeSpeed + " km/hour.");
    }
}

class CarTest {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.color = "red";
        c1.engine = "V6";
        c1.realTimeSpeed = 60;
        c1.showInfo();
        c1.gaz(10);
        c1.showInfo();
        c1.tormoz(70);
        c1.showInfo();

    }
}