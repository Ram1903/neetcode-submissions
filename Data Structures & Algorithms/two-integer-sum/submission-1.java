class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        //2nd solution
        Map<Integer, Integer> differenceMap=new HashMap<>();
        int arr[]=new int[2];

        for(int i=0;i<nums.length;i++){
            int difference=target-nums[i];
            if(differenceMap.containsKey(difference)){
                return new int[] {differenceMap.get(difference),i};
            }
            differenceMap.put(nums[i],i);
        }
        return arr;


        // //1st solution
        // int arr[]=new int[2];
        // for(int i=0;i<nums.length;i++){
        //     for(int j=0;j<nums.length;j++){
        //         if(i!=j && nums[i]+nums[j]==target){
        //             arr[0]=i;
        //             arr[1]=j;
        //             return arr;
        //         }
        //     }
        // }
        // return arr;

    }
}
