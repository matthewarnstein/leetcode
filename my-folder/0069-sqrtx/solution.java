class Solution {
    public int mySqrt(int x) {
        if (x < 1)
            return 0;
        int res = 1;
        while (res < 46340) {
            if (res*res <= x && (res + 1)*(res + 1) > x)
                return res;
            else
                res++;
        }
        return res;
    }
}
