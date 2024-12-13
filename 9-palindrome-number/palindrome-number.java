class Solution 
{
    public boolean isPalindrome(int x) 
    {
       String str=Integer.toString(x);
       if(x<0)
       {
        return false;
       }
       int len=str.length();
       for(int i=0;i<len/2;i++)
       {
        if(str.charAt(i)!=str.charAt(len-i-1))
        {
            return false;
        }
       }
       return true;
        
    }
}