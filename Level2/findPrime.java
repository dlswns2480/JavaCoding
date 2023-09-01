package src.Level2;
import java.util.*;
public class findPrime {
    ArrayList<String> lst = new ArrayList<>();
    String arr[] = {};
    HashMap<Integer, Integer> map = new HashMap<>();
    ArrayList<Integer> intLst = new ArrayList<>();
    public int solution(String numbers) {
        int answer = 0;
        // System.out.println(Integer.parseInt("01"));
        arr = new String[numbers.length()];
        arr = numbers.split("");

        for(String s : arr){

            lst.add(s);
        }
        for(int i = 0; i < arr.length; i++){
            dfs(intLst, arr[i], i);
        }

        for(int k: intLst){
            System.out.println(k);
            if(k == 0 || k == 1)
                continue;
            if(isPrime(k) == 1){
                // System.out.println(k);
                answer++;
            }
        }

        return answer;
    }

    public void dfs(ArrayList<Integer> intLst, String str, int k){
        if(str.length() > arr.length)
            return;
        if(!intLst.contains(Integer.parseInt(str))){
            intLst.add(Integer.parseInt(str));
        }

        for(int i = 0; i < arr.length; i++){
            if(i == k || map.getOrDefault(i, Integer.MAX_VALUE) == 1){
                continue;
            }
            String temp = arr[i];
            map.put(k, 1);
            dfs(intLst, str + temp, i);
            map.put(k, 0);
        }
    }

    public int isPrime(int num){
        for(int i = 2; i <= num / 2; i++){
            if(num % i == 0)
                return 0;
        }
        return 1;
    }
}
