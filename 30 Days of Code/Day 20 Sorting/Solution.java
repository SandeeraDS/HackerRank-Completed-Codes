import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
       
        int count=0,temp=0;
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
      
        for(int i =0;i<n;i++){
            for(int j=1;j<(n-i);j++){
                
                if(a[j-1]>a[j]){
                    //System.out.println(++count);
                    count++;
                    temp=a[j];
                    a[j]=a[j-1];
                    a[j-1]=temp;
                    
                }
            }
        }
        
       System.out.println("Array is sorted in "+count+" swaps.");
       System.out.println("First Element: "+a[0]);
       System.out.println("Last Element: "+a[n-1]);
        
        
        
    }
}
