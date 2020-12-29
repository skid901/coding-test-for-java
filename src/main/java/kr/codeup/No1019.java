package kr.codeup;

public class No1019 {

    public static String solve(String received) {
        StringBuilder expected = new StringBuilder();
        String[] tokens = received.split("\\.");

        for (int i = 0; i < tokens.length; i++) {
            String token = String.format(i == 0 ? "%04d" : ".%02d", Integer.parseInt(tokens[i]));
            expected.append(token);
        }

        return expected.toString();
    }
}
