package kr.co.programmers;

public class StkQue001 {

    public static int[] solve(int[] prices) {
        int[] rtn = new int[prices.length];

        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                rtn[i]++;
                if (prices[i] > prices[j]) {
                    break;
                }
            }
        }

        return rtn;
    }
}
