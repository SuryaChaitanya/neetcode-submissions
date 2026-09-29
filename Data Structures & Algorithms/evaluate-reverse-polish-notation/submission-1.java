class Solution {
    private boolean isOperation(String x) {
        return x.equals("+") || x.equals("-") || x.equals("*") || x.equals("/");
    }

    private Integer returnSolution (int a, int b, Character operand) {
        switch(operand) {
            case '+':
                return a+b;
            case '-':
                return a-b;
            case '*':
                return a*b;
            case '/':
                return a/b;
            default:
                return 0;
            
        }
    }
    public int evalRPN(String[] tokens) {
        
        Stack<Integer> stack = new Stack<>();
        for (String x: tokens) {
            if (isOperation(x)){
                int b = stack.pop();
                int a = stack.pop();
                stack.push(returnSolution(a,b,x.toCharArray()[0]));
            }
            else {
                stack.push(Integer.parseInt(x));
            }
        }
        return stack.peek();
    }
}
