class Solution {
    public List<String> cellsInRange(String s) {
        String[] range = s.split(":");
        int cFrom = range[0].charAt(0);
        int cTo = range[1].charAt(0);
        int rFrom = range[0].charAt(1) - '0';
        int rTo = range[1].charAt(1) - '0';
        List<String> res = new ArrayList<String>();

        for (int i = cFrom; i <= cTo; i++) {
            for (int j = rFrom; j <= rTo; j++) {
                String cell = Character.toString(i) + Integer.toString(j);
                res.add(cell);
            }
        }
        return res;
    }
}
