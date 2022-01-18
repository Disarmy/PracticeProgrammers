public class LeastRectangle {
    public int solution(int[][] sizes) {
        int width = 0, height = 0;
        int max, min;

        for (int i = 0; i < sizes.length; i++) {
            //긴방향을 가로로 전부 정렬해서 계산
            max = Math.max(sizes[i][0], sizes[i][1]);
            min = Math.min(sizes[i][0], sizes[i][1]);

            width = Math.max(width, max);
            height = Math.max(height, min);
        }

        return width * height;
    }
}
