class Solution {
    public boolean checkIfPangram(String sentence) {

        HashSet<Character> set = new HashSet<>();

        for(int i= 0; i< sentence.length();i++)
        {
            char c = sentence.charAt(i);
            set.add(c);
        }
         return set.size() == 26;
        
    }
}