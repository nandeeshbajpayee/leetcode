
class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        subset(nums, 0, new ArrayList<>());
        return res;
    }

    public void subset(int[] nums, int start, List<Integer> curr) {
        res.add(new ArrayList<>(curr));
        for (int i = start; i < nums.length; i++) {
            if (i > start && nums[i] == nums[i - 1])
                continue;
            curr.add(nums[i]);
            subset(nums, i + 1, curr);
            curr.remove(curr.size() - 1);
        }
    }
}
