package src.Level1;

public class MarkPhoneNum {
    public String solution(String phone_number) {
        String answer = "";
        String a = phone_number.substring(0, phone_number.length() - 4).replaceAll("[0-9]", "*");
        String b = phone_number.substring(phone_number.length()-4);
        answer = a + b;
        return answer;
    }
}
