package src.Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class p11725 {
    static int node;
    static boolean[] visited;
    static List<List<Integer>> conn = new ArrayList<>();
    static Map<Integer, Integer> result = new HashMap<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        node = Integer.parseInt(br.readLine());
        visited = new boolean[node + 1];
        for (int i = 0; i <= node; i++){
            conn.add(new ArrayList<>());
        }
        for(int i = 0; i < node - 1; i++){
            String[] s = br.readLine().split(" ");
            int first = Integer.parseInt(s[0]);
            int sec = Integer.parseInt(s[1]);
            conn.get(first).add(sec);
            conn.get(sec).add(first);
        }
        dfs(1);
        for(int i = 2; i <= node - 1; i++){
            System.out.println(result.get(i));
        }
        System.out.print(result.get(node));
    }

    private static void dfs(int start) {
        visited[start] = true;
        for(int n : conn.get(start)){
            if(!visited[n]){
                result.put(n, start);
                dfs(n);
            }
        }
    }
}
