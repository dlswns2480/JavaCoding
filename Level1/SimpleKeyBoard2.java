package src.Level1;

import java.util.HashMap;

public class SimpleKeyBoard2 {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = {};
        answer = new int[targets.length];
        HashMap<String, Integer> map = new HashMap<>();
        for(String s : keymap){
            for(int i = 0; i < s.length(); i++){
                String key = String.valueOf(s.charAt(i));
                map.put(key, Math.min(i + 1, map.getOrDefault(key, i + 1)));
            }
        }
        for(int i = 0; i < targets.length; i++){
            int cnt = 0;
            for(int j = 0; j < targets[i].length(); j++){
                if(!map.containsKey(String.valueOf(targets[i].charAt(j)))){
                    cnt = -1;
                    break;
                }
                cnt += map.get(String.valueOf(targets[i].charAt(j)));
            }
            answer[i] = cnt;
        }
        return answer;
    }
}
