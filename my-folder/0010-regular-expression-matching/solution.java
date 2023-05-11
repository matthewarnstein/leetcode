import java.util.regex.Pattern;

class Solution {
    public boolean isMatch(String s, String p) {
        boolean b = Pattern.matches(p, s);
        return b;
    }
}
