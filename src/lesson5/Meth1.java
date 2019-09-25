package lesson5;

public class Meth1 {
    int summa(int a, int b, int c){
        int result = a + b + c;
        return result;
    }
    int sredneeArif(int a2, int b2, int c2){
        int result = summa(a2, b2, c2)/3;
        return result;
    }
}
class Meth2 {
    public static void main(String[] args) {
        Meth1 m = new Meth1();
        int summaTrexChisel = m.summa(1,2,3);
        System.out.println(summaTrexChisel);
        int sredArif = m.sredneeArif(10,20,70);
        System.out.println(sredArif);
    }
}