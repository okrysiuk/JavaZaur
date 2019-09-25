package lesson4;

public class dz {
}
class Student {
    int id;
    String name;
    String surname;
    int course;
    double math;
    double economic;
    double english;
}

class StudentTest {
    public static void main(String[] args) {
        Student S1 = new Student();
        Student S2 = new Student();
        Student S3 = new Student();

        S1.math = 5.0;
        S1.economic = 7.0;
        S1.english = 8.0;
        S1.name = "Taras";
        S1.surname = "Shevchenko";

        S2.math = 9.0;
        S2.economic = 12.0;
        S2.english = 11.0;
        S2.name = "Ivan";
        S2.surname = "Franko";

        S3.math = 10.0;
        S3.economic = 10.0;
        S3.english = 9.0;
        S3.name = "Pavlo";
        S3.surname = "Zagrebelnyi";

        System.out.println("Seregnia otzinka studenta " + S1.name + " " + S1.surname + ": ");
        System.out.println((S1.math + S1.economic + S1.english)/3);
        System.out.println("Seregnia otzinka studenta " + S2.name + " " + S2.surname + ": ");
        System.out.println((S2.math + S2.economic + S2.english)/3);
        System.out.println("Seregnia otzinka studenta " + S3.name + " " + S3.surname + ": ");
        System.out.println((S3.math + S3.economic + S3.english)/3);
    }
}