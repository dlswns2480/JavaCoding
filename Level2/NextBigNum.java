package src.Level2;

public class NextBigNum {
    public int solution(int n) {
        int answer = 0;

        String binaryString = Integer.toBinaryString(n);
        int nCount = binaryString.length() - binaryString.replace("1", "").length();
        for(int i = n + 1; i <= 1000000; i++){
            String bin = Integer.toBinaryString(i);
            int iCount = bin.length() - bin.replace("1", "").length();
            if(nCount == iCount){
                answer = i;
                return answer;
            }
        }
        return answer;
    }
}
