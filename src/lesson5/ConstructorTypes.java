package lesson5;

public class ConstructorTypes {
}

class Caar {

    Caar(String kolir, String dvygun){
        color = kolir;
        engine = dvygun;
    }

    String color;
    String engine;
}

class newCar {
    public static void main(String[] args) {
        Caar kar = new Caar("red", "v4");
        System.out.println(kar.color);
        System.out.println(kar.engine);
    }
}