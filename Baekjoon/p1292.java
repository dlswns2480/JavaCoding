package src.Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class p1292 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[1]);
        ArrayList<Integer> lst = new ArrayList<>();
        for(int i = 1; i <= b; i++){
            for(int j = 0; j < i; j++){
                lst.add(i);
            }
        }
        int sum = 0;
        for(int i = a - 1; i <= b - 1; i++){
            sum += lst.get(i);
//            System.out.println(lst.get(i));
        }

        System.out.print(sum);
    }
}
