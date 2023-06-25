package src.Level1;

import java.util.LinkedList;
import java.util.Queue;
//문제 설명
//        자연수 n이 매개변수로 주어집니다. n을 3진법 상에서 앞뒤로 뒤집은 후, 이를 다시 10진법으로 표현한 수를 return 하도록 solution 함수를 완성해주세요.
//
//        제한사항
//        n은 1 이상 100,000,000 이하인 자연수입니다.
//입출력 예
//        n	result
//        45	7
//        125	229

public class TernaryBase {
    public int solution(int n) {
        int answer = 0;
        Queue<String> result = new LinkedList<>();
        String s = "";
        for(int i = n; i >= 1; i/=3){
            String namerge = String.valueOf(i % 3);
            result.offer(namerge);
            // System.out.println();
        }
        int cnt = result.size() - 1;
        while(!result.isEmpty()){
            // s += result.poll();
            int multi = Integer.parseInt(result.poll());
            answer += (Math.pow(3, cnt)) * multi;
            cnt--;
        }
        for(int i = 0; i < s.length(); i++){

        }
        System.out.println(s);
        return answer;
    }
}
