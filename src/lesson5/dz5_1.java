package lesson5;

public class dz5_1 {
}

class BankAccount5 {
    int id; //Instance variables
    String name;
    double balance;

    double popolnenieScheta(double pribavka) {
        balance += pribavka;
        return balance;
    }
    double snyatieScheta(double ubavka) {
        balance -= ubavka;
        return balance;
    }

    void ShowInfo5 () {
        System.out.println ("Na schetu: " + balance + " dollarov");
    }

}

class BankAccountTest5 {

    public static void main(String[] args) {
        BankAccount5 MyAccount = new BankAccount5();
        BankAccount5 YourAccount = new BankAccount5();
        BankAccount5 HisAccount = new BankAccount5();

        MyAccount.id = 1;
        MyAccount.name = "Zaur";
        MyAccount.balance = 12.35;

        YourAccount.id = 2;
        YourAccount.name = "Mike";
        YourAccount.balance = 2.00;

        HisAccount.id = 1;
        HisAccount.name = "Ivan";
        HisAccount.balance = 124.12;

        //System.out.println(YourAccount.name);
        MyAccount.ShowInfo5();
        MyAccount.popolnenieScheta(45.56);
        MyAccount.ShowInfo5();
        MyAccount.snyatieScheta(500);
        MyAccount.ShowInfo5();


    }
}
