import java.util.*;

public class Tuple {
    public int[] solution(String s) {
        //튜플 단위로 쪼갬
        String[] tuple = s.split("},");
        for (int i = 0; i < tuple.length; i++) {
            //괄호 제거
            tuple[i] = tuple[i].replaceAll("[{}]", "");
        }
        //튜플 길이별로
        Arrays.sort(tuple, Comparator.comparingInt(String::length));
        Set<Integer> set = new LinkedHashSet<>();

        for (String tu : tuple) {
            String[] nums = tu.split(",");
            for (String num : nums) {
                set.add(Integer.parseInt(num));
            }
        }

        int[] answer = new int[set.size()];
        int cnt = 0;
        for (int data : set) {
            answer[cnt++] = data;
        }

        return answer;
    }
}
