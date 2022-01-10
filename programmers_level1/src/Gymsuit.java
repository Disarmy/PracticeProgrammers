public class Gymsuit {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int[] students = new int[n];

        //학생들은 기본적으로 1벌의 체육복을 소지
        for(int i = 0; i < n ; i++){
            students[i] = 1;
        }
        //Lost 당한 학생들은 체육복 1벌을 뺌
        for(int i = 0; i < lost.length; i++){
            //0~4이기 때문에 번호에서 1빼기
            students[lost[i] - 1] -= 1;
        }

        //reserve 한 학생들은 체육복 1벌을 추가함
        for(int i = 0; i < reserve.length; i++){
            //0~4이기 때문에 번호에서 1빼기
            students[reserve[i] - 1] += 1;
        }

        //학생들 배열을 돌면서 체육복이 2벌이상, 앞뒤학생체크해서 체육복을 나눠줌
        for(int i = 0; i < n ; i++){
            if(students[i] > 1){
                if(i != 0 && students[i-1] == 0){
                    students[i - 1] ++;
                    students[i] --;
                }
                else if(i < n-1 && students[i+1] == 0){
                    students[i + 1 ] ++;
                    students[i] --;
                }
            }
        }
        //체육복을 1개이상 소지한 학생수를 리턴
        for(int i = 0; i < n ; i++){
            if(students[i] > 0){
                answer++;
            }
        }

        return answer;
    }
}
