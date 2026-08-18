class Solution {
    public int largestInteger(int[] nums, int k) {

        int n = nums.length;
        int j = nums[n-1];
        int i = nums[0];
        int[] freq = new int[51];

         for (int num : nums) {
            freq[num]++;
        }
        //case 1
        if(k==n)
        {
            int ans = nums[0];
            for(int num : nums)
            {
                
                ans = Math.max(ans,num);
                
            }
            return ans;
        }
        //case2
        if(k==1)
        {
            int ans = -1;
            for(int num : nums)
            {
                if(freq[num] == 1)
                {
                ans = Math.max(ans,num);
                }
            }
            return ans;
        }

        //remaining

        if (freq[i] == 1 && freq[j] == 1) 
        {
            return Math.max(i, j);
        }    
        else if(freq[j] == 1)
        {
            return j;

        }
        else if(freq[i]== 1)
        {
           return i; 
        }
        return -1;
    }
}