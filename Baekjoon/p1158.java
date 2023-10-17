package src.Baekjoon;

import java.util.*;

public class p1158 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int k = sc.nextInt();
        List<Integer> lst = new ArrayList<>();
        Queue<Integer> que = new LinkedList<>();
        for(int i = 1; i <= size; i++){
            que.offer(i);
        }
        int cnt = 0;
        while(!que.isEmpty()){
            cnt++;
            if(cnt == k){
                lst.add(que.poll());
                cnt = 0;
            }
            else{
                que.offer(que.poll());
            }
        }
        String s = "";
        if(lst.size() > 1)
            s += "<" + String.valueOf(lst.get(0)) + ", ";
        else
            s += "<" + String.valueOf(lst.get(0));
        for(int i = 1; i < lst.size() - 1; i++){
            s += String.valueOf(lst.get(i)) + ", ";
        }
        if(lst.size() > 1)
            s += lst.get(lst.size() - 1) + ">";
        else s += ">";
        System.out.print(s);
    }
}
