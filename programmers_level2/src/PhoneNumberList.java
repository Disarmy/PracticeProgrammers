import java.util.Arrays;

public class PhoneNumberList {
    public boolean solution(String[] phone_book) {
        boolean answer = true;

        Arrays.sort(phone_book);

        for (int i = 0; i < phone_book.length - 1; i++) {
            int len = phone_book[i].length();
            if (phone_book[i + 1].length() < len) continue;
            String sub = phone_book[i + 1].substring(0, len);
            if (sub.equals(phone_book[i])) {
                answer = false;
                break;
            }
        }

        return answer;
    }
}
