package src.Baekjoon;

import java.util.Scanner;

public class p2563 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[][] arr= new int[100][100];
        int[][] input = new int[size][2];
        int answer = 0;
        for(int i = 0; i < 100; i ++){
            for(int j = 0; j < 100; j++){
                arr[i][j] = 0;
            }
        }
        for(int i = 0; i < size; i++){
            input[i][0] = sc.nextInt();
            input[i][1] = sc.nextInt();
            for(int j = input[i][0] ; j < input[i][0] + 10; j++){
                for(int k = input[i][1]; k < input[i][1] + 10; k++){
                    arr[j][k] = 1;
                }
            }
        }
        for(int i = 0; i < 100; i ++){
            for(int j = 0; j < 100; j++){
                if(arr[i][j] != 0){
                    answer++;
                }
            }
        }
        System.out.print(answer);
    }
}
