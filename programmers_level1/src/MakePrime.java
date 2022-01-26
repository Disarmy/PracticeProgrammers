import java.util.ArrayList;
import java.util.List;

public class MakePrime {
    public int solution(int[] nums) {
        int answer = 0;
        List<Integer> sums = new ArrayList<>();

        //3개의 합을 리스트에 추가
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    sums.add(nums[i] + nums[j] + nums[k]);
                }
            }
        }

        answer = sums.size();

        //List 순회하며 소수판정
        for (int i = 0; i < sums.size(); i++) {
            for (int j = 2; j <= Math.sqrt(sums.get(i)); j++) {
                if (sums.get(i) % j == 0) {
                    answer--;
                    break;
                }
            }
        }

        return answer;
    }
}
