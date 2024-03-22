class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        int least = Integer.MAX_VALUE;

        for(int i = 0; i < list1.length; i++) {
            for(int j = 0; j < list2.length; j++) {
                if(list1[i].equals(list2[j])) {
                    if(map.containsKey(list1[i]) && map.get(list1[i]) > i + j) {
                        map.put(list1[i], i + j);
                    } else {
                        map.put(list1[i], i + j);
                    }
                    if(i + j < least)
                        least = i + j;
                }
            } 
        }


        String[] res = map.keySet().toArray(new String[0]);
        for(String s : res) {
            if(map.get(s) != least)
                map.remove(s);
        }
        String[] out = map.keySet().toArray(new String[0]);
        return out;
    }
}
