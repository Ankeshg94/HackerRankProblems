package com.ankesh.learning.DataStructures.LiknedList;


import java.util.*;
import java.util.stream.IntStream;

public class Test {
    String name = "";
    static void insertionSort(int arr[], int n) {
        //code here
        for (int i = 1; i < n; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j - 1] > arr[j]) {
                    int curr = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = curr;
                }
            }
        }

        for(int i=0; i<n; i++ ){
            System.out.println(arr[i] + " ");
        }
    }

    static boolean isPrime(int number){
       boolean isPrime = true;
       if(number == 0 || number == 1){
           return false;
       }
        int root = (int) Math.sqrt(number);
        for(int i=2; i<=root; i++){
            if(number%i==0){
                System.out.println("=====" +i);
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    static void printPrimeNumbersInRange(int lower, int upper){

        boolean[] primeNumbersArray = new boolean[upper+1];
        primeNumbersArray[0] = false;
        primeNumbersArray[1] = false;
        primeNumbersArray[2] = true;

        for(int i=3; i<primeNumbersArray.length; i=i+2){
            primeNumbersArray[i] = true;
        }

        for(int i=3; i< Math.sqrt(upper); i=i+2){

            for(int j=i*i; j<=upper; j+=2*i){
                primeNumbersArray[j] = false;
            }

        }

        IntStream.range(lower, upper+1)
                .forEach(index-> {
                    if(primeNumbersArray[index]){
                        System.out.println(index + " ");
                    }
                });

    }

    static void change(Test t){
        t.name = "nitesh";
    }



    public static void main(String[] args) {
//        int[] arr = {24,18,38,43, 14, 40, 1, 54};
//        insertionSort(arr, 8);
        //System.out.println(isPrime(78767));
        //printPrimeNumbersInRange(0,2);
        Test t = new Test();

        System.out.println(isPrime(2));
        t.name = "ankesh";
//
//        change(t);
//        System.out.println("name ==" + t.name);


//        MyLiknedList list = new MyLiknedList();
//        list.add(2);
//        list.add(2);
//        list.add(7);
//        list.add(8);
//        list.removeDuplicates(list.head);
//        list.printList();
    }
}