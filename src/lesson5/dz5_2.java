package lesson5;

public class dz5_2 {
}
class Student {
    int id;
    String name;
    String surname;
    int course;
    double math;
    double economic;
    double english;

    double Usred ( double first, double second, double third) {
        math = first;
        economic = second;
        english = third;
        double result = (math + economic + english) /3;
        //System.out.println("Средняя оценка: " + result);
        return result;
    }
}
class Usred2 {
    double Usred2 ( Student st) {
        double result2 = (st.math + st.economic + st.english)/3;
        return result2;
    }
}

class StudentTest {
    public static void main(String[] args) {
        Student S1 = new Student();
        Student S2 = new Student();
        Student S3 = new Student();

        S1.course = 2;
        S1.math = 5.0;
        S1.economic = 7.0;
        S1.english = 8.0;
        S1.name = "Taras";
        S1.surname = "Shevchenko";

        S2.course = 4;
        S2.math = 9.0;
        S2.economic = 12.0;
        S2.english = 11.0;
        S2.name = "Ivan";
        S2.surname = "Franko";

        S3.course = 1;
        S3.math = 10.0;
        S3.economic = 10.0;
        S3.english = 9.0;
        S3.name = "Pavlo";
        S3.surname = "Zagrebelnyi";

        System.out.println(S1.Usred(S1.math, S1.economic, S1.english));

    }
}