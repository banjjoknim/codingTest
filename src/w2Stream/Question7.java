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

        getPersonList(user, friends, personList, visitors);

        getFriendToFriend(friends, friendList, friendToFriend);

        Arrays.stream(visitors).forEach(name -> visitorList.add(name));

        friendToFriend.removeIf(name -> name.equals(user));
        personList.removeAll(friendList);
        for (int i = 0; i < personList.size(); i++) {
            int score = 0;

            int indexI = i;
            score += IntStream.range(0, friendToFriend.size())
                .filter(index -> personList.get(indexI).equals(friendToFriend.get(index)))
                .map(index -> 10)
                .sum();

            score += IntStream.range(0, visitorList.size())
                .filter(index -> personList.get(indexI).equals(visitorList.get(index)))
                .map(index -> 1)
                .sum();

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

    private void getFriendToFriend(String[][] friends, List<String> friendList, List<String> friendToFriend) {
        for (int i = 0; i < friends.length; i++) {
            int indexI = i;
            IntStream.range(0, friendList.size())
                .filter(index -> Arrays.asList(friends[indexI]).contains(friendList.get(index)))
                .forEach(
                    index -> Arrays.stream(friends[indexI])
                        .filter(name -> !name.equals(friendList.get(index)))
                        .forEach(name -> friendToFriend.add(name)));
        }
    }

    private void getPersonList(String user, String[][] friends, List<String> personList, String[] visitors) {
        IntStream.range(0, friends.length)
            .mapToObj(index ->
                friends[index]).forEach(array -> Arrays.stream(array)
            .filter(name -> !name.equals(user))
            .forEach(name -> {
                if (!personList.contains(name)) {
                    personList.add(name);
                }
            }));
        Arrays.stream(visitors).filter(name -> !personList.contains(name)).forEach(name -> personList.add(name));
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
