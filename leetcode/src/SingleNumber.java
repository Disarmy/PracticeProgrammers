import java.util.ArrayList;
import java.util.List;

public class SingleNumber {
    public int singleNumber(int[] nums) {
        List<Integer> list = new ArrayList<>();

        for (int num : nums) {
            if (!list.contains(num)) {
                list.add(num);
            }
            else{
                list.remove((Object)num);
            }
        }

        return list.get(0);
    }
}
