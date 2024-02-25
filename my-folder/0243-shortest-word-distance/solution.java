import java.lang.Math;
import java.lang.Integer;

class Solution {
    public int shortestDistance(String[] wordsDict, String word1, String word2) {
        int max = Integer.MAX_VALUE;
        for (int i = 0; i < wordsDict.length; i++) {
            if (wordsDict[i].equals(word1)) {
                for (int j = 0; j < wordsDict.length; j++) {
                    if (wordsDict[j].equals(word2)) {
                        if (Math.abs(i - j) < max)
                            max = Math.abs(i - j);
                    }
                }
            }
        }

        return max;
    }
}
