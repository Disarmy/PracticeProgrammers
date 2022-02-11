public class Dictionary {
    public int solution(String word) {
        int answer = 0;

        int max = 0;
        for(int i = 1; i <= 5; i++){
            max += Math.pow(5, i);
        }

        //A E I O U
        for(int i = 1; i <= word.length(); i++){
            switch (word.charAt(i - 1)) {
                case 'A' : answer += 1; break;
                case 'E' : answer += ((max / Math.pow(5, i) * 1)) + 1; break;
                case 'I' : answer += ((max / Math.pow(5, i) * 2)) + 1; break;
                case 'O' : answer += ((max / Math.pow(5, i) * 3)) + 1; break;
                case 'U' : answer += ((max / Math.pow(5, i) * 4)) + 1; break;
            }
        }

        return answer;
    }
}
