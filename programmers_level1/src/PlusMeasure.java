public class PlusMeasure {
    public int solution(int left, int right) {
        int answer = 0;

        for(int i = left ; i <= right; i++){
            answer += measureCheck(i);
        }

        return answer;
    }

    public int measureCheck(int num){
        //자기 자신 포함
        int count = 1;

        for(int i = 1; i <= num/2; i++){
            if(num % i == 0)
                count++;
        }

        return count % 2 == 0 ? num : -num;
    }
}
