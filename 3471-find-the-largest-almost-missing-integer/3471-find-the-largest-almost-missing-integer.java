class Solution {
    public int largestInteger(int[] nums, int k) {

        int n = nums.length;
        int j = nums[n-1];
        int i = nums[0];

        HashMap<Integer , Integer> map = new HashMap<>();
        for(int num:nums)
        {
            if(map.containsKey(num))
            {
                 map.put(num,map.get(num)+1);
            }
            else{
                map.put(num,1);
            }
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
                if(map.get(num) == 1)
                {
                ans = Math.max(ans,num);
                }
            }
            return ans;
        }

        //remaining

        if (map.get(i) == 1 && map.get(j) == 1) 
        {
            return Math.max(i, j);
        }    
        else if(map.get(j) == 1)
        {
            return j;

        }
        else if(map.get(i) == 1)
        {
           return i; 
        }
        return -1;
    }
}