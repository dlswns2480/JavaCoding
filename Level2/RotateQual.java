package src.Level2;

import java.util.Stack;

//괄호 회전하기
//        문제 설명
//        다음 규칙을 지키는 문자열을 올바른 괄호 문자열이라고 정의합니다.
//
//        (), [], {} 는 모두 올바른 괄호 문자열입니다.
//        만약 A가 올바른 괄호 문자열이라면, (A), [A], {A} 도 올바른 괄호 문자열입니다. 예를 들어, [] 가 올바른 괄호 문자열이므로, ([]) 도 올바른 괄호 문자열입니다.
//        만약 A, B가 올바른 괄호 문자열이라면, AB 도 올바른 괄호 문자열입니다. 예를 들어, {} 와 ([]) 가 올바른 괄호 문자열이므로, {}([]) 도 올바른 괄호 문자열입니다.
//        대괄호, 중괄호, 그리고 소괄호로 이루어진 문자열 s가 매개변수로 주어집니다. 이 s를 왼쪽으로 x (0 ≤ x < (s의 길이)) 칸만큼 회전시켰을 때 s가 올바른 괄호 문자열이 되게 하는 x의 개수를 return 하도록 solution 함수를 완성해주세요.
public class RotateQual {
    public int solution(String s) {
        int answer = 0;
        int[] test = new int[3];
        Stack<Character> qual = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            if(i >= 1)
                s = rotate(s);
            // System.out.println(s + " " + s.length() + " " + i);
            if(s.charAt(0) == '}' || s.charAt(0) == ']' || s.charAt(0) == ')')
                continue;
            for(int j = 0; j < s.length(); j++){
                if(s.charAt(j) == '[' || s.charAt(j) == '{' || s.charAt(j) == '('){
                    qual.push(s.charAt(j));
                    // System.out.println("넣었습니다" + " " + qual.empty());
                }
                else{
                    // System.out.println("이제 뺍니다");
                    if(!qual.empty())
                        isCheck(qual, s.charAt(j));
                }
            }
            // System.out.println("한턴 끝");
            if(qual.empty()){
                answer++;
            }
            qual.clear();
        }
        return answer;
    }
    public void isCheck(Stack stack, char c){
        if(c == '}'){
            if(stack.peek().equals('{')){
                // System.out.println("{ 뺍니다");
                stack.pop();
            }
        }
        else if(c == ')'){
            if(stack.peek().equals('(')){
                // System.out.println("뺍니다");
                stack.pop();
            }
        }
        else if(c == ']'){
            if(stack.peek().equals('[')){
                // System.out.println("[ 뺍니다");
                stack.pop();
            }
        }
    }

    public String rotate(String str){
        return str.substring(1) + str.charAt(0);
    }
}
