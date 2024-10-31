import java.util.Stack;

public class Stacks {

    // You are given a string s consisting of the following characters: '(', ')', '{', '}', '[' and ']'.
    // The input string s is valid if and only if:
    // Every open bracket is closed by the same type of close bracket.
    // Open brackets are closed in the correct order.
    // Every close bracket has a corresponding open bracket of the same type.
    // Return true if s is a valid string, and false otherwise.

    public boolean isValid(String s) {
        Stack<Character> x = new Stack<>();
        for(char c : s.toCharArray()) {
            if(c == '(' || c == '{' || c == '[') {
                x.push(c);
            } else {
                if(x.isEmpty()) {
                    return false;
                }
                char top = x.pop();
                if((c == ')' && top != '(') || (c == '}'&& top != '{') || (c == ']' && top != '[')) {
                    return false;
                }
            }
        }
        return x.isEmpty();
    }


}
