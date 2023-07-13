import java.lang.*;

class Solution {
    public String gcdOfStrings(String str1, String str2) {
        String match = "";
        int i = 1;
        while (i <= str1.length() && i <= str2.length()) {
            String sub1 = str1.substring(0,i);
            String sub2 = str2.substring(0,i);
            if (sub1.equals(sub2) &&
                divides(str1, sub1) > 0 &&
                divides(str2, sub2) > 0
            ) {
                match = str1.substring(0,i);
                //break;
            }
            i++;
        }

        return match;

        // if (divides(str1, str2) > 0)
        //     return str2;
        // else
        //     return "";
    }

    public int divides(String s, String d) {
        double s_len = (double)s.length();
        double d_len = (double)d.length();
        int n = -1;
        double r = Math.ceil(s_len/d_len) - (s_len/d_len);
        if (r == 0.0) {
            n = s.length()/d.length();
            String temp = d;
            for(int i = 1; i < n; i++) {
                temp = temp.concat(d);
            }
            if(!temp.equals(s))
                n = -1;
        }

        return n;
    }
}
