package woo3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Woo3Q5 {
    public String solution(String penter, String pexit, String pescape, String data) {
        List<String> list = new ArrayList<>();
        int listSize = data.length() / penter.length();
        for (int i = 0; i < listSize; i++) {
            list.add(data.substring(penter.length() * i, penter.length() * (i + 1)));
        }
        for (int i = 0; i < listSize; i++) {
            if (list.get(i).equals(penter) || list.get(i).equals(pexit) || list.get(i).equals(pescape)) {
                list.set(i, pescape.concat(list.get(i)));
            }
        }

        return penter.concat(list.stream()
            .collect(Collectors.joining()))
            .concat(pexit);
    }

    public static void main(String[] args) {
        String penter = "10";
        String pexit = "11";
        String pescape = "00";
        String data = "00011011";
        Woo3Q5 woo3Q5 = new Woo3Q5();
        System.out.println(woo3Q5.solution(penter, pexit, pescape, data));
    }
}
