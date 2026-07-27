class Solution {
    public int maximumProduct(int[] nums) {

        int m1 = Integer.MIN_VALUE;
        int m2 = Integer.MIN_VALUE;
        int m3 = Integer.MIN_VALUE;
        int l1 = Integer.MAX_VALUE;
        int l2 = Integer.MAX_VALUE;

        for(int n : nums)
        {
            if(n > m1)
            {
                m3 = m2;
                m2 = m1;
                m1 = n;
            }
            else if(n > m2)
            {
                m3 = m2;
                m2 = n;
            }
            else if(n > m3)
            {
                m3 = n;
            }

            if(n < l1)
            {
                l2 = l1;
                l1 = n;
            
            }
            else if(n < l2)
            {
                l2 = n;
            }
        }

        return Math.max(m1*m2*m3 , l1*l2*m1);
        
    }
}