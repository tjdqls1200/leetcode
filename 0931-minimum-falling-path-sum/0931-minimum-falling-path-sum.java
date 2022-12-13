class Solution {
    public int minFallingPathSum(int[][] matrix) {
        // n x n matrix
        int n = matrix.length;
        
        for (int y = 1; y < n; y++) {
            for (int x = 0; x < n; x++) {
                int middle = matrix[y - 1][x];
                int sideMin = Math.min(
                    matrix[y - 1][Math.max(0, x - 1)], 
                    matrix[y - 1][Math.min(n - 1, x + 1)]
                );
                
                matrix[y][x] += Math.min(middle, sideMin);
            }
        }
        
        return Arrays.stream(matrix[n - 1]).min().getAsInt();
    }
}
