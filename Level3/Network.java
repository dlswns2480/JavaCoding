package src.Level3;

public class Network {
    static boolean[][] visited;
    static int[][] computer;
    static int num;
    static int[][] conn;
    static int network = 0;
    static boolean[] node;
    public int solution(int n, int[][] computers) {
        computer = computers;
        num = n;
        visited = new boolean[num][num];
        node = new boolean[num];
        conn = new int[num][num];
        for(int i = 0; i < num; i++){
            for(int j = 0; j < num; j++){
                if(i == j) continue;
                if(computer[i][j] == 1){
                    conn[i][j] = conn[j][i] = 1;
                }
            }
        }
        for(int i = 0; i < num; i++){
            for(int j = 0; j < num; j++){
                if(conn[i][j] == 1 && !visited[i][j]){
                    network++;
                    dfs(i, j);
                }
            }
        }
        for(int i = 0; i < num; i++){
            if(!node[i]){
                network++;
            }
        }
        return network;
    }
    private static void dfs(int i, int j){
        visited[i][j] = visited[j][i] = true;
        node[i] = node[j] = true;
        for(int k = 0; k < num; k++){
            if(j == k) continue;
            if(i >= 0 && j >= 0 && i < num && j < num && conn[j][k] == 1 && !visited[j][k]){
                dfs(j, k);
            }
        }
    }
}
