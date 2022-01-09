import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Pokemon {
    public static int solution(int[] nums) {
        List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());
        List<Integer> distinct = list.stream().distinct().collect(Collectors.toList());

        return distinct.size() > nums.length/2 ? nums.length/2 : distinct.size();
    }
}
