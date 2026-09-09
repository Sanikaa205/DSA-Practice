class Solution {
    public long countCommas(long n) {

        long totalcommas = 0;
        long i = 1000;
        while(i <= n)
        {
            totalcommas = totalcommas + n - i + 1; //this is used to find numbers between range
            i = i*1000; // this is for "A comma is inserted after every three digits from the right."
        }
        return totalcommas;
        
        
    }
}