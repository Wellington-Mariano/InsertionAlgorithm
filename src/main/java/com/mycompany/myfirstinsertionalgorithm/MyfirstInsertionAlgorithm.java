/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.myfirstinsertionalgorithm;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author wellington-mariano
 */
public class MyfirstInsertionAlgorithm {

    public static void main(String[] args) {
        Scanner mySc = new Scanner(System.in);
        Random rand = new Random(); //Randomize grades
        int totStudents, i; //tot students and index
        totStudents = i = 0;
        
        System.out.println("How many students are in the class?");
        totStudents = mySc.nextInt();
        int arr[] = new int[totStudents]; //array will have same number as students number
        
        while(i < totStudents)
        {
            arr[i] = rand.nextInt(10); //assigne to each student a grade
            i++;
        }
        
        insertion(arr); //sort by grade
        System.out.println("Grades:");
        for(int arrEl : arr){
            System.out.printf("%d ",arrEl);
        }
        
        System.out.println("\n");
        System.out.printf("Biggest grade: %d\n", arr[totStudents-1]);
        System.out.printf("Smallest grade: %d", arr[0]);
    }
    
    public static void insertion(int arr[])
    {
        int n = arr.length; // example n is 5
        
        for(int i = 1; i < n; i++)
        {
            int key = arr[i]; // Second element
            int j = i - 1; // Very first element
            
            while(j >= 0 && arr[j] > key) // Comparison goes up to i - Minor element is sent to beginning of array
            {
                arr[j+1] = arr[j]; // The second element is receiving the first element
                j--; //decrement to stop the loop
            }
            
            arr[j+1] = key;
        }
        /*
        The swap is made by following this: 
        Key (Current index) value is kept within key
        If the value of index key -1 is bigger, the current index receives the bigger value
        and there is now an open space in the array (j - 1) which is then replaced with the smallest value
        if the smalles value is not yet in the right position, the empty is filled with the bigger element.
        To summarise, the empty space if filled with the smallest value in the comparisson (key)
        */
    }
}
