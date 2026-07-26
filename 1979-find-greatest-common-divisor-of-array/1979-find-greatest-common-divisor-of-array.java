class Solution {
    public int findGCD(int[] nums) {

        Arrays.sort(nums);
        int n = nums.length;
        int min = nums[0];
        int max = nums[n-1];

        while(min != 0)
        {
            int rem = max%min;
            max = min;
            min = rem;
        }

        return max;

        
    }
}