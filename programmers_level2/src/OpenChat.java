import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class OpenChat {
    public String[] solution(String[] record) {
        HashMap<String, String> users = new LinkedHashMap<>();

        int length = 0;
        //이름 저장
        for (String info : record) {
            String[] str = info.split(" ");
            switch (str[0]) {
                case "Enter":
                    length++;
                case "Change":
                    users.put(str[1], str[2]);
                    break;
                case "Leave":
                    length++;
                    break;
            }
        }

        String[] answer = new String[length];

        int cnt = 0;
        //출력
        for (String info : record) {
            String[] str = info.split(" ");
            switch (str[0]) {
                case "Enter":
                    answer[cnt] = users.get(str[1]) + "님이 들어왔습니다.";
                    cnt++;
                    break;
                case "Leave":
                    answer[cnt] = users.get(str[1]) + "님이 나갔습니다.";
                    cnt++;
                    break;
            }
        }

        return answer;
    }
}
