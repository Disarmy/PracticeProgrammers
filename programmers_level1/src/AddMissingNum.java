public class AddMissingNum {
    public int solution(int[] numbers) {
        //0+1+...+9
        int answer = 45;

        //0~9를 더한 숫자 45에서 배열에 들어있는 숫자들을 뺌
        for (int i = 0; i < numbers.length; i++) {
            answer -= numbers[i];
        }

        return answer;
    }
}
