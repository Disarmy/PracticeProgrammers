public class NextBigNum {
    public int solution(int n) {
        int answer = n;
        int count = binary(n);

        //1씩 더해가면서 체크
        while (true) {
            answer += 1;
            if (count == binary(answer))
                break;
        }

        return answer;
    }

    //이진법 숫자 내의 1의 갯수를 리턴하는 함수
    public int binary(int n) {
        String str = Integer.toBinaryString(n);
        int num = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '1')
                num++;
        }

        return num;
    }
}
