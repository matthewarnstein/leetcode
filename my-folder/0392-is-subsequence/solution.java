class Solution {
    public boolean isSubsequence(String s, String t) {
        int begin = 0;
        for(char c : s.toCharArray()) {
            int pos = t.indexOf(c, begin);
            if(pos == -1) {
                return false;
            } else {
                begin = pos + 1;
            }
        }

        return true;

    }
}
