class Solution {
    public boolean canPermutePalindrome(String s) {
        int len = s.length();
        if (len == 1)
            return true;
        boolean odd = len % 2 == 1 ? true : false;
        Map<Character,Integer> map = new HashMap<Character,Integer>();

        for (char c : s.toCharArray()) {
            if (map.containsKey(c))
                map.put(c, map.get(c)+1);
            else
                map.put(c,1);
        }
        int numOdd = 0;
        ArrayList<Integer> vals = new ArrayList<Integer>();
        Integer freq[] = new Integer[map.keySet().size()];
        //freq = vals.toArray(map.values().toArray());
        for (int val : map.values().toArray(freq)) {
            if (val % 2 == 1) {
                numOdd++;
            }
        }

        if ((odd && numOdd > 1) ||
            (!odd && numOdd > 0) )
            return false;
        else
            return true;

    }
}
