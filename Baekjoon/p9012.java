package src.Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Stack;

public class p9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader bt = new BufferedReader(new InputStreamReader(System.in));
        Stack<String> st = new Stack<>();
        int cnta = 0;

        int size = Integer.parseInt(bt.readLine());
        for(int i = 0; i < size; i++){
            String[] str = bt.readLine().split("");

            cnta = 0;
            for(int j = 0; j < str.length; j++){


                if(str[0].equals(")")){
                    System.out.println("NO");
                    break;
                }
                if(str[j].equals("(")) {
                    cnta++;
                }
                else {
                    cnta--;
                }
                if(cnta < 0){
                    System.out.println("NO");
                    break;
                }
                System.out.println(cnta);
            }
            if(cnta == 0)
                System.out.println("YES");
            else
                System.out.println("NO");

        }
    }
}
