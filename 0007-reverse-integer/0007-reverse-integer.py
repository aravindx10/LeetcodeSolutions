class Solution:
    def reverse(self, x: int) -> int:
        negative = x<0
        x=abs(x)

        result=0
        while x>0:
            unit_digit=x%10
            result=result*10+unit_digit
            x=x//10
        if negative:
            result=(-1)*result
        if result < -(2**31) or result > 2**31-1:
                return 0
        return result
