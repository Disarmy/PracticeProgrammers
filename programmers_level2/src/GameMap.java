import java.util.LinkedList;
import java.util.Queue;

public class GameMap {
    boolean[][] visited;
    int n, m;

    public int solution(int[][] maps) {
        n = maps.length;
        m = maps[0].length;

        visited = new boolean[n][m];
        return bfs(maps, 0, 0);
    }

    public int bfs(int[][] maps, int x, int y) {
        Queue<Node> queue = new LinkedList<>();
        queue.offer(new Node(x, y, 1));
        visited[x][y] = true;

        //상하좌우
        int[] dx = {0, 1, 0, -1};
        int[] dy = {-1, 0, 1, 0};

        while (!queue.isEmpty()) {
            Node cur = queue.poll();

            if (cur.x == n - 1 && cur.y == m - 1) return cur.cost;

            for (int i = 0; i < 4; i++) {
                int nx = cur.x + dx[i];
                int ny = cur.y + dy[i];

                if (nx < 0 || ny < 0 || nx >= n || ny >= m) continue;

                if (maps[nx][ny] == 1 && !visited[nx][ny]) {
                    visited[nx][ny] = true;
                    queue.offer(new Node(nx, ny, cur.cost + 1));
                }
            }
        }

        return -1;
    }

    public class Node {
        int x;
        int y;
        int cost;

        Node(int x, int y, int cost) {
            this.x = x;
            this.y = y;
            this.cost = cost;
        }
    }
}
