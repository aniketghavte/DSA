package com.Aniketstart.Arrays;

class RotateArray {
    public static void main(String[] args) {
        int arr[] ={1,2,3,4,5,6};
        int start=2;
        int end = 5;

        System.out.println(arr.length );
        for (int i=start;i<end;i++){
            int temp = arr[i];
            arr[i] =arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;
            end--;
        }
        for (int i=0 ;i< arr.length; i++){
            System.out.println("Element at "+i+ " "+ arr[i]);
        }
    }

}


