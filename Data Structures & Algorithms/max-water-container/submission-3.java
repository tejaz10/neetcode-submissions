class Solution {
    public int maxArea(int[] heights) {
        int left = 0, right = heights.length - 1, res = 0;
        while(left < right){
            res = Math.max(res, Math.min(heights[left],heights[right]) * (right - left));
            if(heights[left] > heights[right]) right--;
            else left++;
        }
        return res;
    }
}
