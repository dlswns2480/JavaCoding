package src.Level1;

import java.util.Scanner;

public class p1110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String originalNum = sc.next();
        String num = originalNum;
        String space = "";
        int divNum1 = 0;
        String newNum = "";
        int cycle = 1;
        if(Integer.parseInt(num) < 10){
            num = '0' + num;
        }
//        divNum1 = Character.getNumericValue(originalNum.charAt(0)) + Character.getNumericValue(originalNum.charAt(1));
        while(true){


            divNum1 = Character.getNumericValue(num.charAt(0)) + Character.getNumericValue(num.charAt(1));
            String strNum1 = String.valueOf(divNum1);
            newNum = (space + num.charAt(1)) + (space + strNum1.charAt(strNum1.length() - 1));
//            System.out.println(newNum);
            if(Integer.parseInt(originalNum) == Integer.parseInt(newNum)){
                break;
            }
            cycle++;
            num = newNum;
        }
        System.out.print(cycle);

    }
}
