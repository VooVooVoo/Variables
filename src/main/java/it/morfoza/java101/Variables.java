package it.morfoza.java101;

/**
 * Created by Wojt on 2016-07-27.
 */
public class Variables {
    static byte b1;
    static short s1;
    static int i1;
    static long l1;
    static char c1 = 263;
    static float f1;
    static double d1;
    static Object o1;
    static boolean bool;


    public static void main(String[] args) {


        System.out.println(b1);
        System.out.println(s1);
        System.out.println(l1);
        System.out.println(c1);
        System.out.println(f1);
        System.out.println(d1);
        System.out.println(o1);
        System.out.println(b1);
        System.out.println(bool);

        byte b2=0;
        short s2=0;
        int i2=0;
        long l2=0;
        char c2 = 263;
        float f2=0;
        double d2=0.0;
        Object o2=null;
        boolean bool2=false;

        if(b1==b2) {
            System.out.println("OK");
        } else {
            System.out.println(":(");
        }


        if(s1==s2) {
            System.out.println("OK");
        } else {
            System.out.println(":(");
        }


        if(i1==i2) {
            System.out.println("OK");
        } else {
            System.out.println(":(");
        }

        if(l1==l2) {
            System.out.println("OK");
        } else {
            System.out.println(":(");
        }

        if(c1==c2) {
            System.out.println("OK");
        } else {
            System.out.println(":(");
        }

        if(f1==f2) {
            System.out.println("OK");
        } else {
            System.out.println(":(");
        }

        if(b2==s2) {
            System.out.println("Equal");
        } else {
            System.out.println("Get offf");
        }
        if(s2==l2) {
            System.out.println("Equal");
        } else {
            System.out.println("Get offf");
        }
        if(l2==i2) {
            System.out.println("Equal");
        } else {
            System.out.println("Get offf");
        }if(i2==c2) {
            System.out.println("Equal");
        } else {
            System.out.println("Get offf");
        }if(i2==f2) {
            System.out.println("Equal");
        } else {
            System.out.println("Get offf");
        }if(f2==d2) {
            System.out.println("Equal");
        } else {
            System.out.println("Get offf");
        }if(d2==o2) {
            System.out.println("Equal");
        } else {
            System.out.println("Get offf");
        }
        if(o2==bool2) {
            System.out.println("Equal");
        } else {
            System.out.println("Get offf");
        }


    }
}
