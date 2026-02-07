package com.uem;


import java.util.Stack;

public class PostfixEvaluation {

    
    public static int evaluatePostfix(String expr) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < expr.length(); i++) {
            char ch = expr.charAt(i);

            // If operand, push to stack
            if (Character.isDigit(ch)) {
                stack.push(ch - '0'); //char--> int
            } 
            // If operator, pop two operands and apply
            else {
                int val2 = stack.pop();
                int val1 = stack.pop();

                switch (ch) {
                    case '+':
                        stack.push(val1 + val2);
                        break;
                    case '-':
                        stack.push(val1 - val2);
                        break;
                    case '*':
                        stack.push(val1 * val2);
                        break;
                    case '/':
                        stack.push(val1 / val2);
                        break;
                }
            }
        }

        
        return stack.pop();
    }

    public static void main(String[] args) {
        String expr = "231*+9-"; // Example: 2 + 3*1 - 9
        int result = evaluatePostfix(expr);
        System.out.println("Result of postfix expression " + expr + " = " + result);
    }
}
