class Solution {
    public int smallestNumber(int n, int t) {

        for(int i = n ; i <1000 ;i++)
        {
            int pro = 1;
            int num = i;

            while(num > 0)
            {
                int digit = num % 10;
                pro = pro*digit;
                num = num/10;
            }

            if(pro%t == 0) return i;

        }

        return 0;
    }
}