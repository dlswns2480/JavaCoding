package src.Baekjoon;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class p17413 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        String[] s = new String[string.length()];
        for(int i = 0; i < string.length(); i++){
            s[i] = String.valueOf(string.charAt(i));
        }
        String answer = "";
        Stack<String> st = new Stack<>();
        int check = 0;

        for(int i = 0; i < s.length; i++){


            if (s[i].equals("<")) {
                check = 1;
                while(!st.isEmpty()){
//                    System.out.println(st.peek());
                    answer += st.pop();
                }
            }
            st.push(s[i]);
            if (s[i].equals(">")) {
                check = 0;
                while(!st.isEmpty()){
                    answer += st.remove(0);
                }
            }
            if(s[i].equals(" ") && check == 0){
                st.pop();
                while(!st.isEmpty()){
//                    System.out.println(st.peek());
                    answer += st.pop();
                }
                answer += " ";
            }
            if (i == s.length - 1 && check == 0) {
                while(!st.isEmpty()){
                    answer += st.pop();
                }
            }
        }

        System.out.println(answer);
//        System.out.println("change :" + string.charAt(25) + "yes");
    }
}
