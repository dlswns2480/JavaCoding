package src.Level2;

import java.util.PriorityQueue;
//Leo는 모든 음식의 스코빌 지수가 K 이상이 될 때까지 반복하여 섞습니다.
//        Leo가 가진 음식의 스코빌 지수를 담은 배열 scoville과 원하는 스코빌 지수 K가 주어질 때, 모든 음식의 스코빌 지수를 K 이상으로 만들기 위해 섞어야 하는 최소 횟수를 return 하도록 solution 함수를 작성해주세요.
//
//        제한 사항
//        scoville의 길이는 2 이상 1,000,000 이하입니다.
//        K는 0 이상 1,000,000,000 이하입니다.
//        scoville의 원소는 각각 0 이상 1,000,000 이하입니다.
//        모든 음식의 스코빌 지수를 K 이상으로 만들 수 없는 경우에는 -1을 return 합니다.
//        입출력 예
//        scoville	K	return
//        [1, 2, 3, 9, 10, 12]	7	2
public class MoreSpicy {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> que = new PriorityQueue<>();
        for(int i = 0; i < scoville.length; i++){
            que.offer(scoville[i]);
        }

        while(que.size() > 1){
            int worst;
            int secWorst;
            int newScore;
            worst = que.poll();
            if(worst >= K)
                break;
            answer++;
            secWorst = que.poll();
            newScore = worst + (2 * secWorst);
            que.offer(newScore);
        }

        if(que.poll() < K)
            return -1;
        return answer;
    }
}
