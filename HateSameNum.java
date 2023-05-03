package src;

import java.util.ArrayList;

public class HateSameNum {
    public int[] solution(int []arr) {
        ArrayList<Integer> array = new ArrayList<>();
        ArrayList<Integer> answer = new ArrayList<>();
        for(int num : arr)
        {
            array.add(num);
        }
        int save = 0;
        for(int i = 0; i < array.size() - 1; i++)
        {
            save = array.get(i);

            if(save == array.get(i+1))
            {
                continue;
            }
            answer.add(array.get(i));

        }
        answer.add(array.get(array.size() - 1));
        int[] result = new int[answer.size()];
        int i = 0;
        for(int num : answer)
        {
            result[i] = num;
            i++;
        }



        return result;
    }
}
