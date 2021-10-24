package com.ankesh.learning;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class RotateMatrix {

    public static void rotate(ArrayList<ArrayList<Integer>> a) {
        for(int j=0; j<a.get(0).size(); j++){
            for(int i=a.size()-1; i>0; i-- ){
                Integer temp = a.get(i).get(j);
                a.get(i).set(j,a.get(i-1).get(j));
                a.get(i-1).set(j,temp);
            }
        }
        System.out.println("");
    }

    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        ArrayList<Integer> arr1 =new ArrayList<>();
        arr1.add(1);
        arr1.add(3);
        arr1.add(10);
        ArrayList<Integer> arr2 =new ArrayList<>();
        arr2.add(3);
        arr2.add(4);
        arr2.add(9);
        ArrayList<Integer> arr3 =new ArrayList<>();
        arr3.add(89);
        arr3.add(0);
        arr3.add(12);

        arr.add(arr1);
        arr.add(arr2);
        arr.add(arr3);

        rotate(arr);

    }


}
