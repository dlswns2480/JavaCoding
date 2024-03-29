package src.Level1;

import java.util.ArrayList;
import java.util.Collections;

public class ArrangeDisplay {
    public int[] solution(String[] wallpaper) {
        int[] answer = {};
        ArrayList<Integer> x = new ArrayList<>();
        ArrayList<Integer> y = new ArrayList<>();
        for(int i = 0; i < wallpaper.length; i++){
            for(int j = 0; j < wallpaper[i].length(); j++){
                if(wallpaper[i].charAt(j)== '#'){
                    x.add(i);
                    y.add(j);
                }
            }
        }
        answer = new int[4];
        answer[0] = Collections.min(x);
        answer[1] = Collections.min(y);
        answer[2] = Collections.max(x) + 1;
        answer[3] = Collections.max(y) + 1;
        return answer;
    }
}
