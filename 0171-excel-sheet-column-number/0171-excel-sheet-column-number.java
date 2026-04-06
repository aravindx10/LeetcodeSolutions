class Solution {
    public int titleToNumber(String columnTitle) {
        int sum= 0;
        int l = columnTitle.length();
        for(int i = 0 ; i < columnTitle.length() ;i++)
        {
         sum = sum +   (columnTitle.charAt(i)-'A'+1 ) * (int) (Math.pow(26,--l));
       
        }
         
        return sum;
    }
}