package src.Level3;

public class IntTriangle {
    public int solution(int[][] triangle) {
        int answer = 0;


        for(int i = triangle.length - 1; i > 0; i--){
            for(int j = 0; j < triangle[i].length - 1; j++){
                int first = triangle[i][j];
                int sec = triangle[i][j + 1];
                if(first >= sec)
                    triangle[i-1][j] += first;
                else
                    triangle[i-1][j] += sec;

                // System.out.println(lst.size());
            }
        }

        // answer = Collections.max(lst);
        return triangle[0][0];
    }
}
