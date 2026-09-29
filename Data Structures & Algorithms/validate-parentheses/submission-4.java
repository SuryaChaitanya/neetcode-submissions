class Solution {
    private Character getRev(Character x) {
        switch(x) {
            case '}': return '{';
            case ']': return '[';
            case ')': return '(';
            default: return '#';
        }
    }
    public boolean isValid(String str) {
       

        Stack<Character> s = new Stack<>();
        for (char x : str.toCharArray()){
            if (x == '{' || x == '[' || x == '(') {
                s.push(x);
            }
            else {
                if (!s.isEmpty() && getRev(x).equals(s.peek())){
                    s.pop();
                }
                else
                    return false;

            }
        }
        if (s.isEmpty())
            return true;
        return false;
    }
}
