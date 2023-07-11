package src.Level1;
//시저 암호
//        문제 설명
//        어떤 문장의 각 알파벳을 일정한 거리만큼 밀어서 다른 알파벳으로 바꾸는 암호화 방식을 시저 암호라고 합니다. 예를 들어 "AB"는 1만큼 밀면 "BC"가 되고, 3만큼 밀면 "DE"가 됩니다. "z"는 1만큼 밀면 "a"가 됩니다. 문자열 s와 거리 n을 입력받아 s를 n만큼 민 암호문을 만드는 함수, solution을 완성해 보세요.
//
//        제한 조건
//        공백은 아무리 밀어도 공백입니다.
//        s는 알파벳 소문자, 대문자, 공백으로만 이루어져 있습니다.
//        s의 길이는 8000이하입니다.
//        n은 1 이상, 25이하인 자연수입니다.
public class ScissorPW {
    public String solution(String s, int n) {
        char[] lower = new char[26];
        String ex = "";
        String upper = "";
        for(char i = 'a',j = 0; i <= 'z'; i++,j++){
            ex += i;
        }
        for(char i = 'A',j = 0; i <= 'Z'; i++,j++){
            upper += i;
        }
        // s = s.toLowerCase();
        // Arrays.asList(arr).indexOf("b")
        String answer = "";
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);

            if(ch == ' '){
                answer += String.valueOf(ch);
                continue;
            }



            if(Character.isUpperCase(ch)){
                int idx = upper.indexOf(ch);
                idx += n;
                if(idx > 25){
                    idx = (idx % 25) - 1;
                }
                answer += String.valueOf(upper.charAt(idx));

            }
            else if(Character.isLowerCase(ch)){
                int idx = ex.indexOf(ch);
                idx += n;
                if(idx > 25){
                    idx = (idx % 25) - 1;
                }
                answer += String.valueOf(ex.charAt(idx));

            }



        }
        return answer;
    }
}
