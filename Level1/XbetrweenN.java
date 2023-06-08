package src.Level1;

public class XbetrweenN {
    public long[] solution(long x, int n) {
        long[] answer = {};
        answer = new long[n];
        if(x == 0){
            for(int i = 0; i < n;){
                answer[i] = 0;
            }
        }
        answer[0] = x;
        for(int i = 1; i < n; i++){
            answer[i] = x * (i + 1);

        }
        return answer;
    }
}
