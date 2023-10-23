package src.Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class p4963 {
    static int[][] map;
    static boolean[][] visited;
    static int w, h;
    static int dx[] = {0, 0, -1 ,1, -1, 1, -1, 1}; // 상 하 좌 우 대각선 상좌, 상우, 하좌, 하우
    static int dy[] = {-1, 1, 0, 0, 1, 1, -1, -1};

    static int answer = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> result = new ArrayList<>();
        while (true) {
            String[] setting = br.readLine().split(" ");
            w = Integer.parseInt(setting[0]);
            h = Integer.parseInt(setting[1]);
            if(w == 0 && h == 0){
                break;
            }
            map = new int[h][w];
            visited = new boolean[h][w];
            for(int i = 0; i < h; i++){
                String[] input = br.readLine().split(" ");

                for(int j = 0; j < w; j++){
                    map[i][j] = Integer.parseInt(input[j]);

                }
            }
            answer = 0;
            for(int i = 0; i < h; i++){
                for(int j = 0; j < w; j++){

                    if(!visited[i][j] && map[i][j] == 1){
                        answer++;
                        dfs(i, j);

                    }
                }
            }
            result.add(answer);
        }
        for(int i = 0; i < result.size(); i++){
            if(i == result.size() - 1){
                System.out.print(result.get(i));
                break;
            }
            System.out.println(result.get(i));
        }
    }

    private static void dfs(int he, int we) {
        visited[he][we] = true;
        for(int i = 0; i < 8; i++){
            int x =  he + dx[i];
            int y = we + dy[i];


            if(x >= 0 && y >= 0 && x < h && y < w){
                if (map[x][y] == 1 && !visited[x][y]) {

                    dfs(x, y);
                }
            }
        }
    }
}
