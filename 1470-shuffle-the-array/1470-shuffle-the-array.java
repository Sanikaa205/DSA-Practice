class Solution {
    public int[] shuffle(int[] nums, int n) {
        
        int i = 0;
        int j = n;
        int k = 0;
        int []result = new int[nums.length];

        while(i < n)
        {
            result[k] = nums[i];
            result[k+1]= nums[j];

            i++;
            j++;
            k=k+2;
        }
        return result;
   
    }
}