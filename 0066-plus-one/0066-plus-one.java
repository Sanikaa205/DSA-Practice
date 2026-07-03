class Solution 
{
    public int[] plusOne(int[] digits)
     {
       for (int i = digits.length-1;i>=0;i--)
        {
            while(digits[i] < 9)
            {
                digits[i]++;
                return digits;
            }

            digits[i] = 0;
        }

       int[] result = new int[digits.length+1];  // necessary for carry
       result[0]=1;
       return result; 

        
    }
}
