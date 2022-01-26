public class Carpet {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int area = brown + yellow;

        for (int i = 3; i < area; i++) {
            //가로
            int w = i;
            //세로
            int h = area / w;

            //세로길이가 가로길이보다 크면
            if (h > w || area % w != 0) {
                continue;
            }

            if ((w - 2) * (h - 2) == yellow) {
                answer[0] = w;
                answer[1] = h;
                return answer;
            }
        }

        return answer;
    }
}
