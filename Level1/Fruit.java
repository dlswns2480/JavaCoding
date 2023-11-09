package src.Level1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class Fruit {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        PriorityQueue<Integer> que = new PriorityQueue<>();
        for(int num : score){
            que.offer(num);
        }
        while(!que.isEmpty()){
            List<Integer> box = new ArrayList<>();
            for(int j = 0; j < m; j++){
                if(que.size() < m){
                    break;
                }
                box.add(que.poll());
            }

            int min = Collections.min(box);
            answer += (min * m);
        }
        return answer;
    }
}
