public class AddDigits {
    public int solution(int n) {
        int answer = 0;

        while (n > 0) {
            int num = n % 10;
            answer += num;
            n /= 10;
        }

        return answer;
    }
}
