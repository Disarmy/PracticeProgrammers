import java.util.Arrays;

public class MakeMinNum {
    public int solution(int[] A, int[] B) {
        int answer = 0;

        Arrays.sort(A);
        Arrays.sort(B);

        //aList min * bList max
        for (int i = 0; i < A.length; i++) {
            int min = A[i];
            int max = B[B.length - 1 - i];

            answer += min * max;
        }

        return answer;
    }
}
