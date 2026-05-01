class Solution {
    public int maxArea(int[] heights) {
        int max=0;
        int len=heights.length;
        for(int i=0;i<len;i++){
            int val=0;
            int diff=0;
            for(int j=0;j<len;j++){

                if(i!=j){
                    if(i<j){
                        diff=j-i;
                    }else{
                        diff=i-j;
                    }
                    val=Math.min(heights[i],heights[j]);
                    
                    val=val*diff;
                    if(max<val){
                        max=val;
                    }
                }
                val=0;
            }
        }
        return max;
    }
}
