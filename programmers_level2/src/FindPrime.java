import java.util.HashSet;

public class FindPrime {
    boolean[] used;
    HashSet<Integer> hashSet = new HashSet<>();

    public int solution(String numbers) {
        used = new boolean[numbers.length()];

        backTracking(0, numbers, "");

        return hashSet.size();
    }

    public boolean isPrime(String s) {
        int num = Integer.parseInt(s);
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public void backTracking(int count, String numbers, String cur) {
        if (count == numbers.length()) {
            return;
        }

        for (int i = 0; i < numbers.length(); i++) {
            if (!used[i]) {
                used[i] = true;
                String num = cur + numbers.charAt(i);

                if (isPrime(num)) {
                    hashSet.add(Integer.parseInt(num));
                }

                backTracking(count + 1, numbers, num);
                used[i] = false;
            }
        }
    }
}
