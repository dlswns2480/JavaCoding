package src.Baekjoon;

import javax.crypto.spec.PSource;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p1110 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int origin = Integer.parseInt(str);
        int answer = 0;
        while(true){
            answer++;
            if(str.length() == 1)
                str = "0" + str;
            String addStr = String.valueOf(str.charAt(1));
            int newStr = Integer.parseInt(String.valueOf(str.charAt(0))) + Integer.parseInt(String.valueOf(str.charAt(1)));
            String newStr2 = String.valueOf(newStr);
            String secStr = addStr + newStr2.charAt(newStr2.length() - 1);
//            System.out.println(secStr);
            if(origin == Integer.parseInt(secStr)){
                break;
            }
            str = secStr;

        }
        System.out.print(answer);

    }
}
