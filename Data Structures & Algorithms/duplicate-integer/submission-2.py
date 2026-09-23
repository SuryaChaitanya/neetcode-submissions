class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        hashmap = {}
        for x in nums:
            if x in hashmap:
                hashmap[x]+=1
                return True
            else:
                hashmap[x]=1
        return False