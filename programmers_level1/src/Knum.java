import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Knum {
    public static int[] solution(int[] array, int[][] commands) {
    int[] answer = new int[commands.length];

    ArrayList<Integer> list = (ArrayList<Integer>) Arrays.stream(array).boxed().collect(Collectors.toList());

    List<Integer> sub = new ArrayList<>();


    for(int i = 0; i < commands.length; i++){
        int first = commands[i][0] -1;
        int last = commands[i][1];
        
        for(int j = first; j < last; j++){
            sub.add(list.get(j));
        }
        sub.sort(null);

        answer[i] = sub.get(commands[i][2]-1);
        sub.clear();
    }

    return answer;
    }
}
