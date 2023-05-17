package src.Level1;

import java.util.ArrayList;
import java.util.Collections;

public class SingingScore {
    public int[] solution(int k, int[] score) {
        ArrayList<Integer> rank = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();

        for(int i = 0; i < score.length; i++)
        {
            if(rank.size() < k)
            {
                rank.add(score[i]);
                result.add(Collections.min(rank));
                continue;
            }

            if(score[i] > Collections.min(rank))
            {
                rank.remove(Collections.min(rank));
                rank.add(score[i]);
                result.add(Collections.min(rank));
            }
            else if(score[i] <= Collections.min(rank))
            {
                result.add(Collections.min(rank));
            }
        }
        int[] answer = new int[result.size()];
        int i = 0;
        for(int num : result)
        {
            answer[i] = num;
            i++;
        }
        return answer;
    }
}
