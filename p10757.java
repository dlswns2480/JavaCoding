package src;

import java.math.BigInteger;
import java.util.Scanner;

public class p10757 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BigInteger A = sc.nextBigInteger();
        BigInteger B = sc.nextBigInteger();
        BigInteger add = B.add(A);

        System.out.print(add);
    }
}
