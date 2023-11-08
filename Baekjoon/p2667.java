package src.Baekjoon;

import java.io.BufferedReader;
import java.io.IOError;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class p2667 {
    static int apart = 0;
    static int[][] map;
    static int size;
    static boolean[][] visited;
    static int[] dx = {1,0,-1,0};
    static int[] dy = {0,1,0,-1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        size = Integer.parseInt(br.readLine());
        map = new int[size][size];
        visited = new boolean[size][size];

        for(int i = 0; i < size; i++){
            String[] input = br.readLine().split("");
            for(int j = 0; j < input.length; j++){
                map[i][j] = Integer.parseInt(input[j]);
            }
        }
        int cnt = 0;
        List<Integer> resultNum = new ArrayList<>();
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                if(map[i][j] == 1 && !visited[i][j]){
                    apart = 1;
                    cnt++;
                    dfs(i, j);
                    resultNum.add(apart);
                }
            }
        }
        System.out.println(cnt);
        Collections.sort(resultNum);
        for(int i = 0; i < resultNum.size() - 1; i++){
            System.out.println(resultNum.get(i));
        }
        System.out.print(resultNum.get(resultNum.size()-1));
    }

    private static void dfs(int x, int y) {
        visited[x][y] = true;
        for(int i = 0; i < 4; i++){
            int xloc = x + dx[i];
            int yloc = y + dy[i];
            if(xloc >= 0 && yloc >=0 && xloc < size && yloc < size && map[xloc][yloc] == 1 && !visited[xloc][yloc]){
                apart ++;
                dfs(xloc, yloc);
            }
        }
    }
}
