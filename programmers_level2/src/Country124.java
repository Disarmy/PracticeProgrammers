public class Country124 {
    public String solution(int n) {
        StringBuilder answer = new StringBuilder();

        //n % 3
        String[] num124 = {"4", "1", "2"};
        int num = n;

        while (num != 0) {
            answer.insert(0, num124[num % 3]);
            if(num % 3 == 0)
                num--;
            num /= 3;
        }

        return answer.toString();
    }
}
