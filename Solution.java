import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution {
   
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int n = scan.nextInt(); 
      scan.close();
      String ans="";
          
      // if 'n' is NOT evenly divisible by 2 (i.e.: n is odd)
      if(n%2==1){
         ans = "Weird";
      }
       if( n>=2 )
         {
            ans="Not Weird";   
         }
       if(n<= 20 && n>= 6)
         {
            ans="Weird";    
         }
        if(n >= 21)
         { 
            ans="Not Weird";    
         }
      
      System.out.println(ans);
      System.out.println("Hello");
   }
}