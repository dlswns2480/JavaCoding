package src.Level2;
import java.util.*;
public class Boat {
    public int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);
        Deque<Integer> que = new LinkedList<>();
        for(int n : people){
            que.add(n);
        }
        int sum = 0;
        while(!que.isEmpty()){
            sum += que.peekFirst();
            if(!que.isEmpty() && sum + que.peekLast() <= limit){
                que.pollLast();
                que.pollFirst();
                sum = 0;
                answer++;
            }
            else{
                que.pollLast();
                sum = 0;
                answer++;
            }
        }
        return answer;
    }
}
