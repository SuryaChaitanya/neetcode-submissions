class Solution {
    public boolean hasDuplicate(int[] nums) {
        //return hashSetHasDuplicate(nums);
        return bruteForce(nums);
    }

    private boolean hashSetHasDuplicate(int[] nums){
        HashSet<Integer> duplicate = new HashSet<>();
        for (int num:nums){
            if (duplicate.contains(num)){
                return true;
            }
            duplicate.add(num);
        }
        return false;
    }

    private boolean bruteForce(int[] nums){
        for (int i = 0; i< nums.length; i++){
            for (int j=i+1;j<nums.length;j++){
                if (nums[i] == nums[j])
                    return true;
            }
        }
        return false;
    }
}