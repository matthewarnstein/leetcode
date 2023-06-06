class Solution {
    public boolean isHappy(int n) {
        int happy = sumSquaresOfDigitis(n);
        int cycles = 1;
        while (happy != 1 && cycles < 100) {
            happy = sumSquaresOfDigitis(happy);
            cycles++;
        }
        if (happy == 1)
            return true;
        else    
            return false;
    }

    public int sumSquaresOfDigitis(int num) {
        String numStr = Integer.toString(num);
        int sum = 0;
        for(char c : numStr.toCharArray()) {
            int digit = Integer.parseInt(String.valueOf(c));
            sum += digit*digit;
        }

        return sum;
    }
}
