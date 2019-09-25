package lesson5;

public class Human {
    Car10 car;
    BankAccount bA;

    void showinfo () {
        System.out.println("Пользователь №: " + bA.id + ", Имя: " + bA.name + ", Баланс на карте: " + bA.balance);
        System.out.println("Задекларировал " + car.color + " машину" + " с мотором " + car.engine);
    }


}


class Car10 {
    Car10 (String cvet, String motor) {
        color = cvet;
        engine = motor;
    }
    String color;
    String engine;
}

class BankAccount {
    BankAccount(int nomer, String imya, double bablo) {
        id = nomer;
        name = imya;
        balance = bablo;
    }
    int id;
    String name;
    double balance;
}

class humanTest {
    public static void main(String[] args) {
        Human h1 = new Human();
        h1.car = new Car10("Black", "V12");
        h1.bA = new BankAccount(1, "Don Pedro Incognito", 123456.789);
        h1.showinfo();
    }

}