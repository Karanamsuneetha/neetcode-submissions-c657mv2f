class Solution {
    public int maxArea(int[] heights) {
        int n = heights.length;
        int maxWater = 0;
        for(int i=0;i<n;i++) {
            for(int j=i+1;j<n;j++) {
                int width = j-i;
                int h = Math.min(heights[i],heights[j]);
                int area = width * h;
                maxWater = Math.max(maxWater,area);
            }
        }
        return maxWater;
    }
}
