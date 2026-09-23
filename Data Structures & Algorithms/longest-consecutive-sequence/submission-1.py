class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        if not nums:
            return 0
        maxSize = -1
        result = []
        store = {nums[0]}
        for x in nums:
            store.add(x)
        
        for x in nums:
            if x-1 in store:
                continue
            else:
                s = 0
                r = []
                while x in store:
                    s += 1
                    r.append(x)
                    x+=1
                if maxSize < s:
                    result = r
                    maxSize = s
        print(result)
        return maxSize