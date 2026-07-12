class Solution {
    public int[] arrayRankTransform(int[] arr) {

        int[]copy = Arrays.copyOf(arr,arr.length);
        Arrays.sort(copy);

         HashMap<Integer, Integer> map = new HashMap<>();

        int rank=1;
        
            for(int i =0 ; i< copy.length ; i++)
            {
                if(!map.containsKey(copy[i]))
                {
                    map.put(copy[i],rank);
                    rank++;
                }
            }

            for(int i = 0; i<arr.length ; i++)
            {
                arr[i]=map.get(arr[i]);
            }
        
        return arr;
        
    }
}

// copy = [5,9,12,12,28,37,56,81,100]