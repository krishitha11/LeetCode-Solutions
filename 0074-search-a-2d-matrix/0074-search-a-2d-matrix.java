class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
		int n = matrix[0].length;

		int low = 0;
		int high = m * n - 1;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			int row = mid / n;
			int col = mid % n;
			int newmid = matrix[row][col];

			if (target == newmid) {
				return true;
			} else if (newmid > target) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
return false;
    }
}