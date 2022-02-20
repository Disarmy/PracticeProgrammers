public class Friends4Block {
    public int solution(int m, int n, String[] board) {
        int answer = 0;

        char[][] map = new char[m][n];
        for (int i = 0; i < m; i++) {
            map[i] = board[i].toCharArray();
        }

        while (true) {
            int cnt = blockCheck(m, n, map);
            if (cnt == 0) break;

            removeBlock(m, n, map);

            answer += cnt;
        }

        return answer;
    }

    //인접블록 계산
    public static int blockCheck(int m, int n, char[][] map) {
        int count = 0;
        boolean[][] checked = new boolean[m][n];

        for (int i = 0; i < m - 1; i++) {
            for (int j = 0; j < n - 1; j++) {
                char c = map[i][j];
                if (c == '.') continue;
                checkFour(c, i, j, map, checked);
            }
        }


        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (checked[i][j]) {
                    count++;
                    map[i][j] = '.';
                }
            }
        }

        return count;
    }

    //4개블록 계산
    public static void checkFour(char c, int m, int n, char[][] map, boolean[][] checked) {
        for (int i = m; i < m + 2; i++) {
            for (int j = n; j < n + 2; j++) {
                //실패하면 탈출
                if (map[i][j] != c) return;
            }
        }

        //성공했으면
        for (int i = m; i < m + 2; i++) {
            for (int j = n; j < n + 2; j++) {
                checked[i][j] = true;
            }
        }
    }

    //블록 삭제
    public static void removeBlock(int m, int n, char[][] map) {
        for (int i = m - 1; i >= 0; i--) {
            for (int j = 0; j < n; j++) {
                // '.' 일경우 한칸씩 내리기
                if (map[i][j] == '.') {
                    //연속된 빈칸 한번에 내리기
                    for (int ni = i - 1; ni >= 0; ni--) {
                        if (map[ni][j] != '.') {
                            map[i][j] = map[ni][j];
                            map[ni][j] = '.';
                            break;
                        }
                    }
                }
            }
        }
    }
}
