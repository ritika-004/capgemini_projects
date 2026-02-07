package com.uem;


public class BalancedParenthesis {

    char[] stack;
    int top = -1;

    public BalancedParenthesis(int size) {
        stack = new char[size];
    }

    void push(char ch) {
        stack[++top] = ch;
    }

    char pop() {
        return stack[top--];
    }

    boolean isEmpty() {
        return top == -1;
    }

    boolean isMatching(char open, char close) {
        if (open == '(' && close == ')') return true;
        if (open == '{' && close == '}') return true;
        if (open == '[' && close == ']') return true;
        return false;
    }

    boolean isBalanced(String exp) {
        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);

            // Opening brackets
            if (ch == '(' || ch == '{' || ch == '[') {
                push(ch);
            }
            // Closing brackets
            else if (ch == ')' || ch == '}' || ch == ']') {
                if (isEmpty()) return false;

                char open = pop();
                if (!isMatching(open, ch))
                    return false;
            }
        }
        return isEmpty();
    }

    public static void main(String[] args) {
        String exp = "{[()]}";
        String exp2 = "{[(})]}";

        BalancedParenthesis bp = new BalancedParenthesis(exp.length());

        if (bp.isBalanced(exp))
            System.out.println("Balanced Parenthesis");
        else
            System.out.println("Not Balanced Parenthesis");
        
        if (bp.isBalanced(exp2))
            System.out.println("Balanced Parenthesis");
        else
            System.out.println("Not Balanced Parenthesis");
    }
}
