package src;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class p10757 {
    public String[] solution(String[] players, String[] callings) {

        HashMap<String, Integer> gi = new HashMap<String, Integer>();
        String[] answer = new String[players.length];
        for (int i = 0; i < players.length; i++) {
            answer[i] = "";

        }
        String temp;
        for (int i = 0; i < players.length; i++) {
            //int getIndex = Arrays.asList(players).indexOf(callings[i]);
            gi.put(players[i], i);
        }
        for (String elem:callings) {
            int getValues = gi.get(elem);
            if(getValues == 0 )
                continue;
            getValues--;
            answer[getValues] = elem;
        }
        return answer;
    }
}
