class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        total=0
        maximum=nums[0]
        for num in nums:
            total+=num
            maximum=max(total,maximum)

            if total<0:
                total=0
        return maximum