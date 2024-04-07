class Solution {
    public int maxRepeating(String sequence, String word) {
        int max = 0;
        int i = sequence.indexOf(word);
        if (i > -1) max = 1;

        while (i > -1) {
            int c_max = max;
            String rep = repeat(word, c_max + 1);
            int c_i = sequence.indexOf(rep, i);
            
            if (c_i > -1) {
                i = c_i;
                c_max++;
                if (c_max > max) max = c_max;
            } else
                i = -1;
        }
        return max;
    }

    public String repeat(String word, int n) {
        if (n < 1) return new String("");
        String res = new String(word);

        for (int i = 1; i < n; i++)
            res = res.concat(word);

        return res;
    }
}
