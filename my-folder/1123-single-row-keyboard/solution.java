class Solution {
    public int calculateTime(String keyboard, String word) {
        HashMap<Character,Integer> map = fillKeyboardMap(keyboard);
        int time = map.get(word.charAt(0));

        for (int i = 1; i < word.length(); i++) {
            time += Math.abs(map.get(word.charAt(i - 1)) - map.get(word.charAt(i)));
        }

        return time;
    }

    public HashMap<Character,Integer> fillKeyboardMap(String keyboard) {
        HashMap<Character,Integer> map = new HashMap<Character,Integer>(keyboard.length());
        int index = 0;
        for (char c : keyboard.toCharArray()) {
            map.put(c, index);
            index++;
        }

        return map;
    }
}
