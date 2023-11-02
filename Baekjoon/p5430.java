package src.Baekjoon;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class p5430 {
    static List<String> lst = new ArrayList<>();
    static String answer = "";

    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        StringBuilder result = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());

        for (int k = 0; k < size; k++) {
            sb.setLength(0);
            answer = "";
            boolean reverse = false;
            String func = br.readLine();
            int arrSize = Integer.parseInt(br.readLine());
            String s = br.readLine().replaceAll("[\\[\\]]", "");
            String[] input = s.split(",");

            if (input[0].equals("") && func.contains("D")) {
                answer = "error";
                result.append(answer);
                result.append("\n");
                break;
            }
            Deque<String> deque = new ArrayDeque<>(Arrays.asList(input));

//            for(String str : deque){
//                System.out.print(str + " " );
//            }
            for(int i = 0; i < func.length(); i++){
                if(func.charAt(i) == 'R'){
                    reverse = !reverse;
                }
                else if (func.charAt(i) == 'D') {
                    if(deque.isEmpty()){
                        answer = "error";
                        result.append(answer);
                        result.append("\n");
                        lst.add(answer);
                        break;
                    }
                    else if (reverse == true) {
                        deque.pollLast();
                    }
                    else if(reverse == false){
                        deque.pollFirst();
                    }
                }
            }
            if(answer.equals("error")){
                continue;
            }
//            System.out.println("deque size : " + deque.size());
            int dequeSize = deque.size();
            sb.append("[");
            for(int j = 0; j < dequeSize; j++){
                if(reverse == true){
                    sb.append(deque.pollLast()).append(",");
                }
                else{
                    sb.append(deque.pollFirst()).append(",");
                }
            }
            sb.append("]");
            sb.deleteCharAt(sb.length() - 2);
            result.append(sb.toString());
            result.append("\n");
        }
//        for (int i = 0; i < lst.size() - 1; i++) {
//            System.out.println(lst.get(i));
//        }
//        System.out.print(lst.get(lst.size()- 1));
        result.deleteCharAt(result.length() - 1);
        System.out.print(result.toString());
    }
}