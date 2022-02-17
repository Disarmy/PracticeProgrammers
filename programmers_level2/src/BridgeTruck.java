import java.util.LinkedList;
import java.util.Queue;

public class BridgeTruck {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        int[] trucks = new int[truck_weights.length];

        Queue<Integer> queue = new LinkedList<>();

        int onBridge = 0;

        for (int truck_weight : truck_weights) {
            while (true) {
                //다리를 건너는 트럭이 없으면
                if (queue.isEmpty()) {
                    queue.offer(truck_weight);
                    onBridge += truck_weight;
                    answer++;
                    break;
                }
                //다리를 건너는 트럭이 다 차있으면
                else if (queue.size() == bridge_length) {
                    onBridge -= queue.poll();
                }
                //새 트럭을 다리에 올리기
                else {
                    if (onBridge + truck_weight <= weight) {
                        queue.offer(truck_weight);
                        onBridge += truck_weight;
                        answer++;
                        break;
                    } else {
                        queue.offer(0);
                        answer++;
                    }
                }
            }
        }

        return answer + bridge_length;
    }
}
