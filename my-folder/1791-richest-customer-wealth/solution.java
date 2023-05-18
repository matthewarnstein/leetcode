class Solution {
    public int maximumWealth(int[][] accounts) {
        int richestCustomerIndex = 0;
        int richest = 0;
        

        for (int i = 0; i < accounts.length; i++) {
            int customerWealth = 0;

            for (int j = 0; j < accounts[i].length; j++) {
                customerWealth += accounts[i][j];
            }

            if (customerWealth >= richest) {
                richest = customerWealth;
                richestCustomerIndex = i;
            }

        }
        return richest;
    }
}
