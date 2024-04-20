class Solution {
    public int numberCount(int a, int b) {
        int total = 0;
        for (int i = a; i <= b; i++) {
            if (i < 10) {
                total++;
            } else if (i >= 10 && i < 100) {
                if ((i / 10) != (i % 10) )
                    total++;
            } else if (i >= 100 && i < 1000) {
                int hundreds = i / 100;
                int tens = (i / 10) % 10;
                int ones = i % 10;
                if (hundreds != tens && hundreds != ones && tens != ones)
                    total++;
            }
        }
        return total;
    }
}
