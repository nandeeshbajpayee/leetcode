class Solution {
    int count = 0;

    public int totalNQueens(int n) {
        boolean[] columns = new boolean[n];
        boolean[] diagonal1 = new boolean[2 * n - 1];
        boolean[] diagonal2 = new boolean[2 * n - 1];
        backtrack(0, n, columns, diagonal1, diagonal2);
        return count;
    }

    private void backtrack(int row, int n, boolean[] columns, boolean[] diagonal1, boolean[] diagonal2) {
        if (row == n) {
            count++;
            return;
        }

        for (int col = 0; col < n; col++) {
            int d1 = row - col + n - 1;
            int d2 = row + col;

            if (!columns[col] && !diagonal1[d1] && !diagonal2[d2]) {
                columns[col] = true;
                diagonal1[d1] = true;
                diagonal2[d2] = true;
                backtrack(row + 1, n, columns, diagonal1, diagonal2);
                columns[col] = false;
                diagonal1[d1] = false;
                diagonal2[d2] = false;
            }
        }
    }
}







































