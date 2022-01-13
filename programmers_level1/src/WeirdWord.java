import java.util.Locale;

public class WeirdWord {
    public String solution(String s) {
        //짝수 홀수 판단
        int index = 0;
        StringBuffer sb = new StringBuffer();

        for(int i = 0; i < s.length(); i++){
            //공백일 경우
            if(s.charAt(i) == ' '){
                sb.append(s.charAt(i));
                index = 0;
            }
            //짝수의 경우
            else if(index % 2 == 0){
                sb.append(s.toUpperCase().charAt(i));
                index++;
            }
            //홀수의 경우
            else if(index % 2 != 0){
                sb.append(s.toLowerCase().charAt(i));
                index++;
            }
        }

        return sb.toString();
    }
}
