package src.Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class p2644 {
    static int size;
    static int answer = 0;
    static boolean result = false;
    static int first;
    static int sec;
    static boolean[] visited;
    static int[][] conn;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        size = Integer.parseInt(br.readLine());
        conn = new int[size + 1][size + 1];
        visited = new boolean[size + 1];
        String[] s = br.readLine().split(" ");
        first = Integer.parseInt(s[0]);
        sec = Integer.parseInt(s[1]);
        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; i++){
            String[] input = br.readLine().split(" ");
            int con1 = Integer.parseInt(input[0]);
            int con2 = Integer.parseInt(input[1]);
            conn[con1][con2] = conn[con2][con1] = 1;
        }
        dfs(first, 0);
        if(!result){
            System.out.print(-1);
            return;
        }
        System.out.print(answer);
    }

    private static void dfs(int start, int cnt) {
        visited[start]= true;
        if(start == sec){
            result = true;
            answer = cnt;
            return;
        }

        for(int i = 1; i <= size; i++){
            if(conn[i][start] == 1 && !visited[i]){
                dfs(i, cnt + 1);
            }
        }
    }
}
