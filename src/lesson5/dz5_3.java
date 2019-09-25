package lesson5;

public class dz5_3 {
}

class Employee {
    Employee (int nomer, String familiya, int vozrast, String otdel) {
        id = nomer;
        surname = familiya;
        age = vozrast;
        salaryDep = otdel;

    }
    int id;
    String surname;
    int age;
    String salaryDep;
    double payment;

    double zarp (double zarplata) {
        payment = zarplata;
        payment *= 2;
        return payment;
    }
}

class EmployeeTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "Franko", 50, "Manager");
        Employee emp2 = new Employee(2, "Zagrebelnyi", 55, "Economic");

        emp1.zarp(5000.27);
        System.out.println(emp1.payment);
    }
}


