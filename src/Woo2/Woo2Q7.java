package Woo2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// 35분 걸림
public class Woo2Q7 {
    public String[] solution(String user, String[][] friends, String[] visitors) {

        List<String> friendList = new ArrayList<>();
        for (String[] relation : friends) {
            boolean check = Arrays.stream(relation)
                .anyMatch(user::equals);
            if (check) {
                Arrays.stream(relation)
                    .findFirst()
                    .ifPresent(name -> friendList.add(name));
            }
        }

        List<String> friendToFriend = new ArrayList<>();
        for (String[] relation : friends) {
            for (String name : friendList) {
                boolean isFriendToFriend = Arrays.stream(relation)
                    .anyMatch(name::equals);
                if (isFriendToFriend) {
                    Arrays.stream(relation)
                        .filter(item -> !item.equals(name))
                        .filter(item -> !item.equals(user))
                        .findFirst()
                        .ifPresent(item -> friendToFriend.add(item));
                }
            }
        }

        Map<String, Integer> recommends = new HashMap<>();
        for (String name : friendToFriend) {
            if (!recommends.containsKey(name)) {
                recommends.put(name, 10);
                continue;
            }
            recommends.put(name, recommends.get(name) + 10);
        }

        for (String name : visitors) {
            if (!recommends.containsKey(name)) {
                recommends.put(name, 1);
                continue;
            }
            recommends.put(name, recommends.get(name) + 1);
        }

        List<User> users = new ArrayList<>();
        for (Map.Entry<String, Integer> recommend : recommends.entrySet()) {
            users.add(new User(recommend.getKey(), recommend.getValue()));
        }

        return users.stream()
            .filter(info -> info.score != 0)
            .filter(info -> !friendList.contains(info.name))
            .sorted(new Comparator<User>() {
                @Override
                public int compare(User o1, User o2) {
                    if (o1.score == o2.score) {
                        return o1.name.compareTo(o2.name);
                    }
                    return -(o1.score - o2.score);
                }
            })
            .map(info -> info.name)
            .limit(5)
            .toArray(String[]::new);
    }

    class User {
        private String name;
        private int score;

        public User(String name, int score) {
            this.name = name;
            this.score = score;
        }
    }

    public static void main(String[] args) {
        String user = "mrko";
        String[][] friends = {{"donut", "andole"}, {"donut", "jun"}, {"donut", "mrko"}, {"shakevan", "andole"},
            {"shakevan", "jun"}, {"shakevan", "mrko"}, {"jun", "mrko"}, {"bedi", "jun"}};
        String[] visitors = {"bedi", "bedi", "donut", "bedi", "shakevan", "ji", "ji", "ji", "ji"};
        Woo2Q7 woo2Q7 = new Woo2Q7();
        System.out.println(Arrays.toString(woo2Q7.solution(user, friends, visitors)));
    }
}
