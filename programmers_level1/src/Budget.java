import java.util.Arrays;

public class Budget {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int sum = 0;
        Arrays.sort(d);

        for (int num : d) {
            sum += num;
            //합계가 예산을 초과했을 때
            if (sum > budget) {
                break;
            }
            answer++;
        }

        return answer;
    }
}
