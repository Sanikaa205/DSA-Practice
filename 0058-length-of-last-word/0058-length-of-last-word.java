class Solution {
    public int lengthOfLastWord(String s) {
        int length = 0;
        int i = s.length()-1 ;
        
        while(i >= 0 && s.charAt(i) == ' ') //this will skips last spaces
        {
            i--;
        }
        //here we got new i 

        int count = 0;

        while(i >= 0 && s.charAt(i) != ' ')
        {
            count++;
            i--;
        }

       return count;
    }
}