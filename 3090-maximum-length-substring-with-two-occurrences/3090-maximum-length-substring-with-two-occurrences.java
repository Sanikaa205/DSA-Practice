class Solution {
    public int maximumLengthSubstring(String s) {

        int ans = 0;

        for(int i = 0; i< s.length();i++)
        {
            HashMap<Character , Integer> map = new HashMap<>();

            for(int j = i ; j< s.length();j++)
            {
                char ch = s.charAt(j);
                if(map.containsKey(ch))
                {
                    map.put(ch ,map.get(ch)+1);
                }
                else{
                    map.put(ch,1);
                }

                if(map.get(ch) > 2)
                {
                    break;
                }

                ans =Math.max(ans,j-i+1);
            }
        }
        return ans;
    }
}