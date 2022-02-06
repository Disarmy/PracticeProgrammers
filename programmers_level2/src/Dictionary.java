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
                case 'A' -> answer += 1;
                case 'E' -> answer += ((max / Math.pow(5, i) * 1)) + 1;
                case 'I' -> answer += ((max / Math.pow(5, i) * 2)) + 1;
                case 'O' -> answer += ((max / Math.pow(5, i) * 3)) + 1;
                case 'U' -> answer += ((max / Math.pow(5, i) * 4)) + 1;
            }
        }

        return answer;
    }
}
