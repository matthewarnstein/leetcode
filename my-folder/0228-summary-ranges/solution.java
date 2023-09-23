class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<ArrayList<Integer>> ranges = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> startingRange = new ArrayList<Integer>();
        int numRanges = 0;
        if(nums.length == 0) {
            //ranges.add(startingRange);
            List<String> stringifiedList = new ArrayList<String>();
            return stringifiedList;
        }
        if(nums.length == 1) {
            startingRange.add(nums[0]);
            startingRange.add(nums[0]);
            ranges.add(startingRange);
            numRanges++;
            List<String> rangesString = stringifyRangeList(ranges);
            return rangesString;
        }
        if(nums.length == 2) {
            if(nums[0] != nums[1] - 1) {
                startingRange.add(nums[0]);
                startingRange.add(nums[0]);
                ranges.add(startingRange);
                ArrayList<Integer> secondRange = new ArrayList<Integer>();
                secondRange.add(nums[1]);
                secondRange.add(nums[1]);
                ranges.add(secondRange);
                numRanges = 2;
                //return ranges;
            } else {
                startingRange.add(nums[0]);
                startingRange.add(nums[1]);
                ranges.add(startingRange);
                numRanges++;
                //return ranges;
            }
            //System.out.println("Ranges: " + Arrays.toString(ranges.toArray()));
            List<String> rangesString = stringifyRangeList(ranges);
            return rangesString;
        }

        startingRange.add(nums[0]);
        numRanges++;
        ranges.add(startingRange);
        for(int i = 1; i < nums.length - 1; i++) {
            if(nums[i - 1] != nums[i] - 1) {
                ranges.get(numRanges - 1).add(nums[i - 1]);
                ArrayList<Integer> range = new ArrayList<Integer>();
                range.add(nums[i]);
                ranges.add(range);
                numRanges++;
            }
        }
        if(nums[nums.length - 2] != nums[nums.length - 1] - 1) {
            ranges.get(numRanges - 1).add(nums[nums.length - 2]);
            ArrayList<Integer> range = new ArrayList<Integer>();
            range.add(nums[nums.length - 1]);
            range.add(nums[nums.length - 1]);
            ranges.add(range);
            numRanges++;
        } else {
            ranges.get(numRanges - 1).add(nums[nums.length - 1]);
        }
        //System.out.println("Ranges: " + Arrays.toString(ranges.toArray()));
        //return ranges;
        List<String> rangesString = stringifyRangeList(ranges);
        return rangesString;
    }

    public List<String> stringifyRangeList(List<ArrayList<Integer>> ranges) {
        List<String> stringifiedList = new ArrayList<String>();
        for(int i = 0; i < ranges.size(); i++) {
            ArrayList<Integer> range = ranges.get(i);
            String s = range.get(0).toString();
            if(!range.get(0).equals(range.get(1)))
                s = range.get(0).toString() + "->" + range.get(1).toString();
            stringifiedList.add(s);
        }
        
        return stringifiedList;
    }
}
