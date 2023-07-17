class Solution {
    public int compress(char[] chars) {
        String compressed = "";
        int i = 0;
        while(i < chars.length) {
            int consec = numConsecutive(chars, i);
            if(consec == 1) {
                compressed += chars[i];
            } else {
                compressed += chars[i] + Integer.toString(consec);
            }
            i += consec;
        }
        for(int j = 0; j < Math.min(compressed.length(), chars.length); j++) {
            chars[j] = compressed.charAt(j);
        }
        return compressed.length();
    }

    public int numConsecutive(char[] chars, int start) {
        char c = chars[start];
        int i = start + 1;
        int count = 1;
        while(i < chars.length && chars[i] == c) {
            count++;
            i++;
        }

        return count;
    }
}
