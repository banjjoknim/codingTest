package slab.q1;

import java.util.Arrays;

public enum Weather {
    SUNNY("맑음", 1, 20, 0),
    LITTLE_CLOUDY("구름 조금", 2, 20, 0),
    MORE_CLOUDY("구름 많음", 3, 17, 0),
    CLOUDY("흐림", 4, 10, 0),
    NOTHING("없음", 0, 0, 1),
    RAINY("비", 1, 5, 1),
    SNOWY("눈", 2, 14, 1);

    private String name;
    private int value;
    private int score;
    private int index;

    Weather(String name, int value, int score, int index) {
        this.name = name;
        this.value = value;
        this.score = score;
        this.index = index;
    }

    public static Weather from(int value, int index) {
        return Arrays.stream(Weather.values())
                .filter(weather -> weather.value == value && weather.index == index)
                .findAny()
                .get();
    }

    public boolean isCloudy() {
        return this == CLOUDY;
    }

    public boolean isRainy() {
        return this == RAINY;
    }

    public int getScore() {
        return score;
    }
}
