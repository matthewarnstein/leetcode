class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        int index = -1;
        String[] words = sentence.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].startsWith(searchWord)) {
                if (index == -1)
                    index = i + 1;
            }
        }

        return index;
    }
}
