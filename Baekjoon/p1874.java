package src.Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class p1874 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> que = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();
        int size = Integer.parseInt(br.readLine());
        int[] arr = new int[size];
        for(int i = 0; i < size; i++){
            arr[i] = Integer.parseInt(br.readLine());
            que.offer(i + 1);
        }
        int idx = 0;
        while (idx < size) {
            if(!que.isEmpty() && que.peek() < arr[idx]){
                stack.push(que.poll());
                sb.append("+\n");
            }
            else if (!que.isEmpty() && que.peek() == arr[idx]) {
                stack.push(que.poll());
                stack.pop();
                sb.append("+\n-\n");
                idx++;
            }
            else if (!que.isEmpty() && que.peek() > arr[idx]) {
                if(stack.isEmpty()){
                    sb.setLength(0);
                    sb.append("NO\n");
                    break;
                }
                if (stack.peek() == arr[idx]) {
                    stack.pop();
                    sb.append("-\n");
                    idx++;
                    continue;
                }
                stack.pop();
                sb.append("-\n");
            } else if (que.isEmpty() && !stack.isEmpty() && stack.peek() == arr[idx]) {
                stack.pop();
                idx++;
                sb.append("-\n");
            } else if (que.isEmpty() && !stack.isEmpty() && stack.peek() > arr[idx]) {
                sb.setLength(0);
                sb.append("NO\n");
                break;
            }
            else if(que.isEmpty() && stack.isEmpty()){
                sb.setLength(0);
                sb.append("NO\n");
                break;
            }
        }
        sb.deleteCharAt(sb.length() - 1);
        System.out.print(sb.toString());
    }
}
