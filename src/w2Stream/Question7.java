package w2Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

// 12시 33분 시작. 01시 10분 실패
// 01시 10분 시작. 02시 40분 완료..
public class Question7 {
    public String[] solution(String user, String[][] friends, String[] visitors) {
        String[] answer = {};
        List<String> personList = new ArrayList<>();
        List<String> friendList = new ArrayList<>();
        List<String> visitorList = new ArrayList<>();
        List<String> friendToFriend = new ArrayList<>();
        List<Person> recommandList = new ArrayList<>();

        getFriendList(user, friends, friendList);

        for (int i = 0; i < friends.length; i++) {
            Arrays.stream(friends[i]).filter(name -> !name.equals(user)).forEach(name -> {
                if (!personList.contains(name)) {
                    personList.add(name);
                }
            });
            for (int j = 0; j < friendList.size(); j++) {
                if (Arrays.asList(friends[i]).contains(friendList.get(j))) {
                    int index = j;
                    Arrays.stream(friends[i])
                        .filter(name -> !name.equals(friendList.get(index)))
                        .forEach(name -> friendToFriend.add(name));
                }
            }
        }
        Arrays.stream(visitors).forEach(name -> {
            visitorList.add(name);
            if (!personList.contains(name)) {
                personList.add(name);
            }
        });
        friendToFriend.removeIf(name -> name.equals(user));
        personList.removeAll(friendList);
        for (int i = 0; i < personList.size(); i++) {
            int score = 0;

            for (int j = 0; j < friendToFriend.size(); j++) {
                if (personList.get(i).equals(friendToFriend.get(j))) {
                    score += 10;
                }
            }

            for (int j = 0; j < visitorList.size(); j++) {
                if (personList.get(i).equals(visitorList.get(j))) {
                    score += 1;
                }
            }
            Person person = new Person();
            person.setScore(score);
            person.setName(personList.get(i));
            recommandList.add(person);
        }
        recommandList.removeAll(friendList);
        Collections.sort(recommandList, Collections.reverseOrder());
        answer = recommandList.stream()
            .map(item -> item.getName())
            .collect(Collectors.toList())
            .toArray(new String[recommandList.size()]);
        return answer;
    }

    private void getFriendList(String user, String[][] friends, List<String> friendList) {
        IntStream.range(0, friends.length)
            .mapToObj(index -> friends[index])
            .filter(array -> Arrays.asList(array).contains(user))
            .forEach(
                array -> Arrays.stream(array)
                    .filter(name -> !name.equals(user))
                    .forEach(name -> friendList.add(name)));
    }

}

class Person implements Comparable<Person> {
    private String name;
    private int score;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public int compareTo(Person p) {
        if (this.getScore() == p.getScore()) {
            return p.getName().compareTo(this.getName()); //내림차순
        }
        return Integer.compare(this.getScore(), p.getScore()); //오름차순
    }
}
