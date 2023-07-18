class Solution {
    public int largestAltitude(int[] gain) {
        int highest = 0;
        int alt = highest;

        for(int net : gain) {
            alt += net;
            if(alt > highest)
                highest = alt;
        }
        
        return highest;
    }
}
