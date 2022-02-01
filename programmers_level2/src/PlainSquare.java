public class PlainSquare {
    public long solution(int w, int h) {
        return (long) w * h - (w + h - gcd(w, h));
    }

    public int gcd(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
}
