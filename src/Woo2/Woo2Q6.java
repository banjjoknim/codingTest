package Woo2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.IntStream;

// 첫번째 45분 + @ 소요.
// 다시 풀었을때 30분 소요.
public class Woo2Q6 {
    public String[] solution(String[][] forms) {

        List<String> words = new ArrayList<>();
        for (int i = 0; i < forms.length; i++) {
            for (int j = 0; j < forms[i][1].length() - 1; j++) {
                words.add(forms[i][1].substring(j, j + 2));
            }
        }

        Set<String> overlap = new HashSet<>();
        for (int i = 0; i < words.size(); i++) {
            String word = words.get(i);
            int count = (int) Arrays.stream(forms)
                    .map(form -> form[1])
                    .filter(nickName -> nickName.contains(word))
                    .count();
            if (count > 1) {
                overlap.add(word);
            }
        }

        List<String> answer = new ArrayList<>();
        Iterator<String> iterator = overlap.iterator();
        while (iterator.hasNext()) {
            String word = iterator.next();
            IntStream.range(0, forms.length)
                    .mapToObj(index -> forms[index])
                    .filter(form -> form[1].contains(word))
                    .forEach(form -> answer.add(form[0]));
        }

        return answer.stream()
                .sorted(new Comparator<String>() {
                    @Override
                    public int compare(String o1, String o2) {
                        return o1.split("@")[0].compareTo(o2.split("@")[0]);
                    }
                })
                .distinct()
                .toArray(String[]::new);
    }

    public static void main(String[] args) {
        String[][] forms = {{"jm@email.com", "제이엠"}, {"jason@email.com", "제이슨"}, {"woniee@email.com", "워니"},
                {"mj@email.com", "엠제이"}, {
                "nowm@email.com", "이제엠"}};

        Woo2Q6 woo2Q6 = new Woo2Q6();
        System.out.println(Arrays.toString(woo2Q6.solution(forms)));
    }
}
