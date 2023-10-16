package src.Baekjoon;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class p25206 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Double> map = new HashMap<>();
        map.put("A+", 4.5);
        map.put("A0", 4.0);
        map.put("B+", 3.5);
        map.put("B0", 3.0);
        map.put("C+", 2.5);
        map.put("C0", 2.0);
        map.put("D+", 1.5);
        map.put("D0", 1.0);
        map.put("F", 0.0);
        Double sum = 0.0;
        Double numSum = 0.0;
        for(int i = 0; i < 20; i++){
            String subject = sc.next();
            double num = sc.nextDouble();
            String score = sc.next();
            if(score.equals("P"))
                continue;
            sum += num * map.getOrDefault(score, 0.0);
            numSum += num;
        }
        Double answer = 0.0;
        if(sum == 0.0){
            answer = 0.00;
        }
        else{
            answer = sum / numSum;
        }

        System.out.print(answer);
    }
}
