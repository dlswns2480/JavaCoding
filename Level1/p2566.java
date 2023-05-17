package src.Level1;

import java.util.Scanner;

public class p2566 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[9][9];

        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int max = 0;
        int maxLow = 0;
        int maxCol = 0;
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                if(max < arr[i][j]){
                    max = arr[i][j];
                    maxLow = i;
                    maxCol = j;
                }
            }
        }
        System.out.println(max);
        System.out.print((maxLow + 1) + " " + (maxCol + 1));

    }
}
