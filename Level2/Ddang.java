package src.Level2;
import java.util.*;
public class Ddang {
    int solution(int[][] land) {
        int answer = 0;
        int dp[][] = new int[land.length + 1][4];
        ArrayList<Integer> lst = new ArrayList<>();
        for(int i = 0; i < land.length; i++){
            for(int j = 0; j < 4; j++){
                dp[i][j] = land[i][j];
            }
        }
        for(int i = 1; i <= land.length; i++){

            dp[i][0] += Math.max(Math.max(dp[i-1][1], dp[i-1][2]), dp[i-1][3]);
            dp[i][1] += Math.max(Math.max(dp[i-1][0], dp[i-1][2]), dp[i-1][3]);
            dp[i][2] += Math.max(Math.max(dp[i-1][1], dp[i-1][0]), dp[i-1][3]);
            dp[i][3] += Math.max(Math.max(dp[i-1][1], dp[i-1][2]), dp[i-1][0]);
            // System.out.println(land[i][0]);
        }
        for(int i = 0; i < 4; i++){
            lst.add(dp[land.length][i]);
            // System.out.println(dp[land.length - 1][i]);
        }
        answer = Collections.max(lst);

        return answer;
    }
}
