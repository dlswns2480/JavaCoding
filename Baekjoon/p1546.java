package src.Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class p1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());


        List<String> lst = Arrays.asList(br.readLine().split(" "));


        List<Integer> list = new ArrayList<>();
        for(String s : lst){
            list.add(Integer.parseInt(s));
        }
        int M = Collections.max(list);
//        System.out.println(M);
        Double sum = 0.0;
        for(int n : list){
            sum += (Double.valueOf(n) / Double.valueOf(M))  * 100;
//            System.out.println(n);
        }
        System.out.print(sum / size);

    }
}
