import java.util.Scanner;

public class BinaryShift {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        // print the binary representation of x
        System.out.println(" x= " + x + "( binary: " + Integer.toBinaryString(x) + ")");
        //Left shift by 1 and print result
        x = x<<1;

        System.out.println("After left shift by 1:");
        System.out.println(" x= " + x + "( binary: " + Integer.toBinaryString(x) + ")");


    }
}


class shiftoperator {
    public static void main(String[] args) {
        int x = 150;
        //print binary string version
        System.out.println("Binary representation of 150: " + Integer.toBinaryString(x));
        // shift  x by 2 using right shift operator >>
        x = x >> 2;
        System.out.println(" Decimal value after right shift by 2:" + x); // decimal value 150/4 is 37.5
        System.out.println("Binary representation after right shift by 2: " + Integer.toBinaryString(x));


    }

}

class shiftoperator225 {
    public static void main(String[] args) {
        int x = 225;
        //print binary string version
        System.out.println("Binary representation of 225: " + Integer.toBinaryString(x));
        // shift  x by 2 using right shift operator >>
        x = x >> 2;
        System.out.println(" Decimal value after right shift by 2:" + x);
        System.out.println("Binary representation after right shift by 2: " + Integer.toBinaryString(x));
    }
}

class bitwiseand {
    public static void main(String[] args) {
        int x = 7, y = 17;
        // predicted value of bitwise & operator is 1
        int z = x&y;
        System.out.println("The value of 7 & 17 is: " + z);

    }
}

class bitwiseor{
    public static void main(String[] args) {
        int x = 7, y = 17;
        // predicted value of bitwise | operator is 23
        int z = x|y;
        System.out.println("The value of 7 | 17 is: " + z);
    }
}


class postfix{
    public static void main(String[] args) {
        int x = 5;
        System.out.println("Value of x before postfix increment: " + x);
        x++;
        System.out.println("Value of x after postfix increment: " + x);
    }
}

class increments{
    public static void main(String[] args) {
        int x = 5;
        //postfix increment operator
        x++;
        System.out.println("value increases by 1 by postfix increment:" + x );
        //prefix increment operator
        ++x;
        System.out.println("value increases by 1 by prefix increment:" + x );
        // normal assigment operator
        x += 1;
        System.out.println("value increases by 1 normally:" + x );

    }
}

class incrementmanipulation{
    public static void main(String[] args) {
        int x = 5, y = 8;
        // create var SUM and assign value ++x added to y
        int sum = (++x) + y;
        System.out.println("Value of sum: " + sum);
        int x1 = 5, y1= 8;
        int sum2 = (x1++) + y1;
        System.out.println("Value of sum: " + sum2);



    }
}
