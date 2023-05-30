package src.Level1;

public class CompareChar {
    boolean solution(String s) {
        boolean answer = true;
        int p_count = 0;
        int y_count = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'p' || s.charAt(i) == 'P'){
                p_count += 1;
            }
            else if(s.charAt(i) == 'y' || s.charAt(i) == 'Y'){
                y_count += 1;
            }
        }
        if(p_count == y_count){
            return true;
        }
        else
            return false;
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.



    }
}
