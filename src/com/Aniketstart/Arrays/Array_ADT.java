package com.Aniketstart.Arrays;

import java.util.Arrays;

class student{
    String name;
    int roll_no;
    public student(String name,int roll_no) {
        this.name = name;
        this.roll_no = roll_no;
    }
//    int roll_no;
//    String name;
//    public student(String name,int roll_no){
//        this.name =name;
//        this.roll_no =roll_no;
//    }
}

public class Array_ADT {

    public static void main(String[] args) {

//        int arr1[] = new int[]{451,4,5216,7545,6,723,454};
//        Arrays.stream(arr1).sorted();
//
//        for (int i=0 ;i< arr1.length; i++){
//            System.out.println("Element at "+i+ " "+ arr1[i]);
//        }
//
//
        student[] arr = new student[8];

        arr[0]= new student("aniket",1);
        arr[1]= new student("sanket",2);
        arr[2]= new student("harry",3);
        arr[3]= new student("rohit",4);
        arr[4]= new student("peter",5);
        arr[5]= new student("parker",6);
        arr[6]= new student("tony",7);
        arr[7]= new student("ay",7);

        Arrays.stream(arr).sorted();



        for (int i=0 ;i< arr.length; i++){
            System.out.println("Element at "+i+ " "+ arr[i].roll_no+" "+arr[i].name);
        }

//        ArrayList<Integer> arr3 = new ArrayList<>(4);
//        arr3.add(0,45);
//        arr3.add(1,55);
//        arr3.add(2,5);
//        arr3.add(3,15);
//        arr3.add(4,25);
//        arr3.add(5,455);
//        arr3.add(5,455);
//
//        arr3.add(1,54);
//
//        arr3.remove(0);
//        //Collections.sort(arr3);
//
////        System.out.println(arr3.);
//        for (int ele: arr3 ) {
//            System.out.println(ele);
//        }
//        System.out.println(arr3.indexOf(45));
//


    }
}
