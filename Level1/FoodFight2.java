package src.Level1;

public class FoodFight2 {
    public String solution(int[] food) {
        String answer = "";
        for(int i = 1; i < food.length; i++){
            int multiple = food[i];
            if(multiple % 2 != 0){
                multiple -= 1;
            }
            else if(multiple == 1)
                continue;
            multiple /= 2;
            answer  = answer + String.valueOf(i).repeat(multiple);
        }
        answer += "0";
        for(int i = answer.length() - 2; i >= 0; i--){
            answer += String.valueOf(answer.charAt(i));
        }
        System.out.println(answer);

        return answer;
    }
}
