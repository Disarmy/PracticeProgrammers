public class MiddleLetter {
    public String solution(String s) {
        String answer = "";

        //짝수일경우 중앙의 두글자만
        if (s.length() % 2 == 0) {
            answer = s.substring(s.length() / 2 - 1, s.length() / 2 + 1);
        }
        //홀수일경우 가운데 글자만
        else {
            answer += s.charAt(s.length() / 2);
        }

        return answer;
    }
}
