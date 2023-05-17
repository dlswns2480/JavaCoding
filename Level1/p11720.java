package src.Level1;


import java.util.Scanner;

public class p11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String num = sc.next();
        int sum = 0;
        for(int i = 0; i < size; i++){
            sum += Character.getNumericValue(num.charAt(i));
        }
        System.out.print(sum);
    }
}


