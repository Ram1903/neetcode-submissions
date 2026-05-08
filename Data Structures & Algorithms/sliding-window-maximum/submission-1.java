class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {

        List<Integer> list = new ArrayList<>();

        //iterate nums array upto nums-k
        for (int i=0; i<=nums.length-k; i++) {

            //using copyOfRange to get SubArray
            int[] subArr = Arrays.copyOfRange(nums,i,i+k);

            //get Max Element From SubArray
            list.add(Arrays.stream(subArr).max().getAsInt());
        }
        int[] result = new int[list.size()];

        //converting ArrayList To List
        for (int i=0; i<list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }
}