package com.Aniketstart.Stack;

import java.util.ArrayList;

class Stack2{
    ArrayList<Integer> list = new ArrayList<>();

    public boolean isEmpty(){
        return list.size() == 0;
    }

    public void push(int data){
        list.add(data);
    }

    public int pop(){
        int top = list.get(list.size() -1);
        list.remove(list.size()-1);
        return top;
    }

    public int peek(){
        if(isEmpty()){
            return -1;
        }
        return list.get(list.size()-1);
    }
}

public class Stack_imp_with_ArrayList {
    public static void main(String[] args) {


        Stack2 s = new Stack2();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.pop();


        while (!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
