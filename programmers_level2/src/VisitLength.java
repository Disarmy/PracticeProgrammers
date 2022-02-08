import java.util.HashSet;

public class VisitLength {
    public int solution(String dirs) {
        HashSet<String> road = new HashSet<>();
        int x = 0;
        int y = 0;

        for (int i = 0; i < dirs.length(); i++) {
            char direction = dirs.charAt(i);
            int nx = x;
            int ny = y;

            switch (direction) {
                case 'U':
                    if (ny + 1 <= 5) {
                        y++;
                    }
                    break;
                case 'D':
                    if (ny - 1 >= -5) {
                        y--;
                    }
                    break;
                case 'L':
                    if (nx - 1 >= -5) {
                        x--;
                    }
                    break;
                case 'R':
                    if (nx + 1 <= 5) {
                        x++;
                    }
                    break;
            }

            //좌표평면에서 벗어났을 때
            if (nx == x && ny == y) continue;

            road.add(x + "" + y + "" + nx + "" + ny);
            road.add(nx + "" + ny + "" + x + "" + y);
        }

        return road.size() / 2;
    }
}
