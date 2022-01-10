import java.util.ArrayList;
import java.util.List;

public class NotSameNum {
    public int[] solution(int[] arr) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        int beforeNum = -1;

        //배열의 뒷번호를 체크해서 같은 숫자일 경우 패스하며 list에 추가
        for (int i = 0; i < arr.length; i++) {
            //다른 숫자일 경우 리스트에 추가
            if (beforeNum != arr[i]) {
                list.add(arr[i]);
                beforeNum = arr[i];
            }
        }

        answer = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;

    }
}
