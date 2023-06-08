class Solution {
    public boolean isAnagram(String s, String t) {
        char[] sarr = s.toCharArray();
        char[] tarr = t.toCharArray();

        Arrays.sort(sarr);
        Arrays.sort(tarr);

        String ss = new String(sarr);
        String tt = new String(tarr);

        return ss.equals(tt);
    }
}
