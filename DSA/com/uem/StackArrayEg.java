package com.uem;

public class StackArrayEg {

    int top;
    int[] stack;
    int size;

    public StackArrayEg(int size) {
        this.size = size;
        stack = new int[size];
        top = -1;
    }

    public void push(int val) {
        if (top == size - 1) {
            System.out.println("Cannot push due to overflow");
            return;
        }
        stack[++top] = val;
    }

    public int pop() {
        if (top == -1) {
            System.out.println("Cannot pop due to underflow");
            return -1;
        }
        return stack[top--];
    }

 
    public int peek() {
        if (top == -1) {
            System.out.println("Stack is empty, nothing to peek");
            return -1;
        }
        return stack[top];
    }

    public static void main(String[] args) {
        StackArrayEg s = new StackArrayEg(10);

        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        s.push(60); 
        s.push(70);
        s.push(80);
        s.push(90);
        s.push(100);

        // printing stack
        for (int i = 0; i <= s.top; i++) {
            System.out.println(s.stack[i]);
        }

        System.out.println("Peek : " + s.peek());

        System.out.println("Popping : " + s.pop());
        System.out.println("Popping : " + s.pop());
        System.out.println("Popping : " + s.pop());

        System.out.println("Peek after pop : " + s.peek());
    }
}
