package src.Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p11047 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = 0;
        String[] input = br.readLine().split(" ");
        int size = Integer.parseInt(input[0]);
        int goal = Integer.parseInt(input[1]);
        int[] price = new int[size];
        for(int i = 0; i < size; i++){
            price[i] = Integer.parseInt(br.readLine());
        }
        int maxPriceIdx = 0;
        for(int i = 0; i < size; i++){
            if(price[i] > goal){
                break;
            }
            maxPriceIdx = i;
        }
        while(goal > 0){
            if(goal >= price[maxPriceIdx]){
                goal -= price[maxPriceIdx];
                cnt++;
            }
            else if(goal < price[maxPriceIdx]){
                maxPriceIdx--;
            }

            if(goal == 0)
                break;
        }

        System.out.print(cnt);
    }
}
