package lesson2;

public class PrimitiveDataTypes {
    public static void main(String [] args){
        byte b1 = 10;
        byte b2 = 20;
        byte b3 = 100;

        short s1 = 5;
        short s2 = -10;
        short s3 = 0;

        int i1 = 500;

        long l1 = 1000;
        long l2 = 10000000000L;
        long l3 = 5l;

        float f1 = 3.14F;
        float f2 = 2.5f;
        float f3 = 20;
        float f4 = 20.0F;

        double d1 = 5.5;
        double d2 = 87.65;

        char c1 = 'a';
        char c2 = 'A';
        char c3 = '7';
        char c4 = ' ';

        char c5 = 500; //10

        char c6 = '\u0500'; //16 ABCDEF

        boolean bool1 = true;
        boolean bool2  =false;

        int a1 = 60;
        int a2 = 0B111100;  //0b 0B  2-sys
        int a3 = 0b111100;
        int a4 = 0_74; //0 8-sys
        int a5 = 0x3c;
        int a6 = 0X3C; // 0x 0B 16-sys
        int a7 = 1_000______000; // ___ для удобства чтения

        System.out.println("privet");
        System.out.println(a6);

    }
}
