package com.Aniketstart.Searching;


public class LinearSearch {
    static int linearSearch(int arr[],int element) {
        for (int i = 0; i < arr.length; i++) {

            if ( arr[i] == element) {
                System.out.printf("element is found at %dth index ", i);
                break;
            }else {
                System.out.println();
                System.out.printf("element is found at %dth index",i);
            }
        }return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1,23,4,5,6,7,6,7,889,41};
        linearSearch(arr,889);
    }
}
