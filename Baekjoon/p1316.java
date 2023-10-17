package src.Baekjoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class p1316 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String[] group = new String[size];
        for(int i = 0; i < size; i++){
            group[i] = sc.next();
        }
        int cnt = 0;
        for(int i = 0; i < size; i++){
            List<String> lst = new ArrayList<>();
            boolean check = true;
            lst.add(String.valueOf(group[i].charAt(0)));
            for(int j = 1; j < group[i].length(); j++){
                String ch = String.valueOf(group[i].charAt(j));
                if(ch.equals(lst.get(lst.size() - 1))){
                    continue;
                }
                else if(!lst.contains(ch)){
                    lst.add(ch);
                }
                else if(lst.contains(ch)){
                    check = false;
                    break;
                }
            }
            if(check)
                cnt++;
        }
        System.out.print(cnt);
    }
}
