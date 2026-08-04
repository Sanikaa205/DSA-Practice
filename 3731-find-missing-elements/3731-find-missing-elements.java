class Solution {
    public List<Integer> findMissingElements(int[] nums) {

        HashSet<Integer> set = new HashSet<>();
        List<Integer> ans = new ArrayList<>();

        int min = nums[0];
        int max = nums[0];

        for(int n :nums)
        {
            set.add(n);

            if(n < min)
            {
                min = n;
            }
            if(n > max)
            {
                max = n;
            }
        }

        for(int i = min; i < max+1 ;i++)
        {
            if(!set.contains(i))
            {
                ans.add(i);
            }
        }

        return ans;
        
    }
}