public class BinaryTransRepeat {
    public int[] solution(String s) {
        int[] answer = new int[2];
        int zeroCount = 0;
        int length = s.length();

        while (length > 1) {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '0') {
                    zeroCount++;
                }
            }
            length -= zeroCount;
            s = Integer.toBinaryString(length);
            length = s.length();

            answer[0] += 1;
            answer[1] += zeroCount;
            zeroCount = 0;
        }


        return answer;
    }
}
