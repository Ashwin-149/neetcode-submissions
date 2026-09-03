class Solution:
    def isPalindrome(self, s: str) -> bool:
        
        s = "".join(ch.lower() for ch in s if ch.isalnum())
        size = len(s)
        f = 0
        l = size - 1
        for i in range(size//2):
            if s[f] != s[l]:
                return False
            f += 1
            l -= 1
        return True

            