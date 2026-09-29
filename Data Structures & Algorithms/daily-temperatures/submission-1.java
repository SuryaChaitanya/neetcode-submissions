class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];
        Stack<int[]> stack = new Stack<>(); // pair [temp, index]
        stack.push(new int[]{temperatures[0],0});
        for (int i = 1; i<temperatures.length; i++) {
            if (stack.peek()[0] > temperatures[i]){
                stack.push(new int[]{temperatures[i], i});
            }
            else{
                while(!stack.isEmpty() && stack.peek()[0] < temperatures[i]) {
                    result[stack.peek()[1]] = i-stack.peek()[1];
                    stack.pop();
                }
                stack.push(new int[]{temperatures[i],i});
            }
        }
        return result;
    }
}
