class Solution {
    public int search(int[] nums, int target) {
        int result = Arrays.binarySearch(nums, target);
        return result < 0 ? -1 : result;
    }
}
