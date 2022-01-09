import java.util.*;
import java.util.stream.Collectors;

public class Marathon {
    public static String solution(String[] participant, String[] completion) {
        String answer = "";
        List<String> par = Arrays.asList(participant).stream().sorted().collect(Collectors.toList());
        List<String> com = Arrays.asList(completion).stream().sorted().collect(Collectors.toList());

        int i;

        for(i = 0; i < com.size() ; i++){
            if(!com.get(i).equals(par.get(i))) {
                break;
            }
        }

        answer = par.get(i);

        return answer;
    }
}
