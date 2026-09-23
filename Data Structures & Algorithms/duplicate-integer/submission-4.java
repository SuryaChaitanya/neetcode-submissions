class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer, Integer> duplicate = new HashMap<>();
        for(int num:nums){
            if(duplicate.containsKey(num)){
                return true;
            }
            duplicate.put(num,1);
        }
        return false;
    }
}