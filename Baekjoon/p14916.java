package src.Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p14916 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int won = Integer.parseInt(br.readLine());
        int answer = 0;
        if(won % 5 == 0){
            answer += (won / 5);
            System.out.print(answer);
            return;
        }
        while(won > 0){
            if(won == 1){
                System.out.print(-1);
                return;
            }
            won -= 2;
            answer++;
            if(won % 5 == 0){
                answer += (won / 5);
                break;
            }
        }
        System.out.print(answer);
    }
}
