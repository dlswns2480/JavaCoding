package src.Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p1010 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++){
            String[] arr = br.readLine().split(" ");
            int a = Integer.parseInt(arr[0]);
            int b = Integer.parseInt(arr[1]);
            if(a == b){
                System.out.println(1);
                continue;
            }
            long answer = 1;
            for(int j = 0; j < a; j++){
                answer *= (long)b;
                b -= 1;
            }
            System.out.println(answer);
        }
    }
}
