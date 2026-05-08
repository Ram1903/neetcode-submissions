class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {

        List<Integer> list = new ArrayList<>();

        for (int i=0; i<=nums.length-k; i++) {
            int[] subArr = Arrays.copyOfRange(nums,i,i+k);
            list.add(Arrays.stream(subArr).max().getAsInt());
        }
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }
}