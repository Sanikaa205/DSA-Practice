class Solution {
    public long sumAndMultiply(int n) {
       int x = 0;
       long sum = 0;
       int place =1;
       while(n > 0)
       {
        int digit = n%10;
        if(digit != 0)
        {
            sum = sum + digit;
            x = digit * place + x;
            place = 10*place;
        }
        n = n/10;
       }  
       long result = sum *x;
       return result;     
    }
}