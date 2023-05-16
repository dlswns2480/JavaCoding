package src;

public class Budget {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int cnt = 0;
        int sum = 0;
        Arrays.sort(d);
        for(int i:d){
            sum += i;
            cnt++;
            if(sum <= budget){
                answer = cnt;
            }
            else{
                break;
            }
        }

        return answer;
    }

}
