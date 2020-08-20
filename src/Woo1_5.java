public class Woo1_5 {
    //0시 55분 시작. 01시 15분 완료.
    public int solution(int number) {
        int answer = 0;

        int count = 0;
        for (int i = 1; i <= number; i++) {
            int numberBy10000 = i / 10000;
            int numberBy1000 = (i % 10000) / 1000;
            int numberBy100 = (i % 1000) / 100;
            int numberBy10 = (i % 100) / 10;
            int numberBy1 = i % 10;

            if (numberBy10000 % 3 == 0 && numberBy10000 != 0) {
                count = count + 1;
            }
            if (numberBy1000 % 3 == 0 && numberBy1000 != 0) {
                count = count + 1;
            }
            if (numberBy100 % 3 == 0 && numberBy100 != 0) {
                count = count + 1;
            }
            if (numberBy10 % 3 == 0 && numberBy10 != 0) {
                count = count + 1;
            }
            if (numberBy1 % 3 == 0 && numberBy1 != 0) {
                count = count + 1;
            }
        }
        answer = count;
        return answer;
    }

}
