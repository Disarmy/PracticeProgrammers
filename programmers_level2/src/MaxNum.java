import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaxNum {
    public String solution(int[] numbers) {
        String answer = "";

        List<String> str = new ArrayList<>();

        for (int number : numbers) {
            str.add(String.valueOf(number));
        }

        Collections.sort(str, (a, b) -> (b + a).compareTo(a + b));

        if (str.get(0).startsWith("0"))
            return "0";

        for (int i = 0; i < str.size(); i++) {
            answer += str.get(i);
        }

        return answer;
    }
}
