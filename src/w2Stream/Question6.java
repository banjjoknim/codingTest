package w2Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

// 00시 10분 시작. 00시 46분 완료.
public class Question6 {
    public String[] solution(String[][] forms) {
        String[] answer = {};
        List<String> list = new ArrayList<String>();
        List<String> overlap = new ArrayList<String>();
        List<String> answerList = new ArrayList<String>();

        IntStream.range(0, forms.length).forEach(index -> getSubstringList(forms[index], list));

        addOverlap(list, overlap);
        addAnswer(forms, overlap, answerList);
        answer = sortList(answerList);
        return answer;
    }

    private String[] sortList(List<String> answerList) {
        return answerList.stream()
                .map(form -> form.substring(0, form.indexOf('@')))
                .sorted()
                .map(form -> form.concat("@email.com"))
                .collect(Collectors.toList()).toArray(new String[answerList.size()]);
    }

    private void addOverlap(List<String> list, List<String> overlap) {
        IntStream.range(0, list.size())
                .forEach(index1 -> IntStream.range(0, list.size())
                        .forEach(index2 -> {
                            if (list.get(index1).equals(list.get(index2)) && index1 != index2 && !overlap.contains(
                                    list.get(index1))) {
                                overlap.add(list.get(index1));
                            }
                        }));
    }

    private void addAnswer(String[][] forms, List<String> overlap, List<String> answerList) {
        IntStream.range(0, forms.length)
                .forEach(index1 -> IntStream.range(0, overlap.size())
                        .forEach(index2 -> {
                            if (forms[index1][1].contains(overlap.get(index2)) && !answerList.contains(forms[index1][0])) {
                                answerList.add(forms[index1][0]);
                            }
                        }));
    }

    private void getSubstringList(String[] form, List<String> list) {
        IntStream.range(0, form[1].length() - 1)
                .forEach(index -> list.add(form[1].substring(index, index + 2)));
    }

}
