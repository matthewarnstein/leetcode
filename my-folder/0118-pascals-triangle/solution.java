class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<List<Integer>>(numRows);
        ArrayList<Integer> first = new ArrayList<Integer>();
        first.add(1);
        triangle.add(first);
        for (int i = 1; i < numRows; i++) {
            triangle.add(getTriangleEntry(i,triangle.get(i - 1)));
        }
        return triangle;
    }


    public List<Integer> getTriangleEntry(int row, List<Integer> prev) {
        List<Integer> entry = new ArrayList<Integer>(row);

        entry.add(prev.get(0));
        for (int i = 1; i < row; i++) {
            entry.add(prev.get(i - 1) + prev.get(i));
        }
        entry.add(prev.get(row - 1));

        return entry;

    }
}
