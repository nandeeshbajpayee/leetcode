class Solution {
    public List<Integer> getRow(int rowIndex) {
      List<Integer> row = new ArrayList<>(rowIndex + 1);
        
        // Initialize the row with 1's
        for (int i = 0; i <= rowIndex; i++) {
            row.add(1);
        }
        
        // Update the row in place
        for (int i = 1; i < rowIndex; i++) {
            for (int j = i; j > 0; j--) {
                row.set(j, row.get(j) + row.get(j - 1));
            }
        }
        
        return row;  
    }
}