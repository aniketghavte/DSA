package com.Aniketstart;


public class BinarySearch {
    static int binarySearch(int arr[],int size,int element){
        int low = 0;
        int mid=0;
        int high = size-1;

        while (low<=high){
            mid =(low+high)/2;
            if (arr[mid] == element){
                System.out.printf("element is found at %dth index",mid);
                return mid;
            }
            if (arr[mid]<element){
            low = mid-1;
            }else {
                high= mid-1;
            }
        }return -1;
    }
    public static void main(String[] args) {
        int arr[]={1,22,33,44,55,66,77,88,122,233,359,467};
        binarySearch(arr,12,359);

    }
}
