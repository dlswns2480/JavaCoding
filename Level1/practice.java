package src.Level1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class practice {
    String[] players = {"mumu", "soe", "poe", "kai", "mine"};
    String[] callings = {"kai", "kai", "mine", "mine"};

    public String[] solution(String[] players, String[] callings) {

        HashMap<String, Integer> gi = new HashMap<String, Integer>();

        String temp;
        for (int i = 0; i < callings.length; i++) {
            int getIndex = Arrays.asList(players).indexOf(callings[i]);

            if(getIndex ==0)
                continue;
            temp = players[getIndex];
            players[getIndex] = players[getIndex - 1];
            players[getIndex - 1] = temp;
        }
        return players;
    }



}
