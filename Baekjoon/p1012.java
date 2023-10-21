package src.Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class p1012 {
    static boolean[][] vachu;
    static boolean[][] visited;
    static int dirX[] = {0, 0, -1, 1};
    static int dirY[] = {-1, 1, 0, 0};
    static int dx, dy;
    static int cnt = 0;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        List<Integer> answer = new ArrayList<>();
        for(int m = 0; m < T; m++){
            cnt = 0;
            String[] loc = br.readLine().split(" ");
            int garo = Integer.parseInt(loc[0]);
            int sero = Integer.parseInt(loc[1]);
            int num = Integer.parseInt(loc[2]);

            vachu = new boolean[garo + 1][sero + 1];
            visited = new boolean[garo + 1][sero + 1];
            for(int i = 0; i < num; i++){
                String[] arr = br.readLine().split(" ");
                int x = Integer.parseInt(arr[0]);
                int y = Integer.parseInt(arr[1]);
                vachu[x][y] = true;
            }
            for(int i = 0; i < garo; i++){
                for(int j = 0; j < sero; j++){
                    if(vachu[i][j] && !visited[i][j]){
                        cnt++;
                        dfs(i, j);
                    }
                }
            }
            answer.add(cnt);
        }
        for(int i = 0; i < answer.size() - 1; i++){
            System.out.println(answer.get(i));
        }
        System.out.print(answer.get(answer.size() - 1));
    }

    private static void dfs(int x, int y) {
        visited[x][y] = true;
        for(int i = 0; i < 4; i++){
            dx = x + dirX[i];
            dy = y + dirY[i];
            if(dx >= 0 && dy >= 0){
                if(vachu[dx][dy] && !visited[dx][dy]){
                    dfs(dx, dy);
                }
            }
        }
    }
}
