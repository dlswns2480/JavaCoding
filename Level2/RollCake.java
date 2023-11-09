package src.Level2;
import java.util.*;
public class RollCake {
    public int solution(int[] topping) {
        int answer = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();
        for(int n : topping){
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        for(int num : topping){
            set.add(num);
            if(map.get(num) - 1 == 0){
                map.remove(num);
            }
            else if(map.get(num) -1 != 0){
                map.put(num, map.get(num) - 1);
            }
            if(map.size() == set.size()){
                answer++;
            }
        }
        return answer;
    }
}
