package com.Aniketstart;

import java.util.*;

public class Sorting{
    public static void printarray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {

        //
        int arr[]={7,8,3,1,2};
        int arr1[]={25,56,1,3,9,65,46,7,99,13,56};

        // bubble Sort
        // TIME COMPLAXITY IS O(n^2)
       /*for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    //Swap
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        printarray(arr);*/




        //--->> Selection Sort
        // TIME COMPLEXITY IS O(n^2)
//        int smallest ;
//        for(int i=0;i<arr1.length-1;i++){
//             smallest = i;
//            for(int j=i+1;j<arr1.length;j++){
//                if (arr1[smallest]>arr1[j]){
//                    smallest = j;
//                }
//            }
//            int temp = arr1[smallest];
//            arr1[smallest]=arr1[i];
//            arr1[i] =temp;
//        }
//        printarray(arr1);



        //--->> Selection Sort
        for (int i=0;i< arr1.length;i++){
            int current = arr1[i];
            int j =i-1;
            while (j>=0 && current < arr1[j]){
                arr1[j+1] = arr1[j];
                j--;
            }
            //placement of element
            arr1[j+1] = current;
        }
        printarray(arr1);
    }
}
