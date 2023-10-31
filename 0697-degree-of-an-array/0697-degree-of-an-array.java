class Solution {
    public int findShortestSubArray(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        Map<Integer, Integer> leftIndex = new HashMap<>();
        Map<Integer, Integer> elementCount = new HashMap<>();
        int maxDegree = 0;
        int minLength = 0;

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            leftIndex.putIfAbsent(num, i);
            elementCount.put(num, elementCount.getOrDefault(num, 0) + 1);

            if (elementCount.get(num) > maxDegree) {
                maxDegree = elementCount.get(num);
                minLength = i - leftIndex.get(num) + 1;
            } else if (elementCount.get(num) == maxDegree) {
                minLength = Math.min(minLength, i - leftIndex.get(num) + 1);
            }
        }

        return minLength;
    }
}