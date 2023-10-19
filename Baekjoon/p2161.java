package src.Baekjoon;

import java.util.*;

public class p2161 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        Queue<Integer> que = new LinkedList<>();
        List<Integer> lst = new ArrayList<>();
        for(int i = 1; i <= size; i++){
            que.offer(i);
        }
        int cnt = 0;
        while (!que.isEmpty()) {
            cnt++;
            if(cnt % 2 != 0){
                lst.add(que.poll());
            }
            else{
                que.offer(que.poll());
            }
        }

        for(int i = 0; i < lst.size() - 1; i++){
            System.out.print(lst.get(i) + " ");
        }
        System.out.print(lst.get(lst.size() - 1));
    }
}
