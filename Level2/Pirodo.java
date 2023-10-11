package src.Level2;

public class Pirodo {
    int answer = 0;
    public int solution(int k, int[][] dungeons) {

        boolean[] visited = new boolean[dungeons.length];
        for(int i = 0; i < visited.length; i++){
            visited[i] = false;
        }
        int cnt = 0;
        dfs(k, cnt, visited, dungeons);
        return answer;
    }

    public void dfs(int k, int cnt, boolean[] visited, int[][] dungeons){
        answer = Math.max(answer, cnt);
        for(int i = 0; i < dungeons.length; i++){
            if(visited[i] == false && k >= dungeons[i][0]){
                visited[i] = true;
                cnt++;
                dfs(k - dungeons[i][1], cnt, visited, dungeons);
                visited[i] = false;
                cnt--;
            }
        }
    }
}
