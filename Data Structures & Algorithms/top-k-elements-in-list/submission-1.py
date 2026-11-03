class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        
        seen = {}

        for i in nums:
            if i not in seen:
                seen[i] = 1
            else:
                seen[i] += 1
        
        buckets = []

        for _ in range(len(nums) + 1):
            buckets.append([])
        
        for key, value in seen.items():
            buckets[value].append(key)
        
        result = []

        for i in range(len(buckets) - 1, 0, -1):
            for num in buckets[i]:
                result.append(num)
                if len(result) == k:
                    return result