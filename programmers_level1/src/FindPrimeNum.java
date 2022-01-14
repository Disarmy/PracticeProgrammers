import java.util.Arrays;

public class FindPrimeNum {
    public int solution(int n) {
        int answer = 0;
        //소수면 1 아니면 0
        int[] primes = new int[n + 1];
        Arrays.fill(primes, 1);

        if (n >= 2) {
            primes[0] = 0;
            primes[1] = 0;
        }

        for (int i = 2; i < Math.sqrt(n); i++) {
            if (primes[i] == 0)
                continue;

            for (int j = i * i; j <= n; j += i) {
                primes[j] = 0;
            }
        }

        for (int i = 0; i < primes.length; i++) {
            if (primes[i] != 0)
                answer++;
        }

        return answer;
    }
}
