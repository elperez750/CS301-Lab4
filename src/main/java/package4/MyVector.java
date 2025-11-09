/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package package4;
import java.util.ArrayList;

/**
 *
 * @author elper2
 */


/**
* Project: Project1
* Completion time: ? hours (fill in the time it took you to write the program)
*
* Honor Code: “I pledge that I have neither given nor received help from anyone
* other than the instructor or the TAs for all program components included here.”
*/


public class MyVector {
      private final ArrayList<Double> initvalues;
      private static final double EPSILON = 1e-9;

    
      
    
    public MyVector (double[] initvalues){
        
        this.initvalues = new ArrayList<>(initvalues.length);
        for (double val: initvalues) {
            this.initvalues.add(val);
        }
      
          }
    
    
    public MyVector(MyVector original) {
        this.initvalues = new ArrayList<>(original.initvalues);
    }
    
    
 
    
    public int size() {
        
        return this.initvalues.size();
        
    }
    
    public double get(int index) {
        return this.initvalues.get(index);
    }
    
    
    public MyVector plus(MyVector addVector)  {
        int size = this.initvalues.size();
        
        if (size != addVector.size()) {
            throw new IllegalArgumentException("Vectors must be the same size");

            /*return ("Vectors must be same size!!");*/
        }
        
        
        
        double [] resultArray = new double[size];
        
        
        
        for (int i =0; i< size; i++) {
           resultArray[i] = this.initvalues.get(i) + addVector.get(i);
                       
        }
        
        
        MyVector resultVector = new MyVector(resultArray);
        
        return resultVector;
        
     
    }
    
    
    public MyVector sub(MyVector subVector) {
        int size = this.initvalues.size();

        if (size != subVector.size()) {
            throw new IllegalArgumentException("Vectors must be the same size");

            
        }
        
        
        
        double[] resultArray = new double[size];
        
        
        for (int i=0; i< size; i++) {
            resultArray[i] = this.initvalues.get(i) - subVector.get(i);
            
        }
        
        
        
        MyVector resultVector = new MyVector(resultArray);
        
        return resultVector;
                
        
    }
    
    
    
    public MyVector scaledBy(double scaleFactor) {
        int size = this.initvalues.size();
        
        double[] scaledArray = new double[size];
        
        for (int i = 0; i < size; i++) {
            scaledArray[i] = this.initvalues.get(i) * scaleFactor;
        }
        
        
        MyVector scaledVector = new MyVector(scaledArray);
        
        return scaledVector;
        
    }
    
    
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        
        int size = this.initvalues.size();
        for (int i =0; i < size; i++) {
            sb.append("This is value number ").append(i + 1).append(": ");
            sb.append(String.format("%.2f", initvalues.get(i)));
            
            
            if (i != size - 1) {
                sb.append(", ");
            }
             
        }
        
        sb.append("]");
        
        return sb.toString();
    }
    
    
    
    public double dot (MyVector dotVector) {
        int size = this.initvalues.size();
       
        if (size != dotVector.size()) {
            throw new IllegalArgumentException("Vectors must be the same size");

        }
        
        double dotProduct = 0;
        
      
        
        for (int i =0; i< size; i++) {
            dotProduct += (this.initvalues.get(i) * dotVector.get(i));
           
        }
        
        
        return dotProduct;
       
        
    }
    
    
    
    public double abs() {
        double dotProduct = this.dot(this);
  
        return Math.sqrt(dotProduct);
        

    }
    
    
    public boolean equals(MyVector comparisonVector) {

        
        int size = this.initvalues.size();
        
        
        
        
        if (size != comparisonVector.size()) {
            throw new IllegalArgumentException("Vectors must be the same size");
        }
        
       
        
        for (int i = 0; i < size; i++) {
            if (Math.abs(this.initvalues.get(i) - comparisonVector.get(i)) > EPSILON) {
                return false;
            }
}
        
        return true;
        
    
    }
}