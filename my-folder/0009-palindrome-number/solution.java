import java.lang.*;

class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        } else {
            String strNum = Integer.toString(x);
            String revStrNum = "";
            for (int i = strNum.length() - 1; i >= 0; i--) {
                revStrNum += strNum.charAt(i);
            }
            if (strNum.equals(revStrNum))
                return true;
            else
                return false;
        }

        // int length = strNum.length() - 1;
        // int j;
        // for (int i = 0; i <= length/2; i++) {
        //     j = length - i; 
        // }
        
    }
}
