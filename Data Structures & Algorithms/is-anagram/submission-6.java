class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> ana1 = getCharacterCountMap(s);
        Map<Character, Integer> ana2 = getCharacterCountMap(t);
        if (ana1.equals(ana2))
            return true;
        return false;

    }

    private Map<Character, Integer> getCharacterCountMap(String s){
        Map<Character, Integer> ana1 = new HashMap<>();
        for (char a:s.toCharArray()){
            if (ana1.containsKey(a)){
                int val = ana1.get(a);
                ana1.put(a,val+1);
            }
            else{
                ana1.put(a,1);
            }
        }
        return ana1;
    }
}
