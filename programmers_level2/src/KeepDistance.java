import java.util.LinkedList;
import java.util.Queue;

public class KeepDistance {
    public int[] solution(String[][] places) {
        int[] answer = new int[5];

        for (int i = 0; i < places.length; i++) {
            boolean keep = true;
            String[] place = places[i];
            for (int j = 0; j < place.length; j++) {
                for (int k = 0; k < place[j].length(); k++) {
                    //P발견시 bfs탐색
                    if (place[j].charAt(k) == 'P') {
                        if (!bfs(place, j, k)) {
                            keep = false;
                            break;
                        }
                    }
                }
            }
            answer[i] = keep ? 1 : 0;
        }

        return answer;
    }

    public boolean bfs(String[] place, int x, int y) {
        Queue<Node> queue = new LinkedList<>();
        boolean[][] visit = new boolean[place.length][place.length];
        queue.offer(new Node(x, y));
        visit[x][y] = true;

        int[] dx = {0, 1, 0, -1};
        int[] dy = {-1, 0, 1, 0};

        while (!queue.isEmpty()) {
            Node cur = queue.poll();

            for (int i = 0; i < 4; i++) {
                int nx = cur.x + dx[i];
                int ny = cur.y + dy[i];
                int manhattan = Math.abs(x - nx) + Math.abs(y - ny);

                if (nx < 0 || ny < 0 || nx >= place.length || ny >= place.length) continue;
                if (visit[nx][ny] || manhattan > 2) continue;

                visit[nx][ny] = true;
                //파티션이면 체크안함
                if (place[nx].charAt(ny) == 'X') continue;
                //사람을 만나면 false
                else if (place[nx].charAt(ny) == 'P') return false;
                else queue.offer(new Node(nx, ny));
            }

        }
        return true;
    }

    public class Node {
        int x;
        int y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

}
