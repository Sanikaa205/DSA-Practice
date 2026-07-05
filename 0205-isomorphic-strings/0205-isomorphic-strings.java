class Solution {
    public boolean isIsomorphic(String s, String t) {
        for (int i = 0; i < s.length(); i++) {
            
            if (s.indexOf(s.charAt(i)) != t.indexOf(t.charAt(i)) || s.lastIndexOf(s.charAt(i)) != t.lastIndexOf(t.charAt(i)))
            {
                return false;
            }
        }
        return true;
    }
}

// DRY RUN
// s = "paper", t = "title"

// i=0 -> p,t -> first:0=0 last:2=2 ✔
// i=1 -> a,i -> first:1=1 last:1=1 ✔
// i=2 -> p,t -> first:0=0 last:2=2 ✔
// i=3 -> e,l -> first:3=3 last:3=3 ✔
// i=4 -> r,e -> first:4=4 last:4=4 ✔

// All first & last occurrence patterns match.
// Loop ends -> return true.

//indexOf() → "At what index does this character first appear?"
//lastIndexOf() → "At what index does this character last appear?"