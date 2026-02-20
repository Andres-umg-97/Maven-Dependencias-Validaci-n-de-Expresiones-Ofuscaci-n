package umg.edu.gt.data_structure.stack.manual;

import stackHandler.handler.MyStack;

public class SymbolValidator {

    public static boolean isValid(String expression) {

        MyStack stack = new MyStack();

        for (char c : expression.toCharArray()) {

            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            }

            if (c == ')' || c == ']' || c == '}') {

                if (stack.isEmpty()) return false;

                char open = stack.pop();

                if (!isMatching(open, c)) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    private static boolean isMatching(char open, char close) {
        return (open == '(' && close == ')') ||
               (open == '[' && close == ']') ||
               (open == '{' && close == '}');
    }
}
