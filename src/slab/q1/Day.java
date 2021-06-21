package slab.q1;

import java.util.Arrays;

public enum Day {
    MON(0, 1),
    TUE(1, 2),
    WED(2, 4),
    THU(3, 3),
    FRI(4, 6),
    SAT(5, 7),
    SUN(6, 5);

    private int index;
    private int priority;

    Day(int index, int priority) {
        this.index = index;
        this.priority = priority;
    }


    public static Day from(int index) {
        return Arrays.stream(Day.values())
                .filter(day -> day.index == index)
                .findAny()
                .get();
    }

    public int getIndex() {
        return index;
    }

    public int getPriority() {
        return priority;
    }
}
