import java.util.HashMap;

class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int minSum = Integer.MAX_VALUE;
        HashMap<String, Integer> memo = new HashMap<>();

        for (int j = 0; j < matrix.length; j++) {
            minSum = Math.min(minSum, helper(matrix, 0, j, memo));
        }

        return minSum;
    }

    private int helper(int[][] matrix, int i, int j, HashMap<String, Integer> memo) {
        if (i >= matrix.length) {
            return 0;
        }

        String key = i + "-" + j;
        if (memo.containsKey(key)) {
            return memo.get(key);
        }

        int sum = matrix[i][j];
        int nextRow = i + 1;

        int left = (j > 0) ? helper(matrix, nextRow, j - 1, memo) : Integer.MAX_VALUE;
        int straight = helper(matrix, nextRow, j, memo);
        int right = (j < matrix.length - 1) ? helper(matrix, nextRow, j + 1, memo) : Integer.MAX_VALUE;

        int result = sum + Math.min(left, Math.min(straight, right));

        memo.put(key, result);
        return result;
    }
}
