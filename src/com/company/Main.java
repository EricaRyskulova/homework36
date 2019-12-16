package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        ArrayList<Numbers> arraylist = new ArrayList<Numbers>();
        LinkedList<Numbers> linkedlist = new LinkedList<>();
//        double [] numbers= {1,0,0,0,0,1,0,1,0,1,1};
int arr[] = {1,0,0,0,0,1,0,1,0,1,1};
for(int i=0; i<arr.length;i++ ){
//    System.out.printf("\n");
    bubbleSort(arr);
    System.out.printf(arr[i] + ".");
}
       arraylist.sort(Comparator.naturalOrder());
//        Collections.sort(arraylist);

//        int compare; double[] numbers1 = numbers;

    }

    public static void bubbleSort(int[] arr){
    for(int i = arr.length-1; i>=0; i--){
        for(int j=0; j<i; j++){
            if (arr[j]>arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }

            }
        }
    }
    }

enum Numbers{
}
