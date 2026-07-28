class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {

        List<Integer> ans = new ArrayList<>();
        for(int i = 0; i<nums.length;i++)
        {
            int cindex = nums[i]-1;
            
            while(nums[i] !=nums[cindex])
            {
                int temp = nums[cindex];
                nums[cindex]=nums[i];
                nums[i]=temp;

                cindex = nums[i] - 1;
            }

        }

        for(int i = 0; i<nums.length;i++)
        {
          if(nums[i] != i+1)
            {
                ans.add(i+1);
            }
        }

        return ans;
    }
}