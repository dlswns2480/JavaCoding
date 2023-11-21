package src.Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p2512 {
    static int n;
    static int[] budget;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        budget = new int[input.length];
        for(int i = 0; i < input.length; i++){
            budget[i] = Integer.parseInt(input[i]);
        }
        int max = Integer.parseInt(br.readLine());
        int total = 0;
        int high = 0;
        for(int i = 0; i < budget.length; i++){
            total += budget[i];
            high = Math.max(budget[i], high);
        }
        if(total <= max){
            System.out.print(high);
            return;
        }
        int low = 1;
        while(low < high - 1){
            int mid = (low + high) / 2;
            if(getStand(mid) > max){
                high = mid;
            }
            else if(getStand(mid) <= max){
                low = mid;
            }
        }
        System.out.print(low);
    }

    private static int getStand(int standard){
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum += Math.min(standard, budget[i]);
        }
        return sum;
    }
}
