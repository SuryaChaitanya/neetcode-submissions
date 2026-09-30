class Solution {
    public int search(int[] nums, int target) {
        // int result = Arrays.binarySearch(nums, target);
        // return result < 0 ? -1 : result;
        return binarySearch(nums, target, 0, nums.length-1);
    }

    private int binarySearch(int[] nums, int target, int i, int j) {
        int mid = i+(j-i)/2;
        if (i > j){
            return -1;
        }
        if (nums[mid] == target)
            return mid;
        else if (nums[mid] > target)
            return binarySearch(nums, target, i, mid-1);
        else
            return binarySearch(nums, target, mid+1, j);
    }
}
