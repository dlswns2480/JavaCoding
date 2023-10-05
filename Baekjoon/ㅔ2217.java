package src.Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ㅔ2217 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] lope = new int[n];
        for(int i = 0; i < n; i++){
            lope[i] = Integer.parseInt(br.readLine());
        }
        int[] weight = new int[n];
        Arrays.sort(lope);
        for(int i = 0; i < n; i++){
            int count = 1;
            for(int j = i; j < n; j++){
                weight[i] = lope[i] * count;
                count++;
            }
        }
        Arrays.sort(weight);

        System.out.print(weight[weight.length - 1]);

    }
}
