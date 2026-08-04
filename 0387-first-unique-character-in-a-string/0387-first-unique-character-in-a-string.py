class Solution:
    def firstUniqChar(self, s: str) -> int:
        freq={}
        for ch in s:
            if ch in freq:
                freq[ch]+=1
            else:
                freq[ch]=1

        for ch in s:
            if freq[ch]==1:
                return s.index(ch)
                break
        return -1