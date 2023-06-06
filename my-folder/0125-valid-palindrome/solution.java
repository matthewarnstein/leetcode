class Solution {
    public boolean isPalindrome(String s) {
        StringBuffer str = new StringBuffer();
        StringBuilder rev = new StringBuilder();
        for(char c : s.toLowerCase().toCharArray()) {
            if (Character.isLetter(c) || Character.isDigit(c)) {
                str.append(c);
                rev.append(c);
            }
        }
        rev.reverse();
        
        if (str.toString().equals(rev.toString())) {
            return true;
        } else {
            return false;
        }
    }
}
