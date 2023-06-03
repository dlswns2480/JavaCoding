package src.Level1;

import java.util.ArrayList;
import java.util.Arrays;

public class SortDivisor {
    public int[] solution(int[] arr, int divisor) {

        ArrayList<Integer> result = new ArrayList<>();

        for(int num : arr){
            if(num % divisor == 0){
                result.add(num);
            }
        }
        int[] answer = new int[result.size()];
        if(result.size() == 0){
            answer = new int[1];
            answer[0] = -1;
        }

        for(int i = 0; i < result.size(); i++){
            answer[i] = result.get(i);
        }
        Arrays.sort(answer);

        return answer;
    }
}
