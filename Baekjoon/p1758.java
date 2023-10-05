package src.Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class p1758 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Long[] tip = new Long[n];
        for(int i = 0; i < n; i++){
            tip[i] = Long.parseLong(br.readLine());
        }

        Arrays.sort(tip, Collections.reverseOrder());
        Long sum = 0L;
        Long sum_ingre = 0L;
        for(int i = 0; i < n; i++){
//            System.out.println(tip[i]);
            sum_ingre = tip[i] - i;
            if(sum_ingre <= 0)
                continue;
            sum += tip[i] - i;
        }

        System.out.print(sum);
    }
}
