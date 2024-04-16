class Solution {
    public int climbStairs(int n) {
        return climb(n);
    }

    public int climb(int n) {
        if (n == 1)
            return 1;
        if (n == 2)
            return 2;
        int p2 = 0;
        int p1 = 1;
        int total = 2;
        for (int i = 3; i <= n; i++) {
            p2 = p1;
            p1 = total;
            total = p1 + p2;
        }

        return total;

    }
}
