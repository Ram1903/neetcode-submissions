class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> counts = new HashMap<>();
        for (int num : nums) {
            counts.put(num, counts.getOrDefault(num, 0) + 1);
        }
        List<Integer> list = new ArrayList<>(counts.keySet());
        list.sort((a, b) -> counts.get(b) - counts.get(a));

        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = list.get(i);
        }

        return res;
    }
}