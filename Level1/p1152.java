package src.Level1;

import java.util.Scanner;

public class p1152 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String str1 = str.trim();
//        System.out.println(str1);
        String[] arr = str1.split("\\s");
        if (str1.length() == 0){
            System.out.print(0);
        }
        else{

            System.out.print(arr.length);

        }
//        for(String wo : arr){
//            System.out.print(wo);
//        }


    }
}
