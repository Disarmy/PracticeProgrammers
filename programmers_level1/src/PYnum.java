import java.util.Locale;

public class PYnum {
    boolean solution(String s) {
        boolean answer = true;
        String str = s.toLowerCase(Locale.ROOT);
        int pNum = 0, yNum = 0;

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == 'p'){
                pNum++;
            }
            else if(str.charAt(i) == 'y'){
                yNum++;
            }
        }

        return pNum == yNum;
    }
}
