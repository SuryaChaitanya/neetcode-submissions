class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i<temperatures.length; i++) {
            int cur = temperatures[i];
            int diff = 0;
            for (int j = i+1; j<temperatures.length; j++) {
                if (temperatures[j] > cur) {
                    diff = j-i;
                    break;
                }
            }
            result.add(diff);
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
