/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package centraltendancy;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;


/**
 *
 * @author Trevor
 */
public class CentralTendancy {
    
    static Scanner answer = new Scanner(System.in);
    static String choice;
    static Random random = new Random();
    static int[] intArray = new int[600];
    static float mean;
    static int mode;
    static int median;
    static int range;
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Generate dataset? y/n");
        choice = answer.nextLine();
        if(choice.equals("y"))
        {
    
for (int i = 0; i < intArray.length; i++) {
    
    intArray[i] = random.nextInt(2500);
}
            
        }else
        {
            
        }
        Arrays.sort(intArray);
        mean = (IntStream.of(intArray).sum())/(intArray.length);
        if((intArray.length/2)%2 != 0){
          median = (intArray[intArray.length/2] + intArray[(intArray.length/2) - 1])/2;
        }else
        {
           median = intArray[intArray.length/2];
        }
     
        
   int maxCount = 0;

    for (int i = 0; i < intArray.length; i++) {
        int count = 0;
        for (int j = 0; j < intArray.length; j++) {
            if (intArray[j] == intArray[i]) count++;
        }
        if (count > maxCount) {
            maxCount = count;
            mode = intArray[i];
        }
    }


        
           System.out.println(Arrays.toString(intArray));
           System.out.println("Mean: " + mean);
           System.out.println("Median: " + median);
           System.out.println("Range: " + intArray[0] + " to " + intArray[intArray.length - 1]);
           System.out.println("Mode: " + mode);
           
           
           
           
           
           
            }

    
}
