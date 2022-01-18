import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DivisorArr {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> answer = new ArrayList<>();

        for (int num : arr) {
            if (num % divisor == 0) {
                answer.add(num);
            }
        }

        //나눠지지 않으면 -1 리턴
        if (answer.size() == 0) {
            return new int[]{-1};
        }

        //오름차순 정렬
        Collections.sort(answer);

        return answer.stream().mapToInt(i -> i).toArray();
    }
}
