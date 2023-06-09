class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        char[] chars = pattern.toCharArray();
        Map<Character,String> map = new HashMap<Character,String>();
        if (words.length != chars.length)
            return false;
        
        for (int i = 0; i < chars.length; i++) {
            if (map.containsKey(chars[i]) && 
                   (!map.containsValue(words[i]) || !map.get(chars[i]).equals(words[i]))   ) {
                return false;
            }
            if (!map.containsKey(chars[i]) && map.containsValue(words[i])) {
                return false;
            }
            map.put(chars[i], words[i]);    
        }
        return true;
    }
}
