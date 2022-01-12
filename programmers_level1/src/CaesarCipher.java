public class CaesarCipher {
    public String solution(String s, int n) {
        String answer = s;
        int[] tmp = new int[answer.length()];
        StringBuffer sb = new StringBuffer("");

        for(int i = 0 ; i < answer.length(); i++){
            //대문자의 경우
            if(65 <= answer.charAt(i) && answer.charAt(i) < 90){
                tmp[i] = answer.charAt(i) + n;
                //알파벳 ASCII를 초과할때
                if(tmp[i] > 90)
                    tmp[i] -= 26;
            }
            //소문자의 경우
            else if(97 <= answer.charAt(i) && answer.charAt(i) < 122){
                tmp[i] = answer.charAt(i) + n;
                //알파벳 ASCII를 초과할때
                if(tmp[i] > 122)
                    tmp[i] -= 26;
            }
            //'z', 'Z'의 경우
            else if(answer.charAt(i) == 90 || answer.charAt(i) == 122){
                tmp[i] = answer.charAt(i) + n - 26;
            }
            else{
                tmp[i] = answer.charAt(i);
            }
        }

        //int > String
        for(int i = 0; i < tmp.length; i++){
            sb.append((char)tmp[i]);
        }

        return sb.toString();
    }
}
