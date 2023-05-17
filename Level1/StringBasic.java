package src.Level1;

public class StringBasic {
    public boolean solution(String s) {
        int num;
        try
        {
            num = Integer.parseInt(s);
            if(s.length() == 4 || s.length() == 6)
            {
                return true;
            }
            else{
                return false;
            }
        }
        catch(Exception e)
        {
            return false;
        }
    }
}
