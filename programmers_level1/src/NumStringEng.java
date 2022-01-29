import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumStringEng {
    public int solution(String s) {
        StringBuilder answer = new StringBuilder();
        StringBuilder sb = new StringBuilder();
        List<String> numList = new ArrayList<>(Arrays.asList("zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"));

        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                answer.append(s.charAt(i));
            } else
                sb.append(s.charAt(i));
            if (numList.contains(sb.toString())) {
                int num = numList.indexOf(sb.toString());
                answer.append(num);
                sb = new StringBuilder();
            }
        }

        //replaceAll(alpha[i], ""+i);

        return Integer.parseInt(answer.toString());
    }
}
