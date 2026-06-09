class Solution {
    public int largestRectangleArea(int[] heights) {
        int max = 0;

        for (int i = 0; i < heights.length; i++) {
            int min = heights[i];

            for (int j = i; j < heights.length; j++) {
                // track minimum height in range [i, j]
                min = Math.min(min, heights[j]);

                // correct width
                int width = j - i + 1;

                int ans = min * width;

                max = Math.max(max, ans);
            }
        }

        return max;
    }
}
