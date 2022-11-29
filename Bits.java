//import java.util.*;
import java.util.Scanner;

public class Bits {
    public static void main(String[] args) {
        // int n=5;//0101
        // // int pos=2;
        // // int bitMask=1<<pos;
        // // int notBitMask=~(bitMask);

        // // int newNumber=notBitMask & n;
        // System.out.println(newNumber);
        // \
        Scanner sc = new Scanner(System.in);

        int n = 5;
        int pos = 1;
        int oper = sc.nextInt();

        int bitMask = 1 << pos;
        if (oper == 1) {
            int newNumber = bitMask | n;
            // System.out.println(newNumber);
        } else {
            int newBitmask = ~(bitMask);
            int newNumber = newBitmask & n;
            System.out.println(newNumber);
        }

    }
}
