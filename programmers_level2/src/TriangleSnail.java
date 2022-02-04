public class TriangleSnail {
    public int[] solution(int n) {
        int max = n * (n + 1) / 2;
        int[] answer = new int[max];
        int[][] matrix = new int[n][n];

        int x = -1;
        int y = 0;
        int val = 1;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                //아래
                if (i % 3 == 0) {
                    x++;
                }
                //오른쪽
                else if (i % 3 == 1) {
                    y++;
                }
                //대각선
                else {
                    x--;
                    y--;
                }
                matrix[x][y] = val++;
            }
        }

        int index = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) break;
                answer[index++] = matrix[i][j];
            }
        }

        return answer;
    }
}
