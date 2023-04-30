package src;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class UpperAndLower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char c;
        for (int i = 0; i < a.length(); i++) {
            c = a.charAt(i);
            if(Character.isUpperCase(c)){
                System.out.print(Character.toLowerCase(c));
            }
            else{
                System.out.print(Character.toUpperCase(c));
            }
        }

    }
}
