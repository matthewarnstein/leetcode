class Solution {
    public boolean isPalindrome(String s) {
        String p = s.toLowerCase().replaceAll("[^a-z0-9]","");
        if (p.length() <= 1)
            return true;
        int j = p.length() - 1;
        int i = 0;
        
        while (i < j) {
            if (p.charAt(i) != p.charAt(j))
                return false;
            i++;
            j--;
        }

        return true;
    }
}
