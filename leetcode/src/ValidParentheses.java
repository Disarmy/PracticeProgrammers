import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            //스택이 차있을 경우
            if (!stack.isEmpty()) {
                switch (s.charAt(i)) {
                    case ')':
                        if (stack.peek() == '(')
                            stack.pop();
                        else
                            stack.push(s.charAt(i));
                        break;
                    case ']':
                        if (stack.peek() == '[')
                            stack.pop();
                        else
                            stack.push(s.charAt(i));
                        break;
                    case '}':
                        if (stack.peek() == '{')
                            stack.pop();
                        else
                            stack.push(s.charAt(i));
                        break;
                    default:
                        stack.push(s.charAt(i));
                }
            } else {
                stack.push(s.charAt(i));
            }
        }

        return stack.isEmpty();
    }
}
