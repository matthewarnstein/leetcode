class Solution {
    public boolean closeStrings(String word1, String word2) {
        Map<Character, Integer> freq1 = new HashMap<Character, Integer>();
        Map<Character, Integer> freq2 = new HashMap<Character, Integer>();

        for(char c : word1.toCharArray()) {
            freq1.put(c, freq1.getOrDefault(c,0) + 1);
        }
        for(char c : word2.toCharArray()) {
            freq2.put(c, freq2.getOrDefault(c,0) + 1);
        }

        int[] arr1 = new int[freq1.values().toArray().length];
        int i = 0;
        for(Object o : freq1.values().toArray()) {
            arr1[i] = (int)o;
            i++;
        }

        int[] arr2 = new int[freq2.values().toArray().length];
        int j = 0;
        for(Object o : freq2.values().toArray()) {
            arr2[j] = (int)o;
            j++;
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        // System.out.println(freq1.keySet().toString());
        // System.out.println(freq2.keySet().toString());
        // System.out.println(freq1.keySet().equals(freq2.keySet()));
        // System.out.println(Arrays.toString(arr1));

        return Arrays.equals(arr1,arr2) && freq1.keySet().equals(freq2.keySet());
        // System.out.println(Arrays.toString(  freq1.values().toArray() ));
        // System.out.println(Arrays.toString(arr1));
        // return true;
    }
}
