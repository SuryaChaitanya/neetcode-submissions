class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        #[1,2,2,2,3,3,3,3,5,5,8,8,8] - sorted
        #[[1,1][2,3][3,4][5,2][8,3]]
        #sort by 2nd number. 
        nums.sort()
        count = {}
        for x in nums:
            count[x] = count.get(x,0) + 1
        freq = []
        for x,y in count.items():
            freq.append((y,x))
        freq = sorted(freq, reverse=True)
        result = []
        for i in range(k):
            result.append(freq[i][1])
        return result
        

            