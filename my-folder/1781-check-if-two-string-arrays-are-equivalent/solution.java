class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String string1 = "";
        String string2 = "";
        for (String word : word1)
            string1 += word;
        for (String word : word2)
            string2 += word;

        if (string1.equals(string2))
            return true;
        else
            return false;
    }
}
