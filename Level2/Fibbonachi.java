package src.Level2;

public class Fibbonachi {
    public int solution(int n) {
        int answer = 0;
        int[] C = new int[n + 1];
        C[0] = 0;
        C[1] = 1;

        for(int i = 2; i <= n; i++){
            C[i] = (C[i-1] + C[i-2])%1234567;
        }
        // answer = fibb(n);
        answer = C[n];
        return answer;
    }
}
