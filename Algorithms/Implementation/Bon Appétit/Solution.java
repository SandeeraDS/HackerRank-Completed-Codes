import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
       
        Scanner s = new Scanner(System.in);
        
        int items = s.nextInt();
        int notEat = s.nextInt();
        
        int[] prices = new int[items];
        for(int i=0;i<items;i++){
           
            prices[i]=s.nextInt();
        }
        
        int bill = s.nextInt();
        int sum=0;
        for(int i=0;i<items;i++){
           
           if(i!=notEat){
               sum+=prices[i];
           }
        }
        if(bill==sum/2){
            System.out.println("Bon Appetit");
        }
        else {
            System.out.println(bill-sum/2);
        }
        
    }
}
