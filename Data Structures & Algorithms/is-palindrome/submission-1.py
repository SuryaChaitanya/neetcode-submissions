class Solution:
    def isPalindrome(self, s: str) -> bool:
        s = s.lower()
        given = ''
        for c in s:
            if ((c >='a' and c<='z') or (c>='0' and c<='9')):
                given = given + c
        print(given)
        print(given[::-1])
        if given == given[::-1]:
            return True
        return False
        