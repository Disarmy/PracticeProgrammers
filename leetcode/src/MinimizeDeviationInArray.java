import java.util.Collections;
import java.util.PriorityQueue;

public class MinimizeDeviationInArray {
    public int minimumDeviation(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        int min = Integer.MAX_VALUE;

        for (int n : nums) {
            //홀수 -> 짝수로
            if (n % 2 == 1) n *= 2;

            min = Math.min(n, min);
            pq.add(n);
        }

        int diff = Integer.MAX_VALUE;

        //짝수는 작아질때까지 나눔
        while (pq.peek() % 2 == 0) {
            int max = pq.remove();
            diff = Math.min(diff, max - min);

            min = Math.min(min, max / 2);

            pq.add(max / 2);
        }


        return Math.min(diff, pq.peek() - min);
    }
}
