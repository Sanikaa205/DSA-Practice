class Solution {
    public int singleNumber(int[] nums) {
        int result =0;
        for(int num : nums)
        {
            result ^=num; 
        
        }
        return result;
    }
}

//dry run for [4,1,2,1,2]
//result =0;
//0^4 =4    1st iteration
//4^1 keep as its is as resulr  2nd iteration
//4^1^2 same kepp as it is    3rd iteration
//4^1^2^1 now use XOR property of can change sequence 
//1^1 =0  -> 4^2  keep as it is  
//4^2^2  iteration 5
//2^2 =0 
//remaing no. in result is 4 
