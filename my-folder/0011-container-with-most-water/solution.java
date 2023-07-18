import java.lang.*;

class Solution {
    public int maxArea(int[] height) {
        return maxAreaSol5(height);
    }


    public int maxAreaSol5(int[] height) {
        int max = 0;
        int i = 0;
        int j = height.length - 1;

        while(i < j) {
            int area = calculateArea(height,i,j);
            if(area > max)
                max = area;
            if(height[i] < height[j])
                i++;
            else
                j--;
        }
        return max;
    }

    public int calculateArea(int[] height, int i, int j) {
        int area = 0;
        if (i >= j)
            return area;
        else {
            int h = Math.min(height[i], height[j]);
            int w = j - i;
            area = h * w;
        }
        return area;
    }

/*
    public int maxAreaSol4(int[] height) {
        int max = 0;

        for(int i = 0; i < height.length - 1; i++) {
            for(int j = i + 1; j < height.length; j++) {
                int area = calculateArea(height, i, j);
                if(area > max)
                    max = area;
            }
        }
        return max;
    }

    public int maxAreaSol3(int[] height) {
        int i = 0;
        int j = height.length - 1;
        int max_i = i;
        int max_j = j;
        int max = calculateArea(height, i, j);

        while(i < j) {
            if( height[i + 1] > height[i] ) {
                
                //calculateArea(height, i + 1, j) > 
                //calculateArea(height, i, j - 1) ) {
                    
                i++;
                    
            }
            if( height [j - 1] > height[j])
                j--;
            }
            if(calculateArea(height, i, j) > max)
                max = calculateArea(height, i, j);
        }

        return max;
    }

    public int maxAreaSol2(int[] height) {
        int n = height.length;
        if (n == 2)
            return Math.min(height[0],height[1]);

        int l = 0;
        int r = height.length - 1;
        int[] endpoints = {l, r};
        int max = Math.min(height[endpoints[0]], height[endpoints[1]]) * (endpoints[1] - endpoints[0]);

        while (l < r) {
            int cap = Math.min(height[l], height[r]) * (r - l);
            if (cap > max) {
                max = cap;
                endpoints[0] = l;
                endpoints[1] = r;
            }
            //int cap_l = Math.min(height[l + 1], height[r]) * (r - l - 1);
            //int cap_r = Math.min(height[l], height[r - 1]) * (r - l - 1);
            if (Math.max(height[l + 1], height[r]) > Math.max(height[l], height[r - 1]) &&
                Math.min(height[l + 1], height[r]) * (r - l - 1) > Math.min(height[l], height[r - 1]) * (r - l - 1)
            )
            //if (height[l + 1] < height[r])
                l++;
            else
                r--;
        }


        return max;
    }






    public int maxAreaSol1(int[] height) {

        int n = height.length;
        if (n == 2)
            return Math.min(height[0],height[1]);


        int max = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                int cap = Math.min(height[i], height[j]) * (j - i);
                if (cap > max) {
                    max = cap;
                }
            }
        }

        return max;
    }
*/
}

