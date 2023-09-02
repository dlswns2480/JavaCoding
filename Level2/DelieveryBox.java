package src.Level2;
import java.util.*;
public class DelieveryBox {
    public int solution(int[] order) {
        int answer = 0;
        Queue<Integer> std = new LinkedList<>();
        Stack<Integer> sub = new Stack<>();
        for(int i = 1; i <= order.length; i++){
            std.offer(i);
        }
        int i = 0;
        while(i < order.length){
            if(std.isEmpty()){
                if(!sub.isEmpty() && order[i] == sub.peek()){
                    i++;
                    answer++;
                    sub.pop();
                    continue;
                }
                break;
            }
            if(order[i] != std.peek()){
                if(!sub.isEmpty() && sub.peek() == order[i]){
                    sub.pop();
                    i++;
                    answer++;
                    continue;
                }
                sub.push(std.poll());
            }
            else if(order[i] == std.peek()){
                std.poll();
                answer++;
                i++;
            }
        }
        return answer;
    }
}
