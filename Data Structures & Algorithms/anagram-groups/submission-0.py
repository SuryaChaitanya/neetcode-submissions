class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        hashmap = {}
        for s in strs:
            l = hashmap.get(tuple(self.getKey(s)), [])
            l.append(s)
            hashmap[tuple(self.getKey(s))] = l
            
        return list(hashmap.values())

    def getKey(self, s):
        key = [0 for x in range(26)]
        #print (key)
        for x in s:
            key[ord(x)-97] += 1

        return key