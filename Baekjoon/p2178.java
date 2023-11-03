package src.Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class p2178 {
    static int n;
    static int m;
    static boolean[][] visited;
    static int[][] miro;
    static int[] dx = {1,0,-1,0};
    static int[] dy = {0, 1, 0, -1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        n = Integer.parseInt(input[0]);
        m = Integer.parseInt(input[1]);
        miro = new int[n][m];
        visited = new boolean[n][m];
        for(int i = 0; i < n; i++){
            String[] location = br.readLine().split("");
            for(int j = 0; j < location.length; j++){
                miro[i][j] = Integer.parseInt(location[j]);
            }
        }
        bfs(0,0);

        System.out.print(miro[n-1][m-1]);
    }
    static class Node{
        int y;
        int x;

        public Node(int y, int x) {
            this.y = y;
            this.x = x;
        }
    }
    private static void bfs(int y, int x) {
        Queue<Node> que = new LinkedList<>();
        Node node = new Node(y, x);
        visited[y][x] = true;
        que.add(node);
        while(!que.isEmpty()){
            Node poll = que.poll();
            for(int i = 0; i < 4; i++){
                int nextY = dy[i] + poll.y;
                int nextX = dx[i] + poll.x;
                if(nextY >= 0 && nextX >=0 && nextY < n && nextX < m && miro[nextY][nextX] == 1 && !visited[nextY][nextX]){
                    que.add(new Node(nextY, nextX));
                    miro[nextY][nextX] = miro[poll.y][poll.x] + 1;
                    visited[nextY][nextX] = true;
                }
            }
        }
    }
}
