class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if (len(s) != len(t)):
            return False
        dict1 = {}
        dict2 = {}
        for i in range(len(s)):
            dict1[s[i]] = dict1[s[i]]+1 if s[i] in dict1 else 1;
            # if s[i] in dict1:
            #     dict1[s[i]]+=1
            # else:
            #     dict1[s[i]]=1
            dict2[t[i]] = dict2[t[i]]+1 if t[i] in dict2 else 1;
            # if t[i] in dict2:
            #     dict2[t[i]]+=1
            # else:
            #     dict2[t[i]]=1
        for key in dict1:
            if key not in dict2 or dict2[key] != dict1[key]:
                return False
            # elif dict2[key] != dict1[key]:
            #     return False
        return True
        