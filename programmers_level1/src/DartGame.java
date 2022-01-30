public class DartGame {
    public int solution(String dartResult) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();
        int[] score = new int[3];
        int count = 0;

        for (int i = 0; i < dartResult.length(); i++) {
            char c = dartResult.charAt(i);
            //숫자일 경우 apppend
            if (Character.isDigit(c)) {
                sb.append(c);
            }
            //보너스 계산
            else if (c == 'S' || c == 'D' || c == 'T') {
                score[count] = Integer.parseInt(sb.toString());
                sb = new StringBuilder();
                switch (c) {
                    case 'D':
                        score[count] = (int) Math.pow(score[count], 2);
                        break;
                    case 'T':
                        score[count] = (int) Math.pow(score[count], 3);
                        break;
                    //with S
                    default:
                        break;
                }
                count++;
            }
            //스타상 아차상 계산
            else if (c == '*' || c == '#') {
                switch (c) {
                    case '*':
                        //첫번째 기회에서 나올 경우
                        if (count == 1) {
                            score[count - 1] *= 2;
                        } else {
                            score[count - 1] *= 2;
                            score[count - 2] *= 2;
                        }
                        break;
                    case '#':
                        score[count - 1] *= -1;
                        break;
                }
            }
        }

        for (int n : score) {
            answer += n;
        }

        return answer;
    }
}
