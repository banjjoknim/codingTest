package slab.q1;

import java.util.Objects;

public class Result implements Comparable<Result> {
    private int totalScore;
    private Day day;

    public Result(int totalScore, Day day) {
        this.totalScore = totalScore;
        this.day = day;
    }

    public int getTotalScore() {
        return totalScore;
    }

    public Day getDay() {
        return day;
    }

    @Override
    public String toString() {
        return "Result{" +
                "totalScore=" + totalScore +
                ", day=" + day +
                ", index=" + day.getIndex() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Result result = (Result) o;
        return totalScore == result.totalScore && day == result.day;
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalScore, day);
    }

    @Override
    public int compareTo(Result o) {
        int compare = Integer.compare(this.totalScore, o.totalScore);
        if (compare == 0) {
            return Integer.compare(this.day.getPriority(), o.day.getPriority());
        }
        return compare;
    }
}
