package src.Level1;

import java.util.ArrayList;
import java.util.Scanner;

public class p2941 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("c=");
        list.add("c-");
        list.add("dz=");
        list.add("d-");
        list.add("lj");
        list.add("nj");
        list.add("s=");
        list.add("z=");
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        String alpha = sc.next();
        for(int i = 0; i < list.size(); i++){
            if(alpha.contains(list.get(i))){
                alpha = alpha.replace(list.get(i), "x");
            }
        }
//        for(int i = 0; i < list.size(); i++){
//           alpha = alpha.replace(list.get(i), "");
//        }
        sum += alpha.length();
//        System.out.println(alpha);
        System.out.print(sum);
    }
}
