class Solution {
    public int alternateDigitSum(int n) {
        String s = String.valueOf(n);
        int sum = 0;

        for (int i = 0; i < s.length(); i++) {
            int nums = Integer.parseInt(String.valueOf(s.charAt(i)));
            if (i % 2 == 0) {
                sum += nums;
            } else {
                sum -= nums;
            }
        }

        return sum;

    }
}