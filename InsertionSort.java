package com.java;

import java.util.Scanner;

public class InsertionSort {

    /* Method/Function for insertion sorting */
    public static void insertionSort(int[] data){
        int n = data.length;

        for (int i = 1; i < n; i++){
            int k = data[i];
            int j = i - 1;

            while ((j > - 1) && (data[j] > k)){
                data[j + 1] = data[j];
                j--;

            }
            data[j + 1] = k;
        }
    }
    public static void main(String[] args) {
        int[] data;
        Scanner scan = new Scanner(System.in);

        /* Enter the size of array */
        System.out.print("Enter array: ");
        int n = scan.nextInt();
        data = new int[n];

        /* Enter the element of those array */
        System.out.print("Enter the element: ");
        for (int i = 0; i < n; i++){
            data[i] = scan.nextInt();
        }

        System.out.println("Before Insertion Sorting");

        for (int index : data){
            System.out.print(index + " ");
        }

        /* Call for insertion sort method/function */
        insertionSort(data);

        System.out.println("\nAfter Insertion Sorting");
        for (int index : data){
            System.out.print(index + " ");
        }
    }
}
