package src.Baekjoon;


import java.util.*;

public class p14467 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        Map<Integer, Integer> map = new HashMap<>();
        int cnt = 0;
        for(int i = 0; i < size; i++){
            int num = sc.nextInt();
            int loc = sc.nextInt();
            if(!map.containsKey(num)){
                map.put(num, loc);
                continue;
            }
            else if(map.containsKey(num) && loc != map.get(num)){
                cnt++;
                map.put(num, loc);
            }

        }
        System.out.print(cnt);
    }
}
