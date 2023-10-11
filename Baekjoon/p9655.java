package src.Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p9655 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int stone = Integer.parseInt(br.readLine());
        int count = 0;
        while(stone > 0){
            count++;
            if(stone >= 3){
                stone -= 3;
            }
            else if(stone < 3){
                stone -= 1;
            }

            if(stone == 0){
                break;
            }
        }
        if(count % 2 == 0){
            System.out.print("CY");
        }
        else{
            System.out.print("SK");
        }
    }
}
