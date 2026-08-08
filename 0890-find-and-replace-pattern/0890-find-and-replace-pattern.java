class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {

        List<String> ans = new ArrayList<>();

        for(String word: words)
        {
            if(word.length() != pattern.length()) continue;
            HashMap< Character , Character> map1 = new HashMap<>();
            HashMap< Character , Character> map2 = new HashMap<>();

            boolean match = true;

            for(int i = 0; i< pattern.length();i++)
            {
                char ch1 = word.charAt(i);
                char ch2 = pattern.charAt(i);

                if(map1.containsKey(ch1))
                {
                    if(map1.get(ch1) != ch2) {
                        match = false;
                        break;
                    }

                }

                if(map2.containsKey(ch2))
                {
                    if(map2.get(ch2) != ch1) {
                        match = false;
                        break;
                    }

                }

                map1.put(ch1,ch2);
                map2.put(ch2,ch1);
            }

            if(match)
            {
                ans.add(word);
            }
        }
        return ans;
        
    }
}