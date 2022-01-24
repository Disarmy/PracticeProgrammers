import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FailureRate {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        List<Double> failRate = new ArrayList<>();

        //stage
        for (int i = 1; i <= N; i++) {
            //스테이지에 도달한 플레이어
            int player = 0;
            //도달했으나 클리어하지 못한 플레이어
            int nonClear = 0;
            //player
            for (int j = 0; j < stages.length; j++) {
                //스테이지에 도달한 플레이어 체크
                if (i <= stages[j]) {
                    player++;
                    if (i == stages[j]) {
                        nonClear++;
                    }
                }
            }
            //도달한 사람이 없으면 실패율은 0
            if (player == 0) {
                failRate.add(0.0);
            } else {
                failRate.add((double) nonClear / (double) player);
            }
        }

        for (int i = 0; i < N; i++) {
            int index = failRate.indexOf(Collections.max(failRate)) + 1;
            answer[i] = index;
            failRate.set(index - 1, -1.0);
        }

        return answer;
    }
}
