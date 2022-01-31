public class TernaryFlip {
    public int solution(int n) {
        int answer = 0;
        StringBuilder ternary = new StringBuilder();

        while (n > 0) {
            ternary.insert(0, n % 3);
            n /= 3;
        }

        int three = 1;
        for (int i = 0; i < ternary.length(); i++) {
            answer += Character.getNumericValue(ternary.charAt(i)) * three;
            three *= 3;
        }

        return answer;
    }
}
