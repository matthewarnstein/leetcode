class Solution {
    public String[] findWords(String[] words) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        String row1 = "qwertyuiop";
        String row2 = "asdfghjkl";
        String row3 = "zxcvbnm";
        for(char c : row1.toCharArray()) {
            map.putIfAbsent(c, 1);
        }
        for(char c : row2.toCharArray()) {
            map.putIfAbsent(c, 2);
        }
        for(char c : row3.toCharArray()) {
            map.putIfAbsent(c, 3);
        }

        ArrayList<String> out = new ArrayList<String>();
        for(String word : words) {
            if(singleRow(word, map))
                out.add(word);
        }
        String[] ret = out.toArray(new String[0]);
        return ret;
    }

    public boolean singleRow(String s, HashMap<Character, Integer> map) {
        if (s.length() == 1)
            return true;
        char[] chars = s.toLowerCase().toCharArray();
        int row = map.get(chars[0]);

        for(int i = 1; i < chars.length; i++) {
            if(map.get(chars[i]) != row)
                return false;
        }

        return true;
    }
}
