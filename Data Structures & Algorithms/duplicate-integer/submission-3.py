class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        count = {}
        for i in nums:
            if count.get(i):
                return True
            else:
                count[i] = 1
        return False