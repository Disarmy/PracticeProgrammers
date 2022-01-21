import java.util.Comparator;
import java.util.PriorityQueue;

public class Printer {

    public int solution(int[] priorities, int location) {
        int answer = 0;

        PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());

        //우선순위 큐에 넣으면서 정렬
        for (int i : priorities) {
            queue.offer(i);
        }

        while (!queue.isEmpty()) {
            //프린터의 중요도를 돌면서
            for (int i = 0; i < priorities.length; i++) {
                //큐의 가장앞에 있는 중요도와 같으면
                if (priorities[i] == queue.peek()) {
                    if (location == i) {
                        answer++;
                        return answer;
                    }
                }
                answer++;
                queue.poll();
            }
        }

        return answer;
    }
}
