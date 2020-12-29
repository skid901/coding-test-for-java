package kr.codeup;

public class No1025 {

    public static String[] solve(String received) {
        String[] expected = new String[received.length()];
        String[] tokens = received.split("");

        for (int i = 0; i < tokens.length; i++) {
            double digit = Math.pow(10,received.length() - i - 1);
            expected[i] = String.format("[%d]", Integer.parseInt(tokens[i]) * (int) digit);
        }

        return expected;
    }
}
