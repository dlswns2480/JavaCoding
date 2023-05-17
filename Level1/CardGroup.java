package src.Level1;

public class CardGroup {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "";
        int i = 0;
        int j = 0;
        for(String s : goal)
        {
            if(i <= cards1.length - 1 && cards1[i].equals(s))
            {
                System.out.print(cards1[i]);
                i++;
            }
            else if(j <= cards2.length - 1 && cards2[j].equals(s))
            {
                System.out.print(cards2[j]);
                j++;
            }
            else
            {
                return "No";
            }
        }
        return "Yes";

    }
}
