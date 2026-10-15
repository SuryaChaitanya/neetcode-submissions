class Solution {

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> cur = new ArrayList<>();
        backtrack(candidates, target, 0, result, cur);
        return result;
    }

    public void backtrack(int[] nums, int remaining, int index, List<List<Integer>> result, List<Integer> cur) {
        if (remaining == 0) {
            result.add(new ArrayList<>(cur));
            return;
        }

        if (remaining < 0 || index >= nums.length) {
            return;
        }

        cur.add(nums[index]);
        backtrack(nums, remaining-nums[index], index+1, result, cur);
        cur.remove(cur.size()-1);
        while (index+1 < nums.length && nums[index] == nums[index+1])
            index++;
        backtrack(nums, remaining, index+1, result, cur);

    }
}
