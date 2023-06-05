package src.Level1;

import java.util.ArrayList;
import java.util.Collections;

public class RemoveMini {
    public int[] solution(int[] arr) {
        ArrayList<Integer> lst = new ArrayList<>();
        int[] answer = {};
        if (arr.length == 1) {
            answer = new int[1];
            answer[0] = -1;
            return answer;
        }
        int mini = 0;

        for (int num : arr) {
            lst.add(num);
        }
        mini = Collections.min(lst);
        lst.remove(Integer.valueOf(mini));
        answer = new int[arr.length - 1];
        for (int i = 0; i < arr.length - 1; i++) {
            answer[i] = lst.get(i);
        }
        return answer;
    }
}