package programmers_level2;

import java.util.*;

// 스킬트리
// 13시 30분 시작. 14시 8분 중지. 14시 45분 시작. 15시 21분 완료.
// 1. 스킬순서에 포함되는 값들 추출
// 2. 스킬순서와 대조
public class SkillTree {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        for (int i = 0; i < skill_trees.length; i++) {
            String str = "";
            for (int j = 0; j < skill_trees[i].length(); j++) {
                String s = String.valueOf(skill_trees[i].charAt(j));
                if (skill.contains(s)) {
                    str += s;
                }
            }
            boolean check = true;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) != skill.charAt(j)) {
                    check = false;
                    break;
                }
            }
            if (check) {
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        SkillTree skillTree = new SkillTree();
        String skill = "CBD";
        String[] skill_trees = {"BACDE", "CBADF", "AECB", "BDA"};
        System.out.println(skillTree.solution(skill, skill_trees));
    }
}
