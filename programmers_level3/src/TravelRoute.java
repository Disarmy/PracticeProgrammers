import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TravelRoute {
    boolean[] visited;
    List<String> route;

    public String[] solution(String[][] tickets) {
        String[] answer;
        visited = new boolean[tickets.length];
        route = new ArrayList<>();

        dfs("ICN", "ICN", tickets, 0);
        Collections.sort(route);

        answer = route.get(0).split(" ");

        return answer;
    }

    public void dfs(String start, String path, String[][] tickets, int count) {
        //마지막루트
        if (count == tickets.length) {
            route.add(path);
            return;
        }
        for (int i = 0; i < tickets.length; i++) {
            //안와봤고 start가 동일하면
            if (!visited[i] && start.equals(tickets[i][0])) {
                visited[i] = true;
                dfs(tickets[i][1], path + " " + tickets[i][1], tickets, count + 1);
                visited[i] = false;
            }
        }
    }
}
