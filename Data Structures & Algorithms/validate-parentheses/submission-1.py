class Solution:
    def isValid(self, s: str) -> bool:
        stack = []
        Map = {
           ")" : "(",
           "]" : "[",
           "}" : "{"
        }
        for i in s:
            if i not in Map:
                stack.append(i)
                continue
            if stack and stack[-1] == Map[i]:
                stack.pop()
            else:
                return False
        return not stack