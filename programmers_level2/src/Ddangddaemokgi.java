public class Ddangddaemokgi {
    public int solution(int[][] land) {
        int answer = 0;

        //이전의 행에서 가장 큰 수를 더함
        for (int i = 1; i < land.length; i++) {
            land[i][0] += Math.max(Math.max(land[i - 1][1], land[i - 1][2]), land[i - 1][3]);
            land[i][1] += Math.max(Math.max(land[i - 1][0], land[i - 1][2]), land[i - 1][3]);
            land[i][2] += Math.max(Math.max(land[i - 1][1], land[i - 1][0]), land[i - 1][3]);
            land[i][3] += Math.max(Math.max(land[i - 1][1], land[i - 1][2]), land[i - 1][0]);
        }

        //가장 마지막 행에서 제일 큰 수를 구함
        for (int max : land[land.length - 1]) {
            answer = Math.max(answer, max);
        }

        return answer;
    }
}
