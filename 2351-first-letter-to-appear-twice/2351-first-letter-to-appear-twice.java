class Solution {
    public char repeatedCharacter(String s) {

        HashSet <Character> seen = new HashSet<>();
        
        for(int i=0 ; i< s.length() ; i++)
        {
            char ch = s.charAt(i);
            if(seen.contains(ch))
            {
                return ch;
            }
            seen.add(ch);
        }
        return ' ';
}
}