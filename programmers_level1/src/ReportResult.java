import java.util.*;

public class ReportResult {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new String[]{"muzi", "frodo", "apeach", "neo"},
                new String[]{"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"}, 2)));
        System.out.println(Arrays.toString(solution(new String[]{"con", "ryan"},
                new String[]{"ryan con", "ryan con", "ryan con", "ryan con"}, 3)));
    }
    public static int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];

        String[] splitID = new String[2];

        //내가 누구를 신고했는가
        Map<String, List<String>> reports = new HashMap<>();
        //몇회 신고되었는가
        Map<String, Integer> reportedCount = new HashMap<>();

        //맵에 신고자 이름담기
        for(String id : id_list){
            reports.put(id, new ArrayList<>());
            reportedCount.put(id, 0);
        }
        //신고자가 누구를 신고했는지 담기
        for(String r : report){
            //0 신고자 1 당한사람
            splitID = r.split(" ");
            List<String> list = reports.get(splitID[0]);
            if(!list.contains(splitID[1])){
                list.add(splitID[1]);
                reportedCount.put(splitID[1], reportedCount.get(splitID[1]) + 1);
            }
        }

        //신고횟수가 k 이상이면
        for (String id : id_list) {
            if (reportedCount.get(id) >= k) {
                //id map 순회하며 신고했는지 확인
                for (int j = 0; j < id_list.length; j++) {
                    if (reports.get(id_list[j]).contains(id)) {
                        answer[j]++;
                    }
                }
            }
        }

        return answer;
    }
}
