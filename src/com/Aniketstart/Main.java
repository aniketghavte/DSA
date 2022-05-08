package com.Aniketstart;


import java.util.Arrays;

public class Main {
    public static void sum (int[] arr){
        int sum =0;

        for(int i=0; i<arr.length ; i++){
            sum = sum +arr[i];
        }System.out.println("sum of all arrays "+sum);

    }


    public static void main(String[] args) {

        int arr[] ={1,2,4,6,9};
        sum(arr);


    }
}
