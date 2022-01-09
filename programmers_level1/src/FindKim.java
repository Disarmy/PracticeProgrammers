import java.util.Arrays;

public class FindKim {
    public static void main(String[] args) {
        String[] seoul = {"Jane", "Kim"};
        System.out.println(solution(seoul));

        seoul = new String[]{"Jane", "Park", "Kim", "Hong"};
        System.out.println(solution(seoul));
    }
    public static String solution(String[] seoul) {
        int answer = 0;

        for(String s : seoul){
            if(s.equals("Kim")) {
                break;
            }
            answer++;
        }

        return "김서방은 " + answer + "에 있다";
    }
}
