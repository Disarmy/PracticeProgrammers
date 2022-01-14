import java.util.PriorityQueue;

public class Scoville {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        int min, secMin;

        PriorityQueue<Integer> queue = new PriorityQueue<>();

        for (int i : scoville) {
            queue.offer(i);
        }

        while (queue.peek() <= K) {
            if (queue.size() == 1)
                return -1;

            min = queue.poll();
            secMin = queue.poll();

            queue.offer(min + (secMin * 2));

            answer++;
        }

        return answer;
    }
}
