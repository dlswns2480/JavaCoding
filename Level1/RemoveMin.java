package src.Level1;

import java.util.Arrays;

public class RemoveMin {
    public int[] solution(int[] arr) {
        int[] answer = arr;
        if (arr.length != 1)
        {
            Integer[] arr3 = Arrays.stream(arr).boxed().toArray(Integer[]::new);
            Arrays.sort(arr3, (i1, i2) -> i2 - i1);
            answer = Arrays.copyOfRange(Arrays.stream(arr3).mapToInt(Integer::intValue).toArray(),0, arr3.length-1);
        }
        else
        {
            answer[0] = -1;
        }
        return answer;
    }
}
