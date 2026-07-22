class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
       set_value=set(nums)
       return  len(set_value)!= len(nums)
       