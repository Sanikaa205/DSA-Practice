class Solution {
    public boolean checkDivisibility(int n) {

        int sum = 0;
        int pro = 1;
        int og = n;
        while(n>0)
        {
            int num = n%10;
            sum = sum + num;
            pro = pro*num;
            n = n/10;
        }

        if(og % (sum+pro) == 0) {
            return true;
        }
        return false;

        
    }
}