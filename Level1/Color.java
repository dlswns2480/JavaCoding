package src.Level1;
//덧칠하기
//        문제 설명
//        어느 학교에 페인트가 칠해진 길이가 n미터인 벽이 있습니다. 벽에 동아리 · 학회 홍보나 회사 채용 공고 포스터 등을 게시하기 위해 테이프로 붙였다가 철거할 때 떼는 일이 많고 그 과정에서 페인트가 벗겨지곤 합니다. 페인트가 벗겨진 벽이 보기 흉해져 학교는 벽에 페인트를 덧칠하기로 했습니다.
//
//        넓은 벽 전체에 페인트를 새로 칠하는 대신, 구역을 나누어 일부만 페인트를 새로 칠 함으로써 예산을 아끼려 합니다. 이를 위해 벽을 1미터 길이의 구역 n개로 나누고, 각 구역에 왼쪽부터 순서대로 1번부터 n번까지 번호를 붙였습니다. 그리고 페인트를 다시 칠해야 할 구역들을 정했습니다.
//
//        벽에 페인트를 칠하는 롤러의 길이는 m미터이고, 롤러로 벽에 페인트를 한 번 칠하는 규칙은 다음과 같습니다.
//
//        롤러가 벽에서 벗어나면 안 됩니다.
//        구역의 일부분만 포함되도록 칠하면 안 됩니다.
public class Color {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int i = 1;
        int first = section[0] + m - 1;
        answer++;
        while(i < section.length){
            // System.out.println(first);

            if(first >= section[i]){


            }
            else{
                first = section[i] + m - 1;
                answer++;

            }
            i++;
            if(first >= section[section.length - 1])
                break;
        }
        return answer;
    }
}
