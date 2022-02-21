import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> m : map.entrySet()) {
            if (m.getValue() > nums.length / 2) {
                answer = m.getKey();
                break;
            }
        }

        return answer;
    }
}
