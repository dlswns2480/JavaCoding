package src.Level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class MethodPractice {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        int[] arr1 = new int[10];
        int cnt = 0;
        for(int i = 2; i <= 20; i += 2){
            arr.add(i);
            stack.push(i);
            arr1[cnt] = i;
            cnt++;
        }
        System.out.println(stack.empty() + "" + stack.isEmpty());
        String str = "onetwothreethreefivesixnineteneleven";
        str = str.replaceFirst("three", "");
        System.out.println(str);
    }

}
