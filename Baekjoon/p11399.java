package src.Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class p11399 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine());
        String[] time = br.readLine().split(" ");
        int[] times = new int[time.length];
        for(int i = 0; i < time.length; i++){
            times[i] = Integer.parseInt(time[i]);
        }
        PriorityQueue<Integer> que = new PriorityQueue<>();

        for(int i = 0; i < number; i++){
            que.offer(times[i]);
        }
        int sum = 0;
        List<Integer> sumResult = new ArrayList<>();
        while(!que.isEmpty()){
            sum += que.poll();
            sumResult.add(sum);
        }
        int answer = 0;
        for(int num : sumResult){
            answer += num;
        }

        System.out.print(answer);
    }
}
