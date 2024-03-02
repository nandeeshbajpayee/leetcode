class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int i = 0;
        int j = n - 1;
        int k = n - 1;
        
        while (i <= j) {
            int squareI = nums[i] * nums[i];
            int squareJ = nums[j] * nums[j];
            
            if (squareI > squareJ) {
                result[k--] = squareI;
                i++;
            } else {
                result[k--] = squareJ;
                j--;
            }
        }
        
        return result;
    }
}
