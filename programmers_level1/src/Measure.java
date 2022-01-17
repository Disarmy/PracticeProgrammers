public class Measure {
    public int solution(int n) {
        int answer = 0;

        //약수를 구해서 더하기 약수는 n/2까지만 구해도 전부 구할 수 있음
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                answer += i;
            }
        }

        return answer;
    }
}
