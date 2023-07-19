package src.Level1;
import java.util.*;
public class Exam {
    public int[] solution(int[] answers) {
        int[] answer = {};
        ArrayList<Integer> result = new ArrayList<>();
        int[] one = {1,2,3,4,5};
        int[] two = {2,1,2,3,2,4,2,5};
        int[] three = {3,3,1,1,2,2,4,4,5,5};
        int[] score = new int[3];
        score[0] = calcul_A(one, answers);
        score[1] = calcul_B(two, answers);
        score[2] = calcul_C(three, answers);
        int max = 0;
        result.add(max);
        for(int i = 0; i < score.length; i++){
            if(max < score[i]){
                result.clear();
                max = score[i];
                result.add(i + 1);
            }
            else if(max == score[i]){
                result.add(i + 1);
            }
        }
        answer = new int[result.size()];
        int k = 0;
        for(int n : result){
            answer[k] = n;
            k++;
        }
        // int max = Collections.max(Arrays.asList(score));
        // answer = Arrays.asList(score).indexOf(max);
        return answer;
    }

    public int calcul_A(int[] arr, int[] answers){
        int score = 0;
        for(int i = 0, j = 0; j < answers.length; i++, j++){
            if(i == arr.length)
                i = 0;
            if(arr[i] == answers[j]){
                score++;
            }
        }
        return score++;
    }
    public int calcul_B(int[] arr, int[] answers){
        int score = 0;
        for(int i = 0, j = 0; j < answers.length; i++, j++){
            if(i == arr.length)
                i = 0;
            if(arr[i] == answers[j]){
                score++;
            }
        }
        return score;
    }
    public int calcul_C(int[] arr, int[] answers){
        int score = 0;
        for(int i = 0, j = 0; j < answers.length; i++, j++){
            if(i == arr.length)
                i = 0;
            if(arr[i] == answers[j]){
                score++;
            }
        }
        return score;
    }
}
