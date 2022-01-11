public class AddNegativePositiveNum {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;

        //true 일때 + false일때 - 연산 수행
        for (int i = 0; i < absolutes.length; i++) {
            if (signs[i])
                answer += absolutes[i];
            else answer -= absolutes[i];
        }

        return answer;
    }
}
