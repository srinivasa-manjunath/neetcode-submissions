class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        
        anagram = {}

        if len(s) != len(t):
            return False
        
        for x in s:
            if x not in anagram:
                anagram[x] = 1
            else:
                anagram[x] += 1
        
        for y in t:
            if y not in anagram:
                return False
            anagram[y] -= 1

            if anagram[y] < 0:
                return False
        return True