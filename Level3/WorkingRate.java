package src.Level3;
import java.util.*;
public class WorkingRate {
    public long solution(int n, int[] works) {
        long answer = 0;
        PriorityQueue<Integer> que = new PriorityQueue<>(Collections.reverseOrder());
        for(int num : works){
            que.offer(num);
        }
        int peek = 0;
        for(int i = 0; i < n; i++){
            peek = que.poll();

            peek--;

            que.offer(peek);
        }
        int size = que.size();
        for(int i = 0; i < size; i++){

            int plus = que.poll();
            if(plus < 0)
                continue;
            answer += Math.pow(plus, 2);
        }
        return answer;
    }
}
