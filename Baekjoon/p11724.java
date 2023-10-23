package src.Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p11724 {
    static boolean[][] connect;
    static int node;
    static int edge;
    static int answer = 0;
    static boolean[] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] s = br.readLine().split(" ");
        node = Integer.parseInt(s[0]);
        edge = Integer.parseInt(s[1]);
        connect = new boolean[node + 1][node + 1];
        visited = new boolean[node + 1];
        for(int i = 1; i <= node; i++){
            visited[i] = false;
        }
        for(int i = 0; i < edge; i++){
            String[] input = br.readLine().split(" ");
            int node1 = Integer.parseInt(input[0]);
            int node2 = Integer.parseInt(input[1]);
            connect[node1][node2] = connect[node2][node1] = true;
        }
        for(int i = 1; i <= node; i++){
            if(!visited[i]){
                dfs(i);
                answer++;
            }
        }
        dfs(1);
        System.out.print(answer);

    }

    private static void dfs(int start) {
        if(visited[start]){
            return;
        }
        else{
            visited[start] = true;
            for(int i = 1; i <= node; i++){
                if (connect[start][i] && !visited[i]) {
                    dfs(i);
                }
            }
        }
    }
}
