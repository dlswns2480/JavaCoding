package src.Level1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PhysicalClothes {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;

        List<Integer> lost1 = Arrays.stream(lost)
                .boxed()
                .collect(Collectors.toList());
        List<Integer> lost2 = Arrays.stream(reserve)        // IntStream
                .boxed()          // Stream<Integer>
                .collect(Collectors.toList());
        int sum = 0;
        for(int i = 1; i <= n; i++){

            if(lost1.contains(i))
            {
                if(lost2.contains(i)){
                    lost2.remove(i);
                    sum++;
                    continue;
                }
                if(lost2.contains(i-1))
                {
                    lost2.remove(i-1);
                    sum++;
                    continue;
                }

                else if(lost2.contains(i+1))
                {
                    lost2.remove(i+1);
                    sum++;
                    continue;
                }
            }
            else{
                sum++;
            }
        }
        for(int i : lost2)
        {
            System.out.println(i);
        }

        return sum;
    }
}
