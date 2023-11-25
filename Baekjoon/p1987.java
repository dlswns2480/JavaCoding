package src.Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class p1987 {
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int y;
    static int x;
    static String[][] road;
    static Map<String, Integer> map = new HashMap<>();
    static int count = 1;
    static boolean[][] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        y = Integer.parseInt(input[0]);
        x = Integer.parseInt(input[1]);
        road = new String[y][x];
        visited = new boolean[y][x];
        for(int i = 0; i < y; i++){
            String[] alpha = br.readLine().split("");
            for(int j = 0; j < x; j++){
                road[i][j] = alpha[j];
                map.put(road[i][j], 0);
            }
        }
        map.put(road[0][0], 1);
        dfs(0, 0, count);

        System.out.print(count);
    }

    private static void dfs(int y1, int x1, int cnt) {
        visited[y1][x1] = true;

        for(int i = 0; i < 4; i++){
            int yloc = y1 + dy[i];
            int xloc = x1 + dx[i];
            if(checkArray(yloc, xloc)){
                if(checkArray(yloc, xloc) && map.get(road[yloc][xloc]) == 1){
                    count = Math.max(cnt, count);
                    continue;
                }
                map.put(road[yloc][xloc], 1);
                dfs(yloc, xloc, cnt + 1);
                map.put(road[yloc][xloc], 0);
            }
        }
    }

    private static boolean checkArray(int yloc, int xloc) {
        return yloc >= 0 && xloc >= 0 && yloc < y && xloc < x;
    }
}
