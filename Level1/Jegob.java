package src.Level1;

public class Jegob {
    public long solution(long n) {
        long answer = 0;
        for(long i = 0; i < n / 2; i++){
            if(i * i == n){
                answer = (i+1)*(i+1);
                return answer;
            }
        }
        answer = -1;
        return answer;
    }

}
