package src.Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class p1966 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        List<Integer> result = new ArrayList<>();
        for(int k = 0; k < size; k++){
            String[] input = br.readLine().split(" ");
            int doc = Integer.parseInt(input[0]); // 문서의 개수
            int index = Integer.parseInt(input[1]); // 궁금한 문서의 인덱스
            String[] importance = br.readLine().split(" ");
            Queue<Integer> priority = new LinkedList<>();
            Queue<Integer> elem = new LinkedList<>();
            for(String s : importance){
                priority.offer(Integer.parseInt(s));
            }
            for(int i = 0; i < doc; i++){
                elem.offer(i);
            }
            int cnt = 1;
            while (!elem.isEmpty() && !priority.isEmpty()) {
                int max = Collections.max(priority);
                int value = priority.poll();
                int currentIdx = elem.poll();
                if(value < max){
                    priority.offer(value);
                    elem.offer(currentIdx);
                }
                else if(value == max){
                    if(index == currentIdx){
                        result.add(cnt);
                        break;
                    }
                    cnt++;
                }
            }
        }
        for(int i = 0; i < result.size() - 1; i++){
            System.out.println(result.get(i));
        }
        System.out.print(result.get(result.size()-1));
    }
}
