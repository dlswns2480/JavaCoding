package src.Level2;

public class n2array {
    public int[] solution(int n, long left, long right) {
        int size = (int)(right - left);
        int[] subanswer = new int[size + 1];

        int cnt = 0;
        for(long i = left; i < right + 1; i++){
            int mok = (int)(i / n);
            int rest = (int)(i % n);
            subanswer[cnt] = Math.max(mok + 1, rest + 1);
            cnt++;
        }

        return subanswer;
    }
}
