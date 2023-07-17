class Solution {
    public String VOWELS = "aeiouAEIOU";

    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int vowelPos = s.length();
        for(int i = 0; i < s.length(); i++) {
            if(isVowel(arr[i])) {
                vowelPos = nextVowel(s, vowelPos);
                arr[i] = arr[vowelPos];
                arr[i] = s.charAt(vowelPos);
            }
        }
        String res = new String(arr);
        return res;
    }

    public boolean isVowel(char c) {
        return VOWELS.indexOf(c) != -1;
    }

    public int nextVowel(String str, int vowelPos) {
        for(int i = vowelPos - 1; i >= 0; i--) {
            char c = str.charAt(i);
            if(isVowel(c)) {
                return i;    
            }
        }
        return 0;
    }
}
