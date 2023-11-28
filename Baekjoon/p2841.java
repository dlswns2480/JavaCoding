package src.Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class p2841 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;
        String[] input = br.readLine().split(" ");
        int size = Integer.parseInt(input[0]);
        int plat = Integer.parseInt(input[1]);
        Stack<Integer>[] stack = new Stack[7];
        for(int i = 0; i <= 6; i++){
            stack[i] = new Stack<>();
        }
        for(int i = 0; i < size; i++){
            String[] melody = br.readLine().split(" ");
            int sound = Integer.parseInt(melody[1]);
            int line = Integer.parseInt(melody[0]);
            while(!stack[line].isEmpty() && stack[line].peek() > sound){
                stack[line].pop();
                count++;
            }
            if(stack[line].isEmpty() || stack[line].peek() < sound){
                stack[line].push(sound);
                count++;
            }
//            System.out.println("i : " + i + " " + "count : " + count);
        }
        System.out.print(count);
    }

}
