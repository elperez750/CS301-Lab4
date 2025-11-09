/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package package4;
import java.util.*;
import java.io.*;

/**
* Project: Project4
* Completion time: 5 hours (fill in the time it took you to write the program)
*
* Honor Code: “I pledge that I have neither given nor received help from anyone
* other than the instructor or the TAs for all program components included here.”
*/


public class Project4 {
    

    public static void main(String[] args) {
        LinkedList vectors = new LinkedList<MyVector>();
        MyVector mv;

        
 
        
        File myFile = new File("src/input.txt");
        try {
            Scanner fileScanner = new Scanner (myFile);
            
            int arraySize = fileScanner.nextInt();
            
            while (fileScanner.hasNextDouble()) {
                double[] array = new double[arraySize];

                for (int i = 0; i < arraySize; i++) {
                    array[i] = fileScanner.nextDouble();
                        

                }
                mv = new MyVector(array);
                
                vectors.add(mv);
                
            }
            

        }
        
 
        catch (FileNotFoundException e) {
            System.out.println("Error: File not found!");
            
        }
        
        MyVector firstVector = (MyVector) vectors.get(0);
        System.out.println(firstVector.get(1));
        
        
        
       
        

            
   
        
        
        
        
//        MyVector v1 = new MyVector(new double[]{1.0, 2.0, 3.0});
//        MyVector v2 = new MyVector(new double[] {2.0, 4.0, 6.0});
//        MyVector v3 = new MyVector(new double[]{3.0, 6.0, 9.0});
//        
//        
//        
//        strings.add("Hello");
//        strings.add("Goodbye");
//        strings.add("I need you");
//        
//        
//        ListIterator<String> itrForwards = strings.listIterator();
//        ListIterator<String> itrBackwards = strings.listIterator(strings.size());
//        
//        
//        // Getting all elements starting with beginning of the list
//        while (itrForwards.hasNext()) {
//            System.out.println(itrForwards.next());
//            
//        }
//        
//        
//        // Getting all elements starting at the end
//        while (itrBackwards.hasPrevious()) {
//            System.out.println(itrBackwards.previous());
//            
//        }
//        
        
        
        
        
        
    }
}
