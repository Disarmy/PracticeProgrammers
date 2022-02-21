import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Compression {
    public int[] solution(String msg) {
        List<Integer> answer = new ArrayList<>();

        List<String> lib = new ArrayList<>(List.of("", "A", "B", "C", "D", "E", "F", "G", "H",
                "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"));

        StringBuilder sb;
        int index = 0;

        while (true) {
            sb = new StringBuilder();

            if (msg.length() < 2) {
                sb.append(msg.charAt(index));
                answer.add(lib.indexOf(sb.toString()));
                break;
            }
            //w + c검사
            sb.append(msg.charAt(index++)).append(msg.charAt(index++));
            while (lib.contains(sb.toString())) {
                if (index < msg.length()) {
                    sb.append(msg.charAt(index));
                    index++;
                } else break;
            }

            //출력
            if (index != msg.length()) {
                String w = sb.substring(0, sb.length() - 1);
                answer.add(lib.indexOf(w));
            } else {
                String w = sb.substring(0, sb.length() - 1);
                if (lib.contains(w) && !lib.contains(sb.toString())) {
                    String c = sb.substring(sb.length() - 1);
                    answer.add(lib.indexOf(w));
                    answer.add(lib.indexOf(c));
                } else
                    answer.add(lib.indexOf(sb.toString()));
                break;
            }

            //없는 단어 사전에 등록
            if (!lib.contains(sb.toString()))
                lib.add(sb.toString());

            index--;
        }

        System.out.println(lib);

        return answer.stream().mapToInt(i -> i).toArray();
    }
}
