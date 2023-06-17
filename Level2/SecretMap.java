package src.Level2;
//문제 설명
//        비밀지도
//        네오는 평소 프로도가 비상금을 숨겨놓는 장소를 알려줄 비밀지도를 손에 넣었다. 그런데 이 비밀지도는 숫자로 암호화되어 있어 위치를 확인하기 위해서는 암호를 해독해야 한다. 다행히 지도 암호를 해독할 방법을 적어놓은 메모도 함께 발견했다.
//
//        1. 지도는 한 변의 길이가 n인 정사각형 배열 형태로, 각 칸은 "공백"(" ") 또는 "벽"("#") 두 종류로 이루어져 있다.
//        2. 전체 지도는 두 장의 지도를 겹쳐서 얻을 수 있다. 각각 "지도 1"과 "지도 2"라고 하자. 지도 1 또는 지도 2 중 어느 하나라도 벽인 부분은 전체 지도에서도 벽이다. 지도 1과 지도 2에서 모두 공백인 부분은 전체 지도에서도 공백이다.
//        3. "지도 1"과 "지도 2"는 각각 정수 배열로 암호화되어 있다.
//        4. 암호화된 배열은 지도의 각 가로줄에서 벽 부분을 1, 공백 부분을 0으로 부호화했을 때 얻어지는 이진수에 해당하는 값의 배열이다.

public class SecretMap {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        String result[] = new String[n];
        for(int i = 0; i < n; i++){

            result[i] = Integer.toBinaryString(arr1[i] | arr2[i]);
            if(result[i].length() < n){
                int plus = n - result[i].length();
                // result[i] = Integer.parseInt(result[i]);
                result[i] = " ".repeat(plus) + result[i];
            }

        }
        // for(int i = 0; i < n; i++){
        //     result[i] = arr1[i] | arr2[i];
        // }
        int cnt = 0;
        for(String num : result){
            answer[cnt] = num;

            // answer[cnt].replace("0", " ");
            // answer[cnt].replace("0", " ");
            cnt++;
        }
        cnt = 0;
        for(String s : answer){
            answer[cnt] = answer[cnt].replaceAll("1", "#").replaceAll("0", " ");
            cnt++;
            System.out.println(s);
        }
        return answer;
    }
}
