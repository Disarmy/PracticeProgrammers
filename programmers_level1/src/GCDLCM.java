public class GCDLCM {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];

        answer[0] = GCD(n, m);
        answer[1] = LCM(n, m);

        return answer;
    }

    public int GCD(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    public int LCM(int a, int b) {
        return a * b / GCD(a, b);
    }
}
