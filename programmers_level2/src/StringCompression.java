public class StringCompression {
    public int solution(String s) {
        int answer = s.length();

        for (int i = 1; i <= s.length() / 2; i++) {
            int count = 1;
            //자를 갯수
            String prev = s.substring(0, i);
            StringBuilder result = new StringBuilder();

            for (int j = i; j <= s.length(); j += i) {
                String now = s.substring(j, Math.min(j + i, s.length()));

                if(prev.equals(now)){
                    count++;
                }
                else {
                    result.append(count != 1 ? count : "").append(prev);
                    prev = now;
                    count = 1;
                }
            }

            result.append(prev);
            answer = Math.min(answer, result.length());
        }


        return answer;
    }
}
