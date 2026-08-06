class Solution {
    public boolean uniqueOccurrences(int[] arr) {

        HashMap<Integer , Integer > map = new HashMap<>();

        for(int n : arr)
        {
            if(map.containsKey(n))
            {
                map.put(n,map.get(n)+1);
            }
            else{
                map.put(n,1);
            }
        }
        
        HashSet<Integer> set = new HashSet<>();

        for(int n : map.values())
        {
            if(set.contains(n))
            {
                return false;
            }
            else{
                set.add(n);
            }
        }
        return true;
        
    }
}