package lesson3;

public class DataOperations {
    public static void main(String [] args){
        int a = 5;
        int b = a;
        int x =1, y = 2, z = 3;

        int aa = 10;
        int bb = 4;
        int cc = aa - bb++;
        int dd = aa - ++bb;
        System.out.println(cc);
        System.out.println(bb);
        System.out.println(dd);

    }
}

