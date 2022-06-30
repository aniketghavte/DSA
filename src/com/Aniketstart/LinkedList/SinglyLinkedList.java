package com.Aniketstart.LinkedList;




class ll{
    Node head;


    class Node{
        String data ;
        Node next ;

        Node(String data){
            this.data =data;
            this.next = null;
        }
    }



    //***** insert function
    public void insert(String data,int index){
        Node newnode = new Node(data);
        if (index ==0){
            newnode.next = head;
            head = newnode;
            return;
        }
        Node curr = head;
        for (int i=0;i<index-1;i++){
            curr = curr.next;
        }
        newnode.next = curr.next;
        curr.next = newnode;
    }



    // ****add-First
    void addFirst(String data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;

    }


    //***** add-last
    public void addlast(String data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null){
            currNode =currNode.next;
        }
        currNode.next = newNode;
    }



    //**** Print list
    public void printlist(){

//        if (head ==null){
//            System.out.println("list is empty");
//            return;
//        }
        Node currNode = head;
        while (currNode != null){
            System.out.print(currNode.data + "->");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }

    public void push(String new_data)
    {
    /* 1 & 2: Allocate the Node &
              Put in the data*/
        ll.Node new_node = new ll.Node(new_data);

        /* 3. Make next of new Node as head */
        new_node.next = head;

        /* 4. Move the head to point to new Node */
        head = new_node;
    }


    public void delete(int index){
        if (index ==0){
            head = head.next;
            return;
        }
        Node currnode = head;
        for (int i=0 ;i<index-1;i++){
            currnode = currnode.next;
        }
        currnode.next = currnode.next.next;
    }

    public void reverseIterate(){
        if (head == null || head.next == null){
            return;
        }
        Node prevNode = null;
        Node currNode = head;
        while (currNode != null){
            Node nextNode = currNode.next;
            currNode.next = prevNode; // Pointing backwords


            // Updating currNode and Previous Node
            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prevNode;


    }


}




public class SinglyLinkedList {


    public static void main(String[] args) {

        ll list = new ll();
        list.addFirst("aniket");
        list.addFirst("Ghavte");
        list.addlast("Kailas");
        list.insert("FD38",2);
        list.delete(2);

        list.printlist();

        list.reverseIterate();
        list.printlist();






    }
}
