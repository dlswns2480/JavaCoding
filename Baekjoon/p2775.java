package src.Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p2775 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        String[][] arr = new String[size][2];
        for(int i = 0; i < size; i++){
            for(int j = 0; j < 2; j++){
                arr[i][j] = br.readLine();
            }
        }
        int[][] apart = new int[15][15];
        for(int i = 0; i < 15; i++){
            for(int j = 0; j < 1; j++){
                if(i == 0 || i == 1) {
                    apart[i][j] = 1;
                    break;
                }
                apart[i][j] = 1;
            }
        }
        for(int i = 0; i < apart.length; i++){
            for(int j = 1; j < apart[i].length; j++){
                if(i == 0) {
                    apart[i][j] = j + 1;
                    continue;
                }
                apart[i][j] = apart[i - 1][j] + apart[i][j - 1];
            }
        }

        for(int i = 0; i < arr.length; i++){
            int k = Integer.parseInt(arr[i][0]);
            int n = Integer.parseInt(arr[i][1]);
            if(i == arr.length - 1){
                System.out.print(apart[k][n - 1]);
                break;
            }
            System.out.println(apart[k][n - 1]);
        }
    }
}
