package src;

public class AvergeOfArray {
        public double solution(int[] numbers) {
            double answer = 0;

            return (numbers[0] + numbers[numbers.length - 1]) / 2.0;
        }
}
