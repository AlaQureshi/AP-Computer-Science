import java.util.*;
public class MathMethods {
    public static void main(String[] args) {

        // for the last one go to the tester class tab i made

        double p = 10;
        double b = p *  Math.PI;            // 14.
        System.out.println(b);

        System.out.println(Math.log(18));    // 13.

        System.out.println(Math.ceil(157.7));  // 12.

        System.out.println(Math.ceil(157));  // 11.

        System.out.println(Math.ceil(-157.7));  // 10.

        System.out.println(Math.round(-157.2));  // 9.

        System.out.println(Math.floor(157.2));  // 8.

        System.out.println(Math.ceil(157.2));  // 7.

        System.out.println(Math.floor(-157.2));  // 6.

        System.out.println(Math.ceil(-157.2)); // 5.

        double c = 2;
        double d = 1.5;                       // 4.
        System.out.println(Math.pow(c,d));

        double z = Math.abs(-127.5);   // 3.

        int j = 4;
        int m = -4;
        double k = j * Math.abs(m);    // 2.
        System.out.println(k);


        int x = 25;
        double y = Math.sqrt(x);       // 1.
        System.out.println(y);

    }
}