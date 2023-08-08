package src.Level1;

public class Color2 {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int start = section[0];
        int color = 0;
        color = start + m - 1;
        answer++;
        for(int i = 1; i < section.length; i++){
            if(section[i] <= color){
                continue;
            }
            else{
                start = section[i];
                color = start + m - 1;
                answer++;
            }
        }
        return answer;
    }
}
