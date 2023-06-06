package src.Level1;

public class ForStack {
    boolean solution(String s) {
        boolean answer = true;
        int cnt_a = 0;
        int cnt_b = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(0) == ')')
                return false;
            if(s.charAt(i) == '('){
                cnt_a += 1;
            }
            else
                cnt_a -= 1;
            if(cnt_a < 0)
                return false;
        }
        if(cnt_a != 0)
            answer = false;
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println(cnt_a + " " + cnt_b);

        return answer;
    }
}
