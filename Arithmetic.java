import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Arithmetic {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble(); // original meal price
        int tipPercent = scan.nextInt(); // tip percentage
        int taxPercent = scan.nextInt(); // tax percentage
        scan.close();
      
        double tipPercent1= tipPercent;
        double taxPercent1= taxPercent;
        // Write your calculation code here.
       tipPercent1=(double) (mealCost *  tipPercent/100);
       taxPercent1=(double) (mealCost * taxPercent/100);
       mealCost=mealCost+tipPercent1+taxPercent1;
        // cast the result of the rounding operation to an int and save it as totalCost 
        int totalCost =  (int) Math.round(mealCost); 
      
        // Print your result
        System.out.println("The total meal cost is "+totalCost+" dollars");
    }
}
