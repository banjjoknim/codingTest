package w1;

public class Woo1_4 {
    // 23시 40분 시작. 00시 15분 완료.

    public int solution(int[] pobi, int[] crong) {

        int result = 0;
        int pobiScore = 0;
        int crongScore = 0;
        int p100 = 0;
        int p10 = 0;
        int p1 = 0;
        for (int i = 0; i < pobi.length; i++) {
            int addPage = 0;
            int multiPage = 0;
            if (pobi[i] < 10) {
                p1 = pobi[i] % 10;
                addPage = p1;
                multiPage = p1;
            }
            if (pobi[i] < 100) {
                p10 = pobi[i] / 10;
                p1 = pobi[i] % 10;
                addPage = p1 + p10;
                multiPage = p1 * p10;
            }
            if (pobi[i] >= 100) {
                p100 = pobi[i] / 100;
                p10 = (pobi[i] % 100) / 10;
                p1 = pobi[i] % 10;
                addPage = p1 + p10 + p100;
                multiPage = p1 * p10 * p100;
            }

            if (Integer.compare(addPage, multiPage) >= 0 && addPage >= pobiScore) {
                pobiScore = addPage;
            }
            if (Integer.compare(addPage, multiPage) <= 0 && multiPage >= pobiScore) {
                pobiScore = multiPage;
            }

        }

        for (int i = 0; i < crong.length; i++) {
            int addPage = 0;
            int multiPage = 0;
            if (crong[i] < 10) {
                p1 = crong[i] % 10;
                addPage = p1;
                multiPage = p1;
            }
            if (crong[i] < 100) {
                p10 = crong[i] / 10;
                p1 = crong[i] % 10;
                addPage = p1 + p10;
                multiPage = p1 * p10;
            }
            if (crong[i] >= 100) {
                p100 = crong[i] / 100; // 1
                p10 = (crong[i] % 100) / 10; // 9
                p1 = crong[i] % 10; // 7
                addPage = p1 + p10 + p100;
                multiPage = p1 * p10 * p100;
            }

            if (Integer.compare(addPage, multiPage) >= 0 && addPage >= crongScore) {
                crongScore = addPage;
            }
            if (Integer.compare(addPage, multiPage) <= 0 && multiPage >= crongScore) {
                crongScore = multiPage;
            }

        }
        if (pobiScore == crongScore) {
            result = 0;
        }
        if (pobiScore > crongScore) {
            result = 1;
        }
        if (pobiScore < crongScore) {
            result = 2;
        }
        if ((pobi[1] - pobi[0]) != 1 || (crong[1] - crong[0]) != 1 || pobi[0] % 2 != 1 || pobi[1] % 2 != 0
                || crong[0] % 2 != 1 || crong[1] % 2 != 0 || pobi.length != 2 || crong.length != 2) {
            result = -1;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] pobi = new int[]{97, 98};
        int[] crong = new int[]{197, 198};
        Woo1_4 woo1_4 = new Woo1_4();
        int result = woo1_4.solution(pobi, crong);
        System.out.println(result);

    }
}
