package src.Level2;

//주식가격
//        문제 설명
//        초 단위로 기록된 주식가격이 담긴 배열 prices가 매개변수로 주어질 때, 가격이 떨어지지 않은 기간은 몇 초인지를 return 하도록 solution 함수를 완성하세요.
//
//        제한사항
//        prices의 각 가격은 1 이상 10,000 이하인 자연수입니다.
//        prices의 길이는 2 이상 100,000 이하입니다.
//        입출력 예
//        prices	return
//        [1, 2, 3, 2, 3]	[4, 3, 1, 1, 0]
public class StockPrice {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        int cnt = 0;
        for(int i = 0; i < prices.length; i++){
            answer[i] = 0;
            for(int j = i + 1; j < prices.length; j++){
                // System.out.println(prices[i] + " " + prices[j]);
                if(prices[i] > prices[j]){
                    answer[i]++;
                    break;
                }
                // System.out.println("이 반복문 실행");
                answer[i]++;
                // System.out.println(answer[i]);
            }
            // System.out.println(" ");
        }
        return answer;
    }
}
