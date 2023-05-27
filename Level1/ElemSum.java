package src.Level1;

import java.util.stream.Stream;

public class ElemSum {
    public int solution(int n) {
        int answer = 0;

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        //System.out.println("Hello Java");
        int[] arrNum = Stream.of(String.valueOf(n).split("")).mapToInt(Integer::parseInt).toArray();
        for(int num : arrNum){
            answer += num;
        }
        return answer;
    }
}
