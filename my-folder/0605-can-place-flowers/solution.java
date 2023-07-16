class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        // i=0 && n=1 && flowerbed[0]=0 && flowerbed[1]=0
        // i=0 && n>=2 && flowerbed[0]=0 && flowerbed[1]=0
        // i>0 && flowerbed[i]=0 && flowerbed[i-1]=0 && flowerbed[i+1]=0
        int count = n;
        if(n == 0)
            return true;

        if(flowerbed.length == 1) {
            if(n == 1 && flowerbed[0] == 0)
                return true;
            else
                return false;
        }

        if(flowerbed.length == 2) { 
            if (n == 1 && flowerbed[0] == 0 && flowerbed[1] == 0)
                return true;
            else
                return false;
        }

        if (flowerbed[0] == 0 && flowerbed[1] == 0) {
            flowerbed[0] = 1;
            count--;
        }
        for(int i = 1; i < flowerbed.length - 1; i++) {
            if(flowerbed[i - 1] == 0 && flowerbed[i] == 0 && flowerbed[i + 1] == 0) {
                flowerbed[i] = 1;
                count--;
            }
        }
        if(flowerbed[flowerbed.length - 2] == 0 && flowerbed[flowerbed.length - 1] == 0) {
            flowerbed[flowerbed.length - 1] = 1;
            count--;
        }

        if (count > 0)
            return false;
        else
            return true;
    }
}
