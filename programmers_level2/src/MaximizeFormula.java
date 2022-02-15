import java.util.ArrayList;
import java.util.List;

public class MaximizeFormula {
    List<Long> num = new ArrayList<>();
    List<Character> exp = new ArrayList<>();
    boolean[] check = new boolean[3];
    char[] prior = {'+', '*', '-'};
    long answer;

    public long solution(String expression) {
        answer = 0;

        String[] numbers = expression.split("[^0-9]");
        String[] express = expression.split("[0-9]+");

        for (String number : numbers) {
            num.add(Long.parseLong(number));
        }
        for (int i = 1; i < express.length; i++) {
            exp.add(express[i].charAt(0));
        }

        dfs(0, new char[3]);

        return answer;
    }

    public Long calc(long a, long b, char op) {
        long result = 0;

        switch (op) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
        }

        return result;
    }

    public void dfs(int count, char[] ops) {
        if (count == 3) {
            List<Long> resultNum = new ArrayList<>(num);
            List<Character> resultOp = new ArrayList<>(exp);

            for (char op : ops) {
                for (int j = 0; j < resultOp.size(); j++) {
                    if (op == resultOp.get(j)) {
                        Long res = calc(resultNum.remove(j), resultNum.remove(j), op);
                        resultNum.add(j, res);
                        resultOp.remove(j);
                        j--;
                    }
                }
            }

            answer = Math.max(answer, Math.abs(resultNum.get(0)));
            return;
        }

        for (int i = 0; i < 3; i++) {
            if (!check[i]) {
                check[i] = true;
                ops[count] = prior[i];
                dfs(count + 1, ops);
                check[i] = false;
            }
        }
    }
}
