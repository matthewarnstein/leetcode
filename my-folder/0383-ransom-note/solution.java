class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> used = new HashMap<Character, Integer>();

        for(char m : magazine.toCharArray()) {
            if (!used.containsKey(m))
                used.put(m, 1);
            else
                used.put(m, used.get(m) + 1);
        }

        for(char r : ransomNote.toCharArray()) {
            if (!used.containsKey(r))
                return false;
            else {
                if (used.get(r) == 1)
                    used.remove(r);
                else
                    used.put(r, used.get(r) - 1);
            }
        }
        return true;
    }
}
