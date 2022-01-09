public class Watermelon {
    public static void main(String[] args) {
        System.out.println(solution(3));
        System.out.println(solution(4));
    }

    public static String solution(int n) {
        StringBuilder answer = new StringBuilder();

        //짝수번 수박을 반복
        for(int i = 0; i < n / 2 ; i++){
            answer.append("수박");
        }
        //홀수일때 수 를 추가
        if(n % 2 != 0){
            answer.append("수");
        }

        return answer.toString();
    }
}
