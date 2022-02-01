public class Keypad {
    public String solution(int[] numbers, String hand) {
        StringBuilder answer = new StringBuilder();

        //keypad 0~9
        String[] key = new String[]{
                "M",
                "L", "M", "R",
                "L", "M", "R",
                "L", "M", "R"
        };

        //*, #
        int left = 10;
        int right = 12;

        //147 왼손
        //369 오른손
        //2580 가까운쪽 거리가 같다면 자신의 주 손으로
        for (int number : numbers) {
            String k = key[number];
            switch (k) {
                case "L" -> {
                    answer.append("L");
                    left = number;
                }
                case "R" -> {
                    answer.append("R");
                    right = number;
                }
                case "M" -> {
                    int n;
                    if (number == 0) {
                        n = 11;
                    } else {
                        n = number;
                    }
                    int distanceLeft = Math.max(left, n) - Math.min(left, n);
                    int distanceRight = Math.max(right, n) - Math.min(right, n);

                    //키패드 사이의 거리
                    distanceLeft = distanceLeft % 3 + distanceLeft / 3;
                    distanceRight = distanceRight % 3 + distanceRight / 3;
                    if (distanceLeft == distanceRight) {
                        switch (hand) {
                            case "left" -> {
                                answer.append("L");
                                left = n;
                            }
                            case "right" -> {
                                answer.append("R");
                                right = n;
                            }
                        }
                    }
                    //왼손이 더 멀면
                    else if (distanceLeft > distanceRight) {
                        answer.append("R");
                        right = n;
                    } else {
                        answer.append("L");
                        left = n;
                    }
                }
            }
        }

        return answer.toString();
    }
}
