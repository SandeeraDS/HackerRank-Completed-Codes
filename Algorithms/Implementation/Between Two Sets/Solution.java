import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int getTotalX(int[] a, int[] b) {
       
        int min=1000,max=0,countAll=0;
        //find minimum of array b;
        for(int i=0;i<b.length;i++){
            if(min>b[i]){
                min=b[i];
            }
        }
        
         for(int i=0;i<a.length;i++){
            if(max<a[i]){
                max=a[i];
            }
        }
        
        for(int i=max;i<=min;i++){
          int count=0;  
            for(int j=0;j<a.length;j++){
                if(i%a[j]!=0){
                    count=1;
                    break;
                }
            }
            if(count==0)
            {
                int countB=0;
                
                for(int k=0;k<b.length;k++){
                    
                    if(b[k]%i!=0){
                        countB=1;
                        break;
                    }
                }
                
                if(countB==0){
                    countAll++;
                }
            }
           
        }
        
      return countAll;  
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        for(int a_i = 0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] b = new int[m];
        for(int b_i = 0; b_i < m; b_i++){
            b[b_i] = in.nextInt();
        }
        int total = getTotalX(a, b);
        System.out.println(total);
        in.close();
    }
}
