package src.Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p2839 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sugar = Integer.parseInt(br.readLine());
        int answer = 0;
        if(sugar % 5 == 0){
            System.out.print(sugar / 5);
            return;
        }


        while (sugar > 0) {
            if(sugar == 1 || sugar == 2){
                System.out.print(-1);
                return;
            }
            sugar -= 3;
            answer++;
            if(sugar % 5 == 0){
                answer += (sugar / 5);
                break;
            }
        }
        System.out.print(answer);
    }
}
