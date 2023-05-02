package src;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class ExtractTwoAndPlus {
    public int[] solution(int[] numbers) {
        ArrayList<Integer> numlist = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < numbers.length; i++)
        {
            for(int j = 0; j < numbers.length; j++)
            {
                if(i != j)
                {
                    set.add(numbers[i] + numbers[j]);
                }
            }
        }
        for(int num : set)
        {
            numlist.add(num);
        }
        System.out.print(numlist);
        int[] answer = new int[numlist.size()];
        int index = 0;
        for(int i : numlist)
        {
            answer[index] = i;
            index++;
        }
        Arrays.sort(answer);
        return answer;

    }
}
