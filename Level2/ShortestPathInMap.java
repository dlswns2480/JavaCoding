package src.Level2;
import java.util.*;
public class ShortestPathInMap {
    static int[] dx = {1,0,-1,0};
    static int[] dy = {0, 1, 0, -1};
    static int[][] map;
    static int n;
    static int m;
    static boolean[][] visited;
    public int solution(int[][] maps) {
        n = maps.length;
        m = maps[0].length;
        map = maps;
        System.out.println(map.length);
        System.out.println(map[0].length);
        bfs(0,0);
        if(map[maps.length - 1][maps[0].length - 1] == 1){
            return -1;
        }
        return map[n - 1][m - 1];
    }
    private static void bfs(int y, int x){
        Queue<Node> que = new LinkedList<>();
        Node node = new Node(y, x);
        que.offer(node);
        while(!que.isEmpty()){
            Node poll = que.poll();
            for(int i = 0; i < 4; i++){
                int nextY = dy[i] + poll.y;
                int nextX = dx[i] + poll.x;
                if(nextX >= 0 && nextY >= 0 && nextX < m && nextY < n && map[nextY][nextX] == 1){
                    que.offer(new Node(nextY, nextX));
                    map[nextY][nextX] = map[poll.y][poll.x] + 1;
                }
            }
        }
    }
    static class Node{
        int y;
        int x;

        public Node(int y, int x) {
            this.y = y;
            this.x = x;
        }
    }
}
