package com.company;
import static java.lang.Math.*;

class AlgorytmEuklidesa {

    public static void main(String[] args) {
        int a = 32;
        int b = 90002584;
        int x=max(a,b);
        int y=min(a,b);

        while (y != 0) {
            int m = x % y;
            x = y;
            y = m;
        }
        System.out.println("NWD(" + a + "," + b + ") = " + x);
    }
}
