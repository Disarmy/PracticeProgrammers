public class JadenCase {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder(s);

        boolean first = true;
        for (int i = 0; i < answer.length(); i++) {
            //문자열의 처음
            if (first && answer.charAt(i) != ' ') {
                answer.setCharAt(i, Character.toUpperCase(answer.charAt(i)));
                first = false;
            }
            //공백을 만나면
            else if (answer.charAt(i) == ' ') {
                first = true;
            } else {
                answer.setCharAt(i, Character.toLowerCase(answer.charAt(i)));
            }
        }

        return answer.toString();
    }
}
