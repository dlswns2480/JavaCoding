package src;

public class Collas {
    public int solution(int num) {
        int answer = 0;
        long number = num;
        for(int i = 0; i < 500; i++){
            if(number % 2 == 0)
            {
                number = number / 2;
            }
            else if(number % 2 != 0)
            {
                number = (number * 3) + 1;
            }

            if(number == 1)
            {
                return i+1;

            }
        }
        return -1;

    }
}
