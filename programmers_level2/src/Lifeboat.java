import java.util.Arrays;
import java.util.Comparator;

public class Lifeboat {
    public int solution(int[] people, int limit) {
        int answer = 0;

        Integer[] weight = Arrays.stream(people).boxed().toArray(Integer[]::new);

        Arrays.sort(weight, Comparator.reverseOrder());

        int lastIndex = weight.length - 1;

        for (int i = 0; i < weight.length; i++) {
            if (lastIndex >= i) {
                answer++;
            }

            //가장 작은 수 체크
            if (weight[i] + weight[lastIndex] <= limit) {
                lastIndex--;
            }
        }

        return answer;
    }
}
