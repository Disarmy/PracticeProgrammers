import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IntegerDesc {
    public long solution(long n) {
        long answer = 0;
        List<Long> nums = new ArrayList<>();

        while (n > 0) {
            nums.add(n % 10);
            n /= 10;
        }

        Collections.sort(nums);
        int index = 0;

        for (int i = 1; index < nums.size(); i *= 10) {
            answer += nums.get(index) * i;
            index++;
        }

        return answer;
    }
}
