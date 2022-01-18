import java.util.*;

public class FunctionDevelop {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> answer = new ArrayList<>();
        Queue<Integer> periods = new LinkedList<>();
        int cnt = 0;

        //걸리는 개발완료일 계산해서 큐에 넣기
        for(int i = 0; i < progresses.length; i++){
            if((100 - progresses[i]) % speeds[i] == 0)
                periods.offer((100 - progresses[i]) / speeds[i]);
            else
                periods.offer((100 - progresses[i]) / speeds[i] + 1);
        }

        //큐가 차있으면
        while (!periods.isEmpty()){
            //가장 앞의 숫자 빼서 비교
            int period = periods.poll();
            cnt = 1;

            //가장 우선인 기능의 개발완료일이 다음 개발보다 느리다면(크다면)
            while (!periods.isEmpty() && period >= periods.peek()){
                periods.poll();
                cnt++;
            }

            answer.add(cnt);
        }

        return answer.stream().mapToInt(i -> i).toArray();
    }
}
