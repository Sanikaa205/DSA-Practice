class Solution {
    public String largestGoodInteger(String num) {

        String ans = "";

        for (int i = 0; i <= num.length() - 3; i++) {

            char a = num.charAt(i);
            char b = num.charAt(i + 1);
            char c = num.charAt(i + 2);

            if (a == b && b == c) {

                String new1 = num.substring(i, i + 3);

                if (ans.equals("") || ans.charAt(0) < new1.charAt(0)) {
                    ans = new1;
                }
            }
        }

        return ans;
    }
}