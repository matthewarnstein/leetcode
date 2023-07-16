import java.lang.*;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int greatest = 0;
        List<Boolean> results = new ArrayList<Boolean>(candies.length);

        for(int numCandies : candies) {
            if(numCandies > greatest)
                greatest = numCandies;
        }

        for(int i = 0; i < candies.length; i++) {
            if(candies[i] + extraCandies >= greatest)
                results.add(i, Boolean.TRUE);
            else
                results.add(i, Boolean.FALSE);
        
        }

        return results;
    }
}
