class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
       set_value=set(nums)
       if len(set_value)!= len(nums):
        return True
       else:
        return False