public class SquareRoot {
    public long solution(long n) {
        long answer = (long) Math.sqrt(n);
        return answer * answer == n ? (answer + 1) * (answer + 1) : -1;
    }
}
