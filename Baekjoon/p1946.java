package src.Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class p1946 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int size = Integer.parseInt(br.readLine());
        for(int i = 0; i < size; i++){
            int answer = 0;
            int people = Integer.parseInt(br.readLine());
            int[][] rank = new int[people][2];
            for(int j = 0; j < people; j++){
                String[] input = br.readLine().split(" ");
                rank[j][0] = Integer.parseInt(input[0]);
                rank[j][1] = Integer.parseInt(input[1]);
            }

            Arrays.sort(rank, ((o1, o2) -> {
                return o1[0] - o2[0];
            }));
            answer++;
            int comparison = rank[0][1];
            for(int k = 1; k < people; k++){
                if(rank[k][1] < comparison){
                    answer++;
                    comparison = rank[k][1];
                }
            }
            sb.append(answer).append("\n");
        }
        sb.deleteCharAt(sb.length() - 1);
        System.out.print(sb.toString());
    }
}
