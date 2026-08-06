class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {

        HashMap<String , Integer> map = new HashMap<>();
        ArrayList<String> ans = new ArrayList<>();

        String words[] = s1.split(" ");
        for(String word: words)
        {
            if(map.containsKey(word))
            {
                map.put(word,map.get(word)+1);
            }
            else{
                map.put(word,1);
            }
        }

        String words1[] = s2.split(" ");
        for(String word: words1)
        {
            if(map.containsKey(word))
            {
                map.put(word,map.get(word)+1);
            }
            else{
                map.put(word,1);
            }
        } 

        for(String key : map.keySet())
        {
            if(map.get(key) == 1)
            {
                ans.add(key);
            }
        }

        String result[] = new String[ans.size()];
        for(int i =0 ; i< ans.size();i++)
        {
            result[i]=ans.get(i);
        }

        return result;

    }
}