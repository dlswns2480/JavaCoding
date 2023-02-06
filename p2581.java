package src;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class p2581 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = num1; i <= num2; i++){
            list.add(i);
        }

        for (int i = num1; i <= num2; i++) {
            if(i == 0 || i == 1){
                list.remove(Integer.valueOf(i));
                continue;
            }
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    list.remove(Integer.valueOf(i));
                    break;
                }
            }
        }


//        System.out.println(list.toArray().length);
        int sum = 0;
        for(int n : list){
           sum += n;
        }

        if(list.size() == 0){
            System.out.print(-1);
        }
        else{
            System.out.println(sum);
            System.out.print(Collections.min(list));
        }
//        try{
//            System.out.println(sum);
//            System.out.print(Collections.min(list));
//        }catch(Exception e){
//            System.out.print(-1);
//        }
    }
}
