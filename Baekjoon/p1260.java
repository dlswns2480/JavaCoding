package src.Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class p1260 {
    static int node;
    static int edge;
    static int start;
    static int[][] conn;
    static boolean[] visited;
    static boolean[] dfsVisited;

    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        node = Integer.parseInt(input[0]);
        edge = Integer.parseInt(input[1]);
        start = Integer.parseInt(input[2]);
        conn = new int[node+1][node+1];
        visited = new boolean[node + 1];
        dfsVisited = new boolean[node + 1];
        for(int i = 0; i < edge; i++){
            String[] connection = br.readLine().split(" ");
            int n1 = Integer.parseInt(connection[0]);
            int n2 = Integer.parseInt(connection[1]);
            conn[n1][n2] = conn[n2][n1] = 1;
        }
        sb.append(start);
        dfs(start);
        sb.append("\n");
        sb.append(start);
        bfs(start);
        System.out.print(sb.toString());
    }

    private static void bfs(int start) {
        Queue<Integer> que = new LinkedList<>();
        que.offer(start);
        dfsVisited[start] = true;
        while(!que.isEmpty()){
            int poll = que.poll();
            for(int i = 1; i <= node; i++){
                if(conn[poll][i] == 1 && !dfsVisited[i]){
                    que.offer(i);
                    dfsVisited[i] = true;
                    sb.append(" " + i);
                }
            }
        }
    }

    private static void dfs(int start) {
        visited[start] = true;
        for(int i = 1; i <= node; i++){
            if(conn[start][i] == 1 && !visited[i]){
                sb.append(" " + i);
                dfs(i);
            }
        }
    }

}
