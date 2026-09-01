package com.snpsu.DataStructure.Stack;

public class Stack {
    int[] arr;
    int top;
    int size;

    Stack(int size){
        this.size = size;
        top = -1;
        arr = new int[size];
    }

    void push(int val){
        if(top==size-1){
            System.out.println("Overflown!");
            return;
        }
        top++;
        arr[top] = val;
    }

    void pop(){
        if(top==-1){
            System.out.println("Stack Underflown!");
            return;
        }
        arr[top] = 0; // clear the memory
        top--;
    }

    int Top(){
        if(top==-1){
            System.out.println("Stack Underflown!");
            return -1;
        }
        return arr[top];
    }

    boolean isEmpty(){
        return top ==-1;
    }
}

class Driver{
    public static void main(String[] args) {
        Stack st = new Stack(5);
        st.push(11);
        st.push(4);
        st.push(2);
        st.push(34);
        st.push(23);
        System.out.println(st.Top());
        st.pop();
        st.pop();
        st.pop();
        st.pop();
        st.pop();
        System.out.println(st.Top());
    }
}
