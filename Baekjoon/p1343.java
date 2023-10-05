package src.Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p1343 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int cnt = 0;
        String answer = "";
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == '.'){
                answer += ".";
            }
            if(str.charAt(i) == 'X'){
                cnt++;
            }
        }
    }
}
