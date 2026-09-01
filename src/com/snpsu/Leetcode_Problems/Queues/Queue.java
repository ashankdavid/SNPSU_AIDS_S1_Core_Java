package com.snpsu.Leetcode_Problems.Queues;

public class Queue {
    int[] arr;
    int front;
    int back;
    int size;

    Queue(int size){
        this.size = size;
        arr = new int[size];
        front = -1;
        back = -1;
    }

    void push(int val){
        if(back==size-1){
            System.out.println("Overflown!");
            return;
        }
        back++;
        arr[back] = val;
        if(front==-1){
            front++;
        }
    }

    void pop(){
        if(front==-1 || front > back){
            System.out.println("Underflown!");
            return;
        }
        arr[front] = 0;
        front++;
    }

    int peek(){
        if(front==-1 || front > back){
            System.out.println("Underflown!");
            return -1;
        }
        return arr[front];
    }

    boolean isEmpty(){
        return (front==-1 || front>back);
    }
}
