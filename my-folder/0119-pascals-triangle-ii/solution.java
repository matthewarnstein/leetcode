class Solution {

    public List<Integer> getRow(int rowIndex) {

        List<List<Integer>> triangle = new ArrayList<List<Integer>>(rowIndex + 1);
        ArrayList<Integer> first = new ArrayList<Integer>();
        first.add(1);
        triangle.add(first);
        for (int i = 1; i < rowIndex + 1; i++) {
            triangle.add(getTriangleEntry(i,triangle.get(i - 1)));
        }
        return triangle.get(triangle.size() - 1);
        //return getTriangleEntry(rowIndex,triangle.get(rowIndex - 1));
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

