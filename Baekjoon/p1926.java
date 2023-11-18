package src.Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p1926 {
    static int y;
    static int x;
    static int[][] paint;
    static boolean[][] visited;
    static int[] dx = {1, 0, -1, 0};
    static int width;
    static int[] dy = {0, 1, 0, -1};
    static int paintCnt;
    static int count;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        y = Integer.parseInt(s[0]);
        x = Integer.parseInt(s[1]);
        paint = new int[y][x];
        visited = new boolean[y][x];
        for(int i = 0; i < y; i++){
            String[] input = br.readLine().split(" ");
            for(int j = 0; j < x; j++){
                paint[i][j] = Integer.parseInt(input[j]);
            }
        }
        paintCnt = 0;
        width = 0;
        for(int i = 0; i < y; i++){
            for(int j = 0; j < x; j++){
                if(!visited[i][j] && paint[i][j] == 1){
                    paintCnt++;
                    count = 1;
                    dfs(i, j);
                    width = Math.max(width, count);
                }
            }
        }
        if(paintCnt == 0){
            width = 0;
        }
        System.out.println(paintCnt);
        System.out.print(width);

    }

    private static void dfs(int y, int x) {
        visited[y][x] = true;
        for(int i = 0; i < 4; i++){
            int yloc = y + dy[i];
            int xloc = x + dx[i];
            if(checkRange(yloc, xloc) && paint[yloc][xloc] == 1 && !visited[yloc][xloc]){
                count++;
//                System.out.println("yloc : " + yloc + " xloc : " + xloc + " " );
                dfs(yloc, xloc);
            }
        }
    }
    private static boolean checkRange(int y1, int x1){
        return x1 >=0 && y1>=0 && x1 < x && y1 < y;
    }
}
