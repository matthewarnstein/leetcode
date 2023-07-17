class Solution {
    public String reverseWords(String s) {
        String raw = s.replaceAll("\\s+", " ").trim();
        String[] tokens = raw.split(" ");
        String[] res = new String[tokens.length];
        int i = 0;
        int j = res.length - 1;
        while(j >=0) {
            res[i] = tokens[j];
            i++;
            j--;
        }


        return String.join(" ", res);
    }
}
