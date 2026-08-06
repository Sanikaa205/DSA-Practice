class Solution {
    public int sumOfUnique(int[] nums) {
        
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int n : nums)
        {
           if(map.containsKey(n))
            {
                map.put(n, map.get(n) + 1);
            }
            else
            {
                map.put(n, 1);
            }
        }

        int sum = 0;

        for(int key : map.keySet())
        {
            if(map.get(key) == 1)
            {
                sum = sum + key;
            }
        }
        return sum;

        
    }
}