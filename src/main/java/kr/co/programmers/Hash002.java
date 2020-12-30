package kr.co.programmers;

public class Hash002 {

    public static boolean solve(String[] phoneBook) {
        boolean answer = true;

        for (int i = 0; i < phoneBook.length; i++) {
            String current = phoneBook[i];

            for (int j = i + 1; j < phoneBook.length; j++) {
                String target = phoneBook[j];
                if (current.startsWith(target) || target.startsWith(current)) {
                    answer = false;
                    break;
                }
            }

            if (!answer) {
                break;
            }
        }

        return answer;
    }
}
