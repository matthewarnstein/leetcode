class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        Map<Integer,String> map = new HashMap<Integer,String>();
        for (int i = 0; i < heights.length; i++) {
            map.put(heights[i],names[i]);
        }
        Arrays.sort(heights);
        for (int i = 0; i < heights.length; i++) {
            int j = heights.length - i - 1;
            names[i] = map.get(heights[j]);
        }
        return names;
    }
}
