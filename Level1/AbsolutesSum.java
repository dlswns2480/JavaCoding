package src.Level1;

public class AbsolutesSum {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 123456789;
        int sum=0;
        for(int i =0; i<absolutes.length; i++){
            if(signs[i] == false){
                absolutes[i] *= -1;
            }
        }
        for(int num:absolutes){
            sum+=num;
        }
        return sum;
    }
}
