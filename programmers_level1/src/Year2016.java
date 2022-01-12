public class Year2016 {
    public String solution(int a, int b) {
        //요일 1월1일이 금요일 = 1
        String[] week = {"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED"};
        //1~12월 합산
        int[] days = {0, 31, 60, 91, 121, 152, 182, 213, 244, 274, 305, 335, 361};

        return week[(days[a - 1] + b) % 7];
    }
}
