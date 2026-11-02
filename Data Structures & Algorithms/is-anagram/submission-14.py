class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        
        anagram1 = {}

        if len(s) != len(t):
            return False
        
        for x in s:
            if x in anagram1:
                anagram1[x] += 1
            else:
                anagram1[x] = 1
        
        for y in t:
            if y not in anagram1:
                return False
            else:
                anagram1[y] -= 1

            if anagram1[y] < 0:
                return False
        return True

