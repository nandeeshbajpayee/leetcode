class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int[] arr = new int[1001];
        Arrays.fill(arr, 0);

        for (int n : nums1) {
            arr[n]++;
        }

        List<Integer> list = new ArrayList<>();
        for (int n : nums2) {
            if (arr[n] > 0) {
                list.add(n);
                arr[n] = 0; // Mark as visited
            }
        }

        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }
}
