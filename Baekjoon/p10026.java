package src.Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p10026 {
    static String[][] paint;
    static int num;
    static  boolean[][] visited;
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1,0,-1,0};
    static int normal;
    static int redgreen;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        num = Integer.parseInt(br.readLine());

        paint = new String[num][num];
        visited = new boolean[num][num];
        for(int i = 0; i < num; i++){
            String[] input = br.readLine().split("");
            for(int j = 0; j < input.length; j++){
                paint[i][j] = input[j];
            }
        }

        for(int i = 0; i < num; i++){
            for(int j = 0; j < num; j++){
                if (!visited[i][j]) {
                    normal++;
                    dfs(i, j, paint[i][j]);
                }
            }
        }
        for(int i = 0; i < num; i++){
            for(int j = 0; j < num; j++){
                visited[i][j] = false;
            }
        }
        for(int i = 0; i < num; i++){
            for(int j = 0; j < num; j++){
                if (!visited[i][j]) {
                    if (paint[i][j].equals("R") || paint[i][j].equals("G")) {
                        redgreen++;
                        redDfs(i, j, paint[i][j]);
                    }
                    else{
                        redgreen++;
                        dfs(i, j, paint[i][j]);
                    }
                }
            }
        }
        System.out.print(normal + " " + redgreen);

    }

    private static void redDfs(int i, int j, String string) {
        visited[i][j] = true;
        for(int k = 0; k < 4; k++){
            int x = i + dx[k];
            int y = j + dy[k];
            if(arrayCheck(x, y) && !visited[x][y] && (paint[x][y].equals("R") || paint[x][y].equals("G"))){
                redDfs(x, y, paint[x][y]);
            }
        }
    }

    private static void dfs(int i, int j, String str) {
        visited[i][j] = true;
        for(int k = 0; k < 4; k++){
            int x = i + dx[k];
            int y = j + dy[k];
            if(arrayCheck(x, y) && !visited[x][y] && paint[x][y].equals(str)){
                dfs(x, y, paint[x][y]);
            }
        }
    }

    private static boolean arrayCheck(int x1, int y1) {
        return x1 >= 0 && y1 >= 0 && x1 < num && y1 < num;
    }
}
