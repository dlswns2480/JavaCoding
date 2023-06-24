package src.Level1;

public class PartString {
    public int solution(String t, String p) {
        int answer = 0;
        int prefix = p.length();
        for(int i = 0; i < t.length(); i++){
            if(i == t.length() - prefix + 1)
                break;
            String part = t.substring(i, i + prefix);
            System.out.println(part);
            if(Long.parseLong(part) <= Long.parseLong(p)){
                answer++;
            }

        }
        return answer;
    }
}
