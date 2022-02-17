import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    static List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        backTracking(candidates, target, 0, new ArrayList<>());
        return result;
    }

    public void backTracking(int[] candidates, int target, int index, List<Integer> list) {
        if (target < 0) return;
        else if (target == 0) {
            result.add(new ArrayList<>(list));
            return;
        } else {
            for (int i = index; i < candidates.length; i++) {
                list.add(candidates[i]);
                backTracking(candidates, target - candidates[i], i, list);
                list.remove(list.size() - 1);
            }
        }
    }
}
