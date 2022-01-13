public class Skilltree {
    public static int solution(String skill, String[] skill_trees) {
        int answer = skill_trees.length;

        //기존 이중 for문 내의 if문으로 조건들을 전부 검사했으나
        //검색해서 정규표현식으로 해결할 수 있다해서 공부 후 해결

        for (int i = 0; i < skill_trees.length; i++) {
            //skill_trees에서 skill에든 문자열을 빼고 전부 제거 후 skill과 비교
            if (skill.indexOf(skill_trees[i].replaceAll("[^" + skill + "^]", "")) != 0) {
                answer--;
            }
        }

        return answer;
    }
}
