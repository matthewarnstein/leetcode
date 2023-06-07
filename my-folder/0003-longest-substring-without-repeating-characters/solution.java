class Solution {
    public int lengthOfLongestSubstring(String s) {
        int longest = 0;
        for (int i = 0; i < s.length(); i++) {
            int size = getLongest(s.substring(i));
            if (size >= longest) {
                longest = size;
            }
        }
        return longest;
    }

    public int getLongest(String s) {
        HashSet<Character> lookup = new HashSet<Character>();
        int longest = 0;
        String str = "";
        for (char c : s.toCharArray()) {
            if (!lookup.contains(c)) {
                lookup.add(c);
                longest++;
                str += c;
            } else {
                break;
            }
        }
        return longest;
    }
}

