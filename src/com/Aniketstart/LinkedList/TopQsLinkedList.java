package com.Aniketstart.LinkedList;


class Linkedlist {
    Node head;


    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    //** Q1  (funtion)
    public Node removeNthFromEnd(Node head , int n){
        int size = 0;


        Node curr = head;
        while (curr != null){
            curr = curr.next;
            size++;
        }
        int dfs = size -n +1;
        int prev = size - n;
        Node pre = head;
        for (int i=1;i<prev;i++){
            pre = pre.next;
        }
        pre.next = pre.next.next;
        return head;
    }

}
public class TopQsLinkedList {
    public static void main(String[] args) {


        //********* Q1     find the nth Node from Last  and delete it.....




    }
}
