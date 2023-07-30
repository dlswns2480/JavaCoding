package src.Level1;

import java.util.HashMap;
//문제 설명
//        수많은 마라톤 선수들이 마라톤에 참여하였습니다. 단 한 명의 선수를 제외하고는 모든 선수가 마라톤을 완주하였습니다.
//
//        마라톤에 참여한 선수들의 이름이 담긴 배열 participant와 완주한 선수들의 이름이 담긴 배열 completion이 주어질 때, 완주하지 못한 선수의 이름을 return 하도록 solution 함수를 작성해주세요.
public class Marathon {
    public String solution(String[] participant, String[] completion) {
        String result = "";
        HashMap<String, Integer> part = new HashMap<>();
        for(String s : participant){
            part.put(s, part.getOrDefault(s, 0) + 1);
        }
        for(int i = 0; i < completion.length; i++){
            int count = part.get(completion[i]);
            part.put(completion[i], --count);
        }
        for(String s : part.keySet()){
            // System.out.println(s + " " + part.get(s));
            if(part.get(s) != 0)
                return s;
        }
        return result;
    }
}
