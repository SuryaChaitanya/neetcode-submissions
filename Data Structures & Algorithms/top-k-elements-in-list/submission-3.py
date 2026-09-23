class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        count ={}
        for x in nums:
            count[x] = 1 + count.get(x,0)
        
        # freq cannot be more than length of nums

        freq = [[] for i in range(len(nums) + 1)]

        for key,val in count.items():
            freq[val].append(key)
        print(freq)
        result = []
        counter = 0
        for i in range(len(freq)-1, 0, -1):
            for x in freq[i]:
                result.append(x)
                counter += 1
                if counter == k:
                    return result
                
        return result