package HomeWork;

public class Stack {
    private char[]stack;
    private int top;

    public Stack(int size){
        stack = new char[size];
        top = -1;
    }
    public void push(char c){
        if (top == stack.length -1){
            System.out.println("Stack is full");
        }else{
            stack[++top]=c;
        }
    }
    public char pop(){
        if (top < 0){
            System.out.println("Stack is empty");
            return '\0';
        }else {
            return stack[top--];
        }
    }
    public boolean isEmpty(){
        return  top == -1;
    }
}
