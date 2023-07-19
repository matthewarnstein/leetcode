class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> occ = new HashMap<Integer,Integer>();
        Set<Integer> numOcc = new HashSet<Integer>();

        for(int num : arr ) {
            occ.put(num,occ.getOrDefault(num,0) + 1);
        }

        Object[] vals = occ.values().toArray();
        Arrays.sort(vals);
        for(int i = 1; i < vals.length; i++) {
            if(vals[i] == vals[i - 1])
                return false;
        }
        //System.out.println(Arrays.toString(vals));

        return true;
    }
}
