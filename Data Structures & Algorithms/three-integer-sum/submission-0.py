class Solution:
    def threeSums(self, nums: List[int]) -> List[List[int]]:
        maps = {}
        result = set()
        nums.sort()
        for i in range(0,len(nums)):
            maps[nums[i]] = i
        for i in range(0,len(nums)):
            for j in range(i+1,len(nums)):
                val = maps.get(-(nums[i]+nums[j]))
                #if val: print(nums[val],nums[i],nums[j])
                if val:
                    
                    l = [nums[i],nums[j],nums[val]]
                    result.add(tuple(l))
        return [list(i) for i in result]

    def threeSum(self, nums: List[int]) -> List[List[int]]:
        res = set()
        nums.sort()
        for i in range(len(nums)):
            for j in range(i + 1, len(nums)):
                for k in range(j + 1, len(nums)):
                    if nums[i] + nums[j] + nums[k] == 0:
                        tmp = [nums[i], nums[j], nums[k]]
                        res.add(tuple(tmp))
        return [list(i) for i in res]

            



