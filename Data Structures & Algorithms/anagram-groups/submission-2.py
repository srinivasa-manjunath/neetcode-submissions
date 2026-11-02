class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        
        anagrams_dict = {}

        for s in strs:
            count = [0]*26
            for c in s:
                count[ord(c) - ord('a')] += 1
            
            key = tuple(count)
            
            if key not in anagrams_dict:
                anagrams_dict[key] = []
            anagrams_dict[key].append(s)

        return list(anagrams_dict.values())