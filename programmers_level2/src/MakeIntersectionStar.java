import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MakeIntersectionStar {
    public String[] solution(int[][] line) {
        String[] answer;
        List<int[]> location = new ArrayList<>();

        int maxX = Integer.MIN_VALUE;
        int minX = Integer.MAX_VALUE;
        int maxY = Integer.MIN_VALUE;
        int minY = Integer.MAX_VALUE;

        //모든 교점의 좌표 구하기
        for (int i = 0; i < line.length; i++) {
            long A = line[i][0];
            long B = line[i][1];
            long E = line[i][2];

            for (int j = i + 1; j < line.length; j++) {
                long C = line[j][0];
                long D = line[j][1];
                long F = line[j][2];

                long adbc = A * D - B * C;
                //평행이 아닐 때
                if (adbc == 0) continue;

                //정수체크
                long bfed = (B * F - E * D);
                long ecaf = (E * C - A * F);

                if (bfed % adbc != 0 || ecaf % adbc != 0) continue;

                int x = (int) (bfed / adbc);
                int y = (int) (ecaf / adbc);

                location.add(new int[]{x, y});

                minX = Math.min(minX, x);
                maxX = Math.max(maxX, x);
                minY = Math.min(minY, y);
                maxY = Math.max(maxY, y);
            }
        }

        long Xsize = (maxX - minX + 1);
        long Ysize = (maxY - minY + 1);

        //격자판 만들기
        StringBuilder grating = new StringBuilder();
        answer = new String[(int) Ysize];

        for (int i = 0; i < Xsize; i++) {
            grating.append('.');
        }

        Arrays.fill(answer, grating.toString());

        //격자판 별 찍기
        for (int[] loc : location) {
            int x = (loc[0] - minX);
            int y = (maxY - loc[1]);

            answer[y] = answer[y].substring(0, x) + "*" + answer[y].substring(x + 1);
        }

        return answer;
    }
}
