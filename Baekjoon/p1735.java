package src.Baekjoon;

import java.util.Scanner;

public class p1735 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstSon = sc.nextInt();
        int firstMom = sc.nextInt();
        int secSon = sc.nextInt();
        int secMom = sc.nextInt();

        int min = min(firstMom, secMom);

        int firstSonMultiple = min / firstMom;
        int secSonMultiple = min / secMom;
        int son = (firstSon * firstSonMultiple) + (secSon * secSonMultiple);
        int mom = min;
        int max = max(son, mom);
        son /= max;
        mom /= max;
        System.out.print(son + " " + mom);
    }

    private static int max(int num1, int num2){
        int max = 1;
        for(int i = 1; i <= num1 && i <= num2; i++){
            if(num1 % i == 0 && num2 % i == 0){
                max = i;
            }
        }
        return max;
    }

    private static int min(int num1, int num2){
        return (num1 * num2) / max(num1, num2);
    }
}
