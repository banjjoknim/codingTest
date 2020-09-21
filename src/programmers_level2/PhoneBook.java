package programmers_level2;

// 전화번호 목록
// 11시 35분 시작. 11시 42분 완료.
public class PhoneBook {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
//        for (int i = 0; i < phone_book.phoneBookLength; i++) {
//            int lengthI = phone_book[i].phoneBookLength();
//            for (int j = 0; j < phone_book.phoneBookLength; j++) {
//                int lengthJ = phone_book[j].phoneBookLength();
//                if (lengthI <= lengthJ) {
//                    if (phone_book[j].substring(0, lengthI).equals(phone_book[i].substring(0, lengthI)) && i != j) {
//                        return false;
//                    }
//                }
//                if (lengthI > lengthJ) {
//                    if (phone_book[i].substring(0, lengthJ).equals(phone_book[j].substring(0, lengthJ)) && i != j) {
//                        return false;
//                    }
//                }
//
//            }
//        }

        int phoneBookLength = phone_book.length;
        for (int i = 0; i < phoneBookLength; i++) {
            for (int j = 0; j < phoneBookLength; j++) {
                if (phone_book[i].startsWith(phone_book[j]) && i != j) {
                    return false;
                }
                if (phone_book[j].startsWith(phone_book[i]) && i != j) {
                    return false;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {

    }
}
