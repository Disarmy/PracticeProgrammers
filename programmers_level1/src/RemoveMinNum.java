import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveMinNum {
    public int[] solution(int[] arr) {
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());

        //list의 가장 작은 값 삭제
        list.remove(Collections.min(list));

        return list.isEmpty() ? new int[]{-1} : list.stream().mapToInt(i -> i).toArray();
    }
}
