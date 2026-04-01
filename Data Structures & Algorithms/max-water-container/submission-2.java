class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int maxWater = 0;
        int lp = 0, rp = n-1;
        while(lp < rp) {
            int width = rp - lp;
            int h = Math.min(height[lp],height[rp]);
            int area = h * width;
            maxWater = Math.max(maxWater,area);
            if(height[lp] < height[rp]) {
                lp++;
            } else {
                rp--;
            }
        }
        return maxWater;
    }    
}