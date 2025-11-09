/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package package4;
import java.util.*;
import java.io.*;

/**
* Project: Project4
* Completion time: 4 hours (fill in the time it took you to write the program)
*
* Honor Code: “I pledge that I have neither given nor received help from anyone
* other than the instructor or the TAs for all program components included here.”
*/


public class Project4 {
    
    
    public static String isPalindrome(String filename) {
        LinkedList vectors = new LinkedList<MyVector>();
        MyVector mv;
        File myFile = new File(String.format("src/%s", filename));
        
        
        try {
            Scanner fileScanner = new Scanner (myFile);
            
            // This reads the first line which is the array size
            int arraySize = fileScanner.nextInt();
            
            while (fileScanner.hasNextDouble()) {
                double[] array = new double[arraySize];

                for (int i = 0; i < arraySize; i++) {
                    // Add double in each line to the primative array
                    array[i] = fileScanner.nextDouble();
                        

                }
                // Pass in primitive array to MyVector
                mv = new MyVector(array);
                
                // Add MyVector to linked list
                vectors.add(mv);
                
            }
            

        }
        
 
        catch (FileNotFoundException e) {
            System.out.println("Error: File not found!");
            
        }
        
        
        ListIterator<MyVector> startIterator = vectors.listIterator(0);
        ListIterator<MyVector> endIterator = vectors.listIterator(vectors.size());
        
        
        System.out.println(vectors.size());
        
        
        int pairsChecked = 0;
        
        while (startIterator.hasNext() && endIterator.hasPrevious()) {
            pairsChecked++;

            MyVector beginning = (MyVector) startIterator.next();
            MyVector end = (MyVector) endIterator.previous();
             
            System.out.println(beginning);
            System.out.println(end);
            
         
            if (!(beginning.equals(end))) {
                return "Not palindrome";
            }
            
            // If true, then we can break in order to not check same pairs.
            if (pairsChecked >= (vectors.size() / 2)) {
                break;
            }
            
            
               
        }
        
        return "Palindrome";
    }
    

    public static void main(String[] args) {
        
        System.out.println(isPalindrome("input3.txt"));
        
        
        
        
    }
}
