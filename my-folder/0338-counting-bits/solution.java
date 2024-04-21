class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            ans[i] = bits(i);
        }

        return ans;
    }

    public int bits(int n) {
        String b = Integer.toBinaryString(n);
        int num = 0;
        for (char c : b.toCharArray()) {
            if (c == '1')
                num++;
        }
        return num;
    }
}
