package programmers_level2;

import java.util.ArrayList;
import java.util.List;

// 뉴스 클러스터링
// 자카드 유사도 : 교집합 크기/ 합집합 크기, 두 집합 모두 공집합일때는 1로 정의.
// 20시 23분 시작. 21시 39분 완료. 중복처리는 풀이 참조하였음.
public class NewsClustering {
    public int solution(String str1, String str2) {
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        for (int i = 0; i < str1.length() - 1; i++) {
            String substring = str1.substring(i, i + 2).toLowerCase();

            boolean isAlphabet = true;
            for (int j = 0; j < substring.length(); j++) {
                if ('a' > substring.charAt(j) || substring.charAt(j) > 'z') {
                    isAlphabet = false;
                }
            }
            if (!isAlphabet) {
                continue;
            }

            list1.add(substring);
        }
        for (int i = 0; i < str2.length() - 1; i++) {
            String substring = str2.substring(i, i + 2).toLowerCase();

            boolean isAlphabet = true;
            for (int j = 0; j < substring.length(); j++) {
                if ('a' > substring.charAt(j) || substring.charAt(j) > 'z') {
                    isAlphabet = false;
                }
            }
            if (!isAlphabet) {
                continue;
            }

            list2.add(substring);
        }

        List<String> sumList = new ArrayList<>();
        List<String> subtractList = new ArrayList<>();

        for (int i = 0; i < list1.size(); i++) {
            if (list2.contains(list1.get(i))) {
                subtractList.add(list1.get(i));
                list2.remove(list1.get(i));
            }
            sumList.add(list1.get(i));
        }
        for (int i = 0; i < list2.size(); i++) {
            sumList.add(list2.get(i));
        }

        int max = Math.max(sumList.size(), subtractList.size());
        int min = Math.min(sumList.size(), subtractList.size());
        if (max == 0 && min == 0) {
            return 65536;
        }
        double j = min / (double) max;

        return (int) Math.floor(j * 65536);
    }

    public static void main(String[] args) {
        String str1 = "aa1+aa2";
        String str2 = "AAAA12";
        NewsClustering newsClustering = new NewsClustering();
        System.out.println(newsClustering.solution(str1, str2));
    }
}
