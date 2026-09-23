class Solution:
    def isPalindrome(self, s: str) -> bool:
        left = 0
        
        s = s.strip().lower()
        s = s.replace(" ", "")
        right = len(s) - 1
        print(s)
        while left < right:
            if not self.isalphanum(s[left]):
                left+=1
                continue
            if not self.isalphanum(s[right]):
                right-=1
                continue
            if s[left] != s[right]:
                return False
            else:
                left+=1
                right-=1
        return True

    def isalphanum(self,char):
        if ord('A') <= ord(char) <= ord('Z'):
            return True
        elif ord('a') <= ord(char) <= ord('z'):
            return True
        elif ord('0') <= ord(char) <= ord('9'):
            return True
        return False