package src.Level1;

import java.util.Arrays;
import java.util.Collections;

public class StrangeNum {
    public String solution(String s) {

            String answer = "";

            String[] str = s.split("");
            Arrays.sort(str, Collections.reverseOrder());

            for(String a : str)
                answer += a;

            return answer;

    }
}
