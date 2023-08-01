package src.Level1;
//둘만의 암호
//        문제 설명
//        두 문자열 s와 skip, 그리고 자연수 index가 주어질 때, 다음 규칙에 따라 문자열을 만들려 합니다. 암호의 규칙은 다음과 같습니다.
//
//        문자열 s의 각 알파벳을 index만큼 뒤의 알파벳으로 바꿔줍니다.
//        index만큼의 뒤의 알파벳이 z를 넘어갈 경우 다시 a로 돌아갑니다.
//        skip에 있는 알파벳은 제외하고 건너뜁니다.
//        예를 들어 s = "aukks", skip = "wbqd", index = 5일 때, a에서 5만큼 뒤에 있는 알파벳은 f지만 [b, c, d, e, f]에서 'b'와 'd'는 skip에 포함되므로 세지 않습니다. 따라서 'b', 'd'를 제외하고 'a'에서 5만큼 뒤에 있는 알파벳은 [c, e, f, g, h] 순서에 의해 'h'가 됩니다. 나머지 "ukks" 또한 위 규칙대로 바꾸면 "appy"가 되며 결과는 "happy"가 됩니다.
//
//        두 문자열 s와 skip, 그리고 자연수 index가 매개변수로 주어질 때 위 규칙대로 s를 변환한 결과를 return하도록 solution 함수를 완성해주세요.
public class TwoPassword {
    public String solution(String s, String skip, int index) {
        String answer = "";
        String dict = "";
        for(char c = 'a'; c <= 'z'; c++){
            dict += String.valueOf(c);
        }
        for(int i = 0; i < skip.length(); i++){
            dict = dict.replace(String.valueOf(skip.charAt(i)), "");
        }
        for(int i = 0; i < s.length(); i++){
            int idx = dict.indexOf(s.charAt(i));
            int need_index = idx + index;

            while(need_index >= dict.length()){
                need_index -= dict.length();
            }

            answer += String.valueOf(dict.charAt(need_index));
        }

        // System.out.println(dict.length());
        // System.out.println(dict);
        return answer;
    }
}
