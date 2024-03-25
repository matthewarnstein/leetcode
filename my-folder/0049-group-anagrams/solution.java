class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<String, List<String>>();
        
        for (String s : strs) {
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String grp = new String(arr);
            if (map.containsKey(grp))
                map.get(grp).add(s);
            else {
                List<String> list = new ArrayList<String>();
                list.add(s);
                map.put(grp, list);
            }
        }
        List<List<String>> res = new ArrayList<List<String>>();
        res.addAll(map.values());
        
        return res;
    }
}
