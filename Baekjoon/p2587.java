package src.Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class p2587 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> lst = new ArrayList<>();
        int sum = 0;
        for(int i = 0; i < 5; i++){
            int n = Integer.parseInt(br.readLine());
            lst.add(n);
            sum += n;
        }
        Collections.sort(lst);
        System.out.println(sum / 5);
        System.out.print(lst.get(2));

    }
}
