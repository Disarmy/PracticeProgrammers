import java.util.Stack;

public class MakeBigNum {
    public String solution(String number, int k) {
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        int count = 0;

        for (int i = 0; i < number.length(); i++) {
            char c = number.charAt(i);

            if (!stack.isEmpty()) {
                while (count < k) {
                    //스택의 peek가 더 작으면
                    if (!stack.isEmpty() && stack.peek() < c) {
                        stack.pop();
                        count++;
                    } else break;
                }
                stack.push(c);
            } else
                stack.push(c);

        }

        //987654321같이 큰수->작은수로 전부 되어있을 경우
        if (count == 0) {
            for (int i = 0; i < k; i++) {
                stack.pop();
            }
        }

        for (int i = 0; i < stack.size(); i++) {
            sb.append(stack.get(i));
        }

        return sb.toString();
    }
}
