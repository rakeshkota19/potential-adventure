package stacks;

import java.util.Stack;

public class LC20 {
    public boolean isValid(String s) {
        Stack<Character> charStack = new Stack<>();
        for (int i = 0 ; i < s.length() ; i++) {
            Character c = s.charAt(i);

            if (c == '(' || c == '{' || c == '[')
                charStack.push(c);
            else {
                if (charStack.isEmpty())
                    return false;

                if (c == ')' && charStack.peek() == '(')
                    charStack.pop();
                else if (c == ']' && charStack.peek() == '[')
                    charStack.pop();
                else if (c == '}' && charStack.peek() == '{')
                    charStack.pop();
                else
                    return false;
            }
        }
        return charStack.isEmpty();
    }
}
