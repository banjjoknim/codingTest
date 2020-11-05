package BackJoon;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// 로마 숫자
// 실버 1
// 44분 소요. 개노가다 문제
public class BackJoon2608 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> numbers = new HashMap<>();
        numbers.put("I", 1);
        numbers.put("V", 5);
        numbers.put("X", 10);
        numbers.put("L", 50);
        numbers.put("C", 100);
        numbers.put("D", 500);
        numbers.put("M", 1000);
        numbers.put("IV", 4);
        numbers.put("i", 4);
        numbers.put("IX", 9);
        numbers.put("x", 9);
        numbers.put("XL", 40);
        numbers.put("l", 40);
        numbers.put("XC", 90);
        numbers.put("c", 90);
        numbers.put("CD", 400);
        numbers.put("d", 400);
        numbers.put("CM", 900);
        numbers.put("m", 900);

        String number1 = sc.next();
        String number2 = sc.next();

        StringBuilder sb1 = new StringBuilder();
        for (int i = 0; i < number1.length(); i++) {
            if (sb1.length() == 0) {
                sb1.append(number1.charAt(i));
                continue;
            }
            String substring = sb1.substring(sb1.length() - 1);
            substring = substring + number1.charAt(i);
            if (numbers.containsKey(substring)) {
                sb1.deleteCharAt(sb1.length() - 1);
                if ("IV".equals(substring)) {
                    sb1.append("i");
                }
                if ("IX".equals(substring)) {
                    sb1.append("x");
                }
                if ("XL".equals(substring)) {
                    sb1.append("l");
                }
                if ("XC".equals(substring)) {
                    sb1.append("c");
                }
                if ("CD".equals(substring)) {
                    sb1.append("d");
                }
                if ("CM".equals(substring)) {
                    sb1.append("m");
                }
                continue;
            }
            sb1.append(number1.charAt(i));
        }

        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < number2.length(); i++) {
            if (sb2.length() == 0) {
                sb2.append(number2.charAt(i));
                continue;
            }
            String substring = sb2.substring(sb2.length() - 1);
            substring = substring + number2.charAt(i);
            if (numbers.containsKey(substring)) {
                sb2.deleteCharAt(sb2.length() - 1);
                if ("IV".equals(substring)) {
                    sb2.append("i");
                }
                if ("IX".equals(substring)) {
                    sb2.append("x");
                }
                if ("XL".equals(substring)) {
                    sb2.append("l");
                }
                if ("XC".equals(substring)) {
                    sb2.append("c");
                }
                if ("CD".equals(substring)) {
                    sb2.append("d");
                }
                if ("CM".equals(substring)) {
                    sb2.append("m");
                }
                continue;
            }
            sb2.append(number2.charAt(i));
        }
        int num1 = 0;
        for (String s : sb1.toString().split("")) {
            num1 += numbers.get(s);
        }
        int num2 = 0;
        for (String s : sb2.toString().split("")) {
            num2 += numbers.get(s);
        }

        int sum = num1 + num2;
        System.out.println(sum);

        StringBuilder answer = new StringBuilder();
        while (sum > 0) {
            if (sum >= 1000) {
                answer.append("M");
                sum -= 1000;
                continue;
            }
            if (sum >= 900) {
                answer.append("CM");
                sum -= 900;
                continue;
            }
            if (sum >= 500) {
                answer.append("D");
                sum -= 500;
                continue;
            }
            if (sum >= 400) {
                answer.append("CD");
                sum -= 400;
                continue;
            }
            if (sum >= 100) {
                answer.append("C");
                sum -= 100;
                continue;
            }
            if (sum >= 90) {
                answer.append("XC");
                sum -= 90;
                continue;
            }
            if (sum >= 50) {
                answer.append("L");
                sum -= 50;
                continue;
            }
            if (sum >= 40) {
                answer.append("XL");
                sum -= 40;
                continue;
            }
            if (sum >= 10) {
                answer.append("X");
                sum -= 10;
                continue;
            }
            if (sum >= 9) {
                answer.append("IX");
                sum -= 9;
                continue;
            }
            if (sum >= 5) {
                answer.append("V");
                sum -= 5;
                continue;
            }
            if (sum >= 4) {
                answer.append("IV");
                sum -= 4;
                continue;
            }
            answer.append("I");
            sum -= 1;
        }
        System.out.println(answer.toString());
    }
}
