package src.Level1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class p11659 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        List<Integer> sumList = new ArrayList<>();
        int size = 0;
        int num = 0;
        size = sc.nextInt();
        num = sc.nextInt();

        for(int i = 0; i < size; i++){
            list.add(sc.nextInt());
        }

        int start, end;

        for(int i = 0; i < num; i++){
            start = sc.nextInt();
            end = sc.nextInt();
            int sum = 0;
            for(int j = start - 1; j < end; j++){
                sum += list.get(j);
            }
            sumList.add(sum);

        }
        for (int element:sumList) {
            System.out.println(element);
        }
    }
}
