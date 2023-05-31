package src.Level1;

public class FindKim {
    public String solution(String[] seoul) {
        String answer = "";
        int count = 0;
        String cnt = "";
        for(String s : seoul){
            if(s.equals("Kim")){
                cnt = String.valueOf(count);
                answer = "김서방은 ".concat(cnt).concat("에 있다");
                return answer;
            }
            count++;
        }
        return answer;
    }
}
