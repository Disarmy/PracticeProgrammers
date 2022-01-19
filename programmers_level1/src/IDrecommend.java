import java.util.Locale;

public class IDrecommend {
    public String solution(String new_id) {
        String newID;
        //1단계 모든 대문자를 대응되는 소문자로 치환합니다.
        newID = new_id.toLowerCase(Locale.ROOT);

        //2단계 알파벳 소문자, 숫자, - , _ , . 를 제외한 모든 문자 제거
        newID = newID.replaceAll("[^a-z\\d\\-_.]*", "");

        //3단계 마침표가 2번이상 연속된 부분을 하나의 마침표로 치환
        newID = newID.replaceAll("[.]{2,}", ".");

        //4단계 마침표가 처음이나 끝에 위치한다면 제거
        newID = newID.replaceAll("^[.]|[.]$", "");

        //5단계 빈문자열이라면 a를 대입합니다.
        if (newID.isEmpty()) newID = "a";

        //6단계 길이가 16자 이상이라면 첫 15문자를 제외한 나머지 문자들을 제거
        if (newID.length() >= 16)
            newID = newID.substring(0, 15);

        //제거 후 마침표가 문자열의 마지막이라면 제거
        newID = newID.replaceAll("[.]$", "");

        //7단계 길이가 2자 이하라면 문자열의 마지막 문자를 길이가 3이될때까지 추가
        StringBuilder sb = new StringBuilder(newID);
        while (sb.length() <= 2) {
            sb.append(sb.charAt(sb.length() - 1));
        }

        return sb.toString();
    }
}
