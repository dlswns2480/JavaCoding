package src.Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class p2583 {
    static int x;
    static int y;
    static boolean[][] visited;
    static int[] dx = {0,0,-1,1};
    static int[] dy = {-1,1,0,0};
    static  int k;
    static int size;
    static int[][] conn;
    static List<Integer> result = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        x = Integer.parseInt(s[1]);
        y = Integer.parseInt(s[0]);
        k = Integer.parseInt(s[2]);
        visited = new boolean[y][x];
        conn = new int[y][x];
        for(int i = 0; i < k; i++){
            String[] loc = br.readLine().split(" ");
            int x1 = Integer.parseInt(loc[0]);
            int y1 = Integer.parseInt(loc[1]);
            int x2 = Integer.parseInt(loc[2]);
            int y2 = Integer.parseInt(loc[3]);
            for (int j = y1; j < y2; j++) {
                for (int n = x1; n < x2; n++) {
                    conn[j][n] = 1;
                }
            }
        }
        for(int i = 0; i < y; i++){
            for(int j = 0; j < x; j++){
                if (conn[i][j] == 0 && !visited[i][j]){
                    size = 1;
                    dfs(i, j);
                    result.add(size);
                }
            }
        }
        Collections.sort(result);
        System.out.println(result.size());
        for(int i = 0; i < result.size() - 1; i++){
            System.out.print(result.get(i) + " ");
        }
        System.out.print(result.get(result.size() - 1));
    }

    private static void dfs(int ys, int xx) {
//        conn[ys][xx] = 1;
        visited[ys][xx] = true;
        for(int i = 0; i < 4; i++){
            int xloc = xx + dx[i];
            int yloc = ys + dy[i];
            if (xloc >= 0 && yloc >= 0 && xloc < x && yloc < y && conn[yloc][xloc] == 0 && !visited[yloc][xloc]) {
                size++;
                dfs(yloc, xloc);
            }
        }
    }
}
