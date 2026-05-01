class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        int len = nums.length;

        for(int i = 0; i < len - 2; i++){
            if(i > 0 && nums[i] == nums[i - 1]) continue;

            for(int j = i + 1; j < len - 1; j++){
                if(j > i + 1 && nums[j] == nums[j - 1]) continue;

                for(int k = j + 1; k < len; k++){
                    if(k > j + 1 && nums[k] == nums[k - 1]) continue;

                    if(nums[i] + nums[j] + nums[k] == 0){
                        List<Integer> val = new ArrayList<>();
                        val.add(nums[i]);
                        val.add(nums[j]);
                        val.add(nums[k]);
                        list.add(val);
                    }
                }
            }
        }
        return list;
    }
}