
class Solution {
    static boolean isBalanced(String s) {
        // code here
        Stack<Character> stack = new Stack<>();

    for (char ch : s.toCharArray()) {
        // If opening bracket, push to stack
        if (ch == '(' || ch == '{' || ch == '[') {
            stack.push(ch);
        }
        // If closing bracket, check for matching opening bracket
        else if (ch == ')' || ch == '}' || ch == ']') {
            if (stack.isEmpty()) return false;

            char top = stack.pop();
            if (! isMatchingPair(top, ch)) return false;
        }
    }

    // If stack is empty, all brackets were matched
    return stack.isEmpty();
    }
    
     static boolean isMatchingPair(char open, char close) {
        return (open == '(' && close == ')') ||
               (open == '{' && close == '}') ||
               (open == '[' && close == ']');
    }
}
