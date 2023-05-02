package src;

import java.util.Arrays;

public class KthNumber {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        // int[] slice = {};
        for(int i = 0; i < commands.length; i++)
        {
            int a = commands[i][0] - 1;

            int b = commands[i][1];
            int c = commands[i][2] - 1;
            int[] slice = Arrays.copyOfRange(array, a, b);
            Arrays.sort(slice);
            answer[i] = slice[c];
            // System.out.println(slice[c]);
        }
        return answer;
    }
}
