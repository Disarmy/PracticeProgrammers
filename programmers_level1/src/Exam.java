import java.util.*;

public class Exam {
    public static int[] solution(int[] answers) {
        int[] answer = {};
        int[] supo1 = {1,2,3,4,5};
        int[] supo2 = {2,1,2,3,2,4,2,5};
        int[] supo3 = {3,3,1,1,2,2,4,4,5,5};

        int[] result = {0, 0, 0};

        int max = 0;
        int count = 0;
        int index = 0;

        for(int i = 0; i < answers.length; i++){
            if(answers[i] == supo1[i % supo1.length]){
                result[0]++;
            }
            if(answers[i] == supo2[i % supo2.length]){
                result[1]++;
            }
            if(answers[i] == supo3[i % supo3.length]){
                result[2]++;
            }
        }

        max = Math.max(Math.max(result[0], result[1]), result[2]);

        for(int i = 0; i < result.length; i++){
            if(result[i] == max) count++;
        }

        answer = new int[count];

        for(int i = 0; i < result.length; i++){
            if(result[i] == max){
                answer[index++] = i + 1;
            }
        }

        return answer;
    }
}
