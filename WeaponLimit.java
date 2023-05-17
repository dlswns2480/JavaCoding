package src;

public class WeaponLimit {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        int cnt = 0;
        int[] result = new int[number];
        for(int j = 0; j < number; j++){
            for(int i = 1; i*i <= j + 1; i++){
                if(i * i == j + 1)
                    cnt++;
                else if((j + 1)% i == 0)
                    cnt+=2;
            }
            result[j] = cnt;
            cnt = 0;

        }

        for(int num : result)
        {
            if(num > limit)
            {
                num = power;
            }
            answer += num;
            System.out.print(num + " ");
        }

        return answer;

    }
}
