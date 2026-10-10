class Solution {
    public int lengthOfLongestSubstring(String s) {
        //System.out.println(s.charAt(s.length()-1));
        HashSet<Character> charSet = new HashSet<>();
        int l = 0;
        int r = 0;
        int maxLength = 0;
        while (r < s.length()) {
            while (charSet.contains(s.charAt(r))){
                charSet.remove(s.charAt(l));
                l++;
            }
            charSet.add(s.charAt(r));
            maxLength = Math.max (maxLength, r-l+1);
            r++;
        }
        return maxLength;
    }
}
