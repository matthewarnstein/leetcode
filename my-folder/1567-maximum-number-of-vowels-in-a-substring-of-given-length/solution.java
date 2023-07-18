class Solution {
    public String VOWELS = "aeiou";

    public int maxVowels(String s, int k) {
        int count = getNumVowels(s.substring(0, k));
        int max = count;

        for(int i = 0; i <= s.length() - k - 1; i++) {
            char first = s.charAt(i);
            char next = s.charAt(i + k);
            if(VOWELS.indexOf(first) != -1 && VOWELS.indexOf(next) == -1) {
                count--;
            } else if(VOWELS.indexOf(first) == -1 && VOWELS.indexOf(next) != -1) {
                count++;
            }
            if(count > max)
                max = count;
        }

        return max;
        
    }

    public int getNumVowels(String s) {
        int count = 0;

        for(char c : s.toCharArray()) {
            if(VOWELS.indexOf(c) != -1)
                count++;
        }

        return count;
    }
}
