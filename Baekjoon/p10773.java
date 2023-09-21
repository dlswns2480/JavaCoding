package src.Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class p10773 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i < n; i++){
            int num = Integer.parseInt(br.readLine());
            if(num != 0){
                st.push(num);
            }
            else{
                if(st.size() > 0)
                    st.pop();
            }
        }
        int answer = 0;
        for(int number : st){
            answer += number;
        }
        System.out.println(answer);
    }
}
