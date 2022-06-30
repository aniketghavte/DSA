package com.Aniketstart;

public class Recursion {

    //qs 1 Print numbers from 5 to 1
    public static void printNum(int n){
        if(n ==0){
            return;
        }
        System.out.println(n);
        printNum(n-1);
    }



    //qs2 print numbers form 1 to 5
    public static void printNumb(int n){
        if (n == 6){
            return;
        }
        System.out.println(n);
        printNumb(n+1);
    }


    //qs3 print the sum of first n natural numbers

    public static void printSum(int n , int sum){
        if (n == 0){
            System.out.println(sum);
            return;
        }
        sum += n;
        printSum(n-1,sum);
    }


    //qs4 print factorial of a number n

    public static void pritnFactorial(int n,int fact){
        if (n==0){
            System.out.println(fact);
            return;
        }
        fact += n;
        pritnFactorial(n-1,fact);
    }

    // qs5 print fibonacci series
    public static void printFibonacci(int a,int b,int n){
        if (n==0){
            return;
        }
        System.out.println(a);
        printFibonacci(b,a+b,n-1);
    }
    public static void main(String[] args) {

        printFibonacci(0,1,10);
    }
}
