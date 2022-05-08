package com.Aniketstart;



 class Node{
    int data;
    Node next;
    public Node(int data){
        this.data = data;
        this.next = null;
    }
}
class Stack3{
    public Node head;
    public  boolean isEmpty(){
        return  head == null;
    }
    public void push(int data){
        Node newNode = new Node(data);
        if (isEmpty()){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode ;

    }


    public  int pop(){
        if (isEmpty()){
            return -1;
        }
        int top  = head.data;
        head = head.next;
        return top;

    }

    public int peek(){
        if (isEmpty()){
            return -1;
        }
        int top2 = head.data;
        return top2;
    }
}
public class Stack_imp_with_LinkedList {

    public static void main(String[] args) {


        Stack3 s = new Stack3();
        s.push(1);
        s.push(2);
        s.push(3);

        s.push(6);

        while (!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
