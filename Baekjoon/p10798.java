package src.Baekjoon;

import java.util.Scanner;
import java.util.SimpleTimeZone;

public class p10798 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] board = new String[5][15];
        String answer = "";
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 15; j++) {
                board[i][j] = "";
            }
        }
        for(int i = 0; i < 5; i++){
            String str = sc.nextLine();
            for(int j = 0; j < str.length(); j++){
                board[i][j] = String.valueOf(str.charAt(j));
            }
        }
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 5; j++) {
                answer += board[j][i];
            }
        }
        System.out.print(answer);
    }
}
