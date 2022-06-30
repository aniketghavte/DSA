package com.Aniketstart.LinkedList;

class CLL{
    Node head;
    class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = head;
        }
    }

    public void addFirst(int data){
        Node newnode = new Node(data);
        if (head == null){
            head = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;
    }

    public void print(){
        if (head == null){
            System.out.println("list is Empty");
        }
        Node curr = head;
        while (curr.next != null){
            System.out.print(curr.data+"-->");
            curr = curr.next;
        }
        System.out.println(curr.data);
    }
}

public class CircularLinkedList {
    public static void main(String[] args) {

       CLL list = new CLL();
       list.addFirst(12);
       list.addFirst(11);
       list.addFirst(10);
       list.addFirst(9);

       list.print();
    }
}
