package src.Level1;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class AddNoneNum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,0};
        int sum = 0;
        for(int i = 0; i < 10; i++)
        {
            if(Arrays.stream(arr)
                    .boxed()
                    .collect(Collectors.toSet())
                    .contains(i))
            {
                continue;
            }
            else {
                sum += i;
//                System.out.println(sum);
            }
        }
        System.out.println(sum);
    }
}
