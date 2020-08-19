public class Woo1_3 {
    // 02시 01분 시작. 03시 24분까지 못 품.
    // 21시 55분 시작. 22시 33분 완료.
    public String solution(String word) {
        String reverseWord = "";

        char[] alpabat = new char[26];
        for (int i = 0; i < alpabat.length; i++) {
            alpabat[i] = (char)('a' + i);
        }
        char[] reverseAlpabat = new char[26];
        for (int i = 0; i < reverseAlpabat.length; i++) {
            reverseAlpabat[i] = (char)('z' - i);
        }
        char[] charArray = word.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            for (int j = 0; j < alpabat.length; j++) {
                if (charArray[i] >= 97 && charArray[i] <= 122) {
                    if (charArray[i] == alpabat[j]) {
                        charArray[i] = reverseAlpabat[j];
                        break;
                    }
                }
                if (charArray[i] >= 65 && charArray[i] <= 90) {
                    if (Character.toLowerCase(charArray[i]) == alpabat[j]) {
                        charArray[i] = (char)(reverseAlpabat[j] - 32);
                        break;
                    }
                }

            }
        }

        reverseWord = String.valueOf(charArray);
        return reverseWord;

    }

    public static void main(String[] args) {
        Woo1_3 woo1_3 = new Woo1_3();
        System.out.println(woo1_3.solution("I love you"));
        
    }
}
