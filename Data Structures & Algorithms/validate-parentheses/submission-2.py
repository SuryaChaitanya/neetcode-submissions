class Solution:
    def isValid(self, s: str) -> bool:
        stack = []
        for i in s:
            if stack and stack[-1] == self.invert(i):
                stack.pop()
            else:
                stack.append(i)
        return len(stack) == 0
    def invert(self, char) -> str:
        if char == ')':
            return '('
        elif char == '}':
            return '{'
        elif char == ']':
            return '['
        else:
            return None
    