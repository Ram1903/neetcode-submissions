class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len=nums.length;
        int result[]=new int[len];
        int product=1;
        for(int i=0;i<len;i++){
            for(int j=0;j<len;j++){
                if(i!=j){
                product=product*nums[j];
                }
            }
            result[i]=product;
            product=1;
        }
        return result;
    }
}  
