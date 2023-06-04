package src.Level1;

public class TwoIntegerSum {
    public long solution(int a, int b) {
        long answer = 0;
        if(a == b){
            answer = a;
            return answer;
        }
        if(a < b){
            for(int i = a; i <= b; i++){
                answer += i;
            }
        }
        else if(a > b){
            for(int i = a; i >= b; i--){
                answer += i;
            }
        }
        return answer;
    }
}
