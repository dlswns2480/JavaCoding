package src.Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class p28278 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();
        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; i++){
            String[] num = br.readLine().split(" ");

            switch (Integer.parseInt(num[0])){
                case 1:
                    stack.push(Integer.parseInt(num[1]));
                    break;
                case 2:
                    if(stack.size() > 0){
                        System.out.println(stack.pop());
                    }
                    else{
                        System.out.println(-1);
                    }
                    break;
                case 3:
                    System.out.println(stack.size());
                    break;
                case 4:
                    System.out.println(stack.isEmpty() ? 1 : 0);
                    break;
                case 5:
                    System.out.println(stack.isEmpty() ? -1 : stack.peek());
                    break;
            }
        }
    }
}
