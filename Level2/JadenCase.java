package src.Level2;

import java.util.StringTokenizer;

public class JadenCase {


        public String solution(String s){
            StringTokenizer st = new StringTokenizer(s, " ", true);
            StringBuilder sb = new StringBuilder();
            int uppercase = 'A' - 'a';
            while (st.hasMoreTokens()) {
                String str = st.nextToken();
                if (str.equals(" ")) {
                    sb.append(" ");
                    continue;
                }
                char c = str.charAt(0);
                if (c >= 'a' && c <= 'z') {
                    sb.append((char) (c + uppercase));
                } else
                    sb.append(c);
                str = str.toLowerCase();
                for (int j = 1; j < str.length(); j++) {
                    sb.append(str.charAt(j));
                }
            }
            String answer = sb.toString();
            return answer;

        }
}
