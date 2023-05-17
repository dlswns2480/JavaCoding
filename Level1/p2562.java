package src.Level1;

import java.util.Scanner;

public class p2562 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        for(int i = 0; i < 9; i ++){
            arr[i] = sc.nextInt();
        }
        int maxIndex = 0;
        for(int i = 0; i < 8; i++){
            if(arr[maxIndex] < arr[i+1]){
                maxIndex = i+1;
            }
        }
        System.out.println(arr[maxIndex]);
        System.out.print(maxIndex + 1);
    }
}
