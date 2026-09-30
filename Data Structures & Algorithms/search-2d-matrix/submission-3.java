class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int col = matrix[0].length;
        int row = matrix.length;
        int x = binaryColumnSearch(matrix, target, 0, row-1);
        if (x<0)
            return false;
        int y = binaryRowSearch(matrix, target, 0, col-1, x);
        return y!=-1;
    }

    private  int binaryColumnSearch(int [][] nums, int target, int i , int j) {
        int mid = i+(j-i)/2;
        if (i>j){
            return j;
        }
        if (nums[mid][0] == target) {
            return mid;
        }
        else if (nums[mid][0] < target)
            return binaryColumnSearch(nums, target, mid+1, j);
        else
            return binaryColumnSearch(nums, target, i, mid-1);
    }

    private  int binaryRowSearch(int[][] nums, int target, int i, int j, int row) {
        int mid = i+(j-i)/2;
        if (i > j){
            return -1;
        }
        if (nums[row][mid] == target)
            return mid;
        else if (nums[row][mid] > target)
            return binaryRowSearch(nums, target, i, mid-1, row);
        else
            return binaryRowSearch(nums, target, mid+1, j, row);
    }
}
