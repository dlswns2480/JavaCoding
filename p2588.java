package src;

import java.util.Scanner;

public class p2588 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num1 = sc.next();
        String num2 = sc.next();
        System.out.println(Integer.parseInt(num1) * Integer.parseInt(String.valueOf(num2.charAt(2))));
        System.out.println(Integer.parseInt(num1) * Integer.parseInt(String.valueOf(num2.charAt(1))));
        System.out.println(Integer.parseInt(num1) * Integer.parseInt(String.valueOf(num2.charAt(0))));
//        for(int i = 2; i <=0; i--){
//            System.out.println(Integer.parseInt(num1) * Integer.parseInt(String.valueOf(num2.charAt(i))));
//        }
        System.out.print(Integer.parseInt(num1) * Integer.parseInt(num2));
    }
}
