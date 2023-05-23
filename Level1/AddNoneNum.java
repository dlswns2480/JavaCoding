package src.Level1;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class AddNoneNum {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int length = arr1[0].length;
        int[][] answer = new int[arr1.length][length];
        System.out.println(arr1[0].length);
        for(int i = 0; i < arr1.length; i++){
            for(int j = 0; j < length; j++){
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return answer;
    }
}
